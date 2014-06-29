/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.validation

import java.util.ArrayList
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.Asignacion
import org.xtext.example.mydsl.myDsl.Aula
import org.xtext.example.mydsl.myDsl.Horario
import org.xtext.example.mydsl.myDsl.Materia
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.Planificacion
import org.xtext.example.mydsl.myDsl.Profesor

import static org.xtext.example.mydsl.myDsl.Dedicacion.*

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
 
class MyDslValidator extends AbstractMyDslValidator {
    
// chequeo de dedicacion del profesor
	@Check
	def checkDedicacion(Materia m) {
		val profesor = m.dictadaPor
		val model = m.eContainer as Model
		val materias = model.clases.filter(Materia)
		if(cantidadDeVeces(profesor,materias) > profesor.cantidadDeMateriasPorDedicacion){
			error("El Profesor: " +profesor.name+" tiene asignadas mas materias de las que puede dictar"
			,m,MyDslPackage.Literals.MATERIA__DICTADA_POR)
		}
	}
	
	private def cantidadDeVeces(Profesor profesor, Iterable<Materia> list) {
		val cant = list.filter [materia | materia.dictadaPor.equals(profesor)]
		return cant.size
	}
	
	private def cantidadDeMateriasPorDedicacion(Profesor p){
		switch p.dedicacion{
			case SIMPLE: return 1
			case SEMI: return 2
			case EXCLUSIVA: return 5
			default:
				 throw new RuntimeException("El profesor: "+ p.name+ " no tiene una dedicacion asignada")
		}
	}
	
// chequeo de materias asignadas
	@Check
	def checkMateriasAsignadas(Planificacion p){
		val materias = p.materias
		val asignaciones = p.asignaciones
		val expresionBooleana = materias.forall[materia | materia.perteneceAAlgunaAsignacion(asignaciones)]
		if(! expresionBooleana){
			error("Hay materias sin asignar",p,MyDslPackage.Literals.PLANIFICACION__MATERIAS)
		}
	}
	
	private def  perteneceAAlgunaAsignacion(Materia materia, EList<Asignacion> list){
		return list.exists[asignacion | 
			asignacion.horarios.exists[horario | horario.materia.equals(materia)]]
	}
	
// chequeo de carga horaria de materia con dias asignados
	@Check
	def checkCargaHorariaDeMateria(Planificacion p){
		val materias = p.materias
		materias.forEach[materia | materia.chequearHorarios(p)]		
	}
	
// NOTA: paso por parametro la planificacion para poder marcar el error en la planificacion!!!
	private def void chequearHorarios(Materia materia, Planificacion p){
		
		val asignaciones = p.asignaciones
		val asignacionesDeMateria = materia.asignacionesConMateria(asignaciones)
		var cargaHorariaDeMateria =  asignacionesDeMateria.obtenerCargaDeMateria(materia)
		var cantidadDeDiasDeMateria = asignacionesDeMateria.diasDeMateria(materia)
		
		if ( !( (cargaHorariaDeMateria == materia.cargaHoraria) && 
					(cantidadDeDiasDeMateria == materia.cantidadDeDias))){
			error("La materia: "+materia.name+" No cumple con la carga horaria o con la cantidad De Dias ",
				p,MyDslPackage.Literals.PLANIFICACION__ANIO
			)
		}
	}
	
	private def obtenerCargaDeMateria(Iterable<Asignacion>asignacionesDeMateria, Materia m){
		
		val horariosDeAsignaciones = asignacionesDeMateria.map[asignacion | asignacion.horarios]	
		val cargaHoraria = horariosDeAsignaciones.obtenerHorariosDeMateria(m).cargaHorariaDeMateria()
		
		return cargaHoraria
	}
	
	private def diasDeMateria(Iterable<Asignacion> asignacionesDeMateria, Materia m){
		
	    val cantidadDeDias= asignacionesDeMateria.map[asignacion | asignacion.dia]
	    return cantidadDeDias.size
	}
	
	private def cargaHorariaDeMateria(Iterable<Iterable<Horario>> listaDeHorarios){
		var cargaHoraria = 0
		for(h : listaDeHorarios){
			cargaHoraria += h.get(0).obtenerCargaDeMateria()
		}
		return cargaHoraria
	}
	
	private def obtenerCargaDeMateria(Horario h){
		return  h.horarioFin - h.horarioInicio 
	}
	
	private def obtenerHorariosDeMateria(Iterable<EList<Horario>> h, Materia m){
		return h.map[horarios | horarios.obtenerHorasConMateria(m)]
	}
	
	private def obtenerHorasConMateria(EList<Horario> h, Materia m){
		return h.filter[horario | horario.materia.equals(m)]
	}
	
	private def asignacionesConMateria(Materia m,EList<Asignacion> asignaciones){
		return asignaciones.filter[asignacion | asignacion.contieneAMateria(m)]
	}
	
	private def  boolean contieneAMateria(Asignacion asignacion, Materia m){
		return asignacion.horarios.exists[horario | horario.materia.equals(m)]
	}
	
	
	
// chequeo de compatibilidad de aula y materia
	@Check
	def recursosSatisfechos(Horario horario){
		val recursosAsignados = horario.aula.recursos
		val recursosMateria = horario.materia.recursos

		if(!recursosAsignados.containsAll(recursosMateria)){
			error("El aula: " +horario.aula.name+" no tiene las recursos necesarios"
			,horario,MyDslPackage.Literals.HORARIO__MATERIA)
		}
	}

//Check del primer Bonus (inscritos caben en aula)	
	@Check
	def inscriptosCabenEnAula2(Horario h){
		if (h.aula.capacidad < h.materia.cantidadDeInscriptos){
			error("La cantidad de inscriptos de la materia: "+h.materia.name+
			" supera la capacidad del aula: "+h.aula.name,h,MyDslPackage.Literals.HORARIO__AULA)
		}
	}
			
}

