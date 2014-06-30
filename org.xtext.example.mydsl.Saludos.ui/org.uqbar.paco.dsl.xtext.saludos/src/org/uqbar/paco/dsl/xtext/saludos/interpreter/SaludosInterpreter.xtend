package org.uqbar.paco.dsl.xtext.saludos.interpreter

import com.google.inject.Injector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.uqbar.paco.dsl.xtext.saludos.SaludosDSLStandaloneSetup
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model

/**
 * Interprete para saludos.
 * Simplemente parsea al modelo semantico con xtext y luego
 * procesa el Model haciendo los prints en consola.
 * 
 * @author jfernandes
 */
class SaludosInterpreter {
	
	def static void main(String[] args) {
		if (args.isEmpty) {
			throw new RuntimeException("Debe invocar este interprete con la ruta completa a un archivo .salu2 como argumento!")
		}
		val fileName = args.get(0)
		val model = parsear(fileName)
		new SaludosInterpreter().interpret(model)
	}
	
	def static parsear(String fileName) {
		val injector = new SaludosDSLStandaloneSetup().createInjectorAndDoEMFRegistration()
		val resourceSet = injector.getInstance(XtextResourceSet)
		val resource = resourceSet.createResource(URI.createURI(fileName))
		
		validate(injector, resource)
		
		resource.load(#{})
		return resource.contents.get(0) as Model
	}
	
	def static validate(Injector injector, Resource resource) {
		val validator = injector.getInstance(IResourceValidator)
		val issues = validator.validate(resource, CheckMode.ALL, null)
		if (!issues.isEmpty) {
			issues.forEach[println(it.toString)]
			System.exit(-1)
		}
	}
	
	def interpret(Model model) {
		model.saludos.forEach[s| s.imprimir]
	}
	
	def dispatch imprimir(Bienvenida saludo) {
		println('''Hola «saludo.AQuien.name» !!!''')
	}
	
	def dispatch imprimir(Despedida saludo) {
		println('''Chau «saludo.AQuien.name» !!!''')
	}

}