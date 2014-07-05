package org.xtext.example.mydsl.interpreter

import org.xtext.example.mydsl.myDsl.Aula

class Pair {
	@Property Aula aula
	@Property Integer veces
	
	new(Aula a, int i) {
		aula = a
		veces = i
	}
	
	def operator_equals(Pair b){
		aula == b.aula 
	}
}
		