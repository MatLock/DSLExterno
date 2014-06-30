package org.xtext.example.mydsl.interpreter

import com.google.inject.Injector
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.xtext.example.mydsl.MyDslStandaloneSetup
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.Planificacion

class DSLExternoInterpreter {
	
		
	def static void main(String[] args) {
		if (args.isEmpty) {
			throw new RuntimeException("Debe invocar este interprete con la ruta completa a un archivo .mydsl como argumento!")
		}
		val fileName = args.get(0)
		val model = parsear(fileName)
		new DSLExternoInterpreter().interpret(model)
	}
	
	def static parsear(String fileName) {
		val injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration()
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
		val list = model.clases.filter(Planificacion)
		println('''planificacion «list.get(0).anio » ''')
	}
	
}