/*
* generated by Xtext
*/
package org.uqbar.paco.dsl.xtext.saludos;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SaludosDSLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.uqbar.paco.dsl.xtext.saludos.ui.internal.SaludosDSLActivator.getInstance().getInjector("org.uqbar.paco.dsl.xtext.saludos.SaludosDSL");
	}
	
}
