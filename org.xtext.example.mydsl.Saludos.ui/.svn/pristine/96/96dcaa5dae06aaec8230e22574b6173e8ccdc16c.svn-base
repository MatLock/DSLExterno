package org.uqbar.paco.dsl.xtext.saludos.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Alguien;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Bienvenida;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Despedida;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.Model;
import org.uqbar.paco.dsl.xtext.saludos.saludosDSL.SaludosDSLPackage;
import org.uqbar.paco.dsl.xtext.saludos.services.SaludosDSLGrammarAccess;

@SuppressWarnings("all")
public class SaludosDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SaludosDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SaludosDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SaludosDSLPackage.ALGUIEN:
				if(context == grammarAccess.getAlguienRule()) {
					sequence_Alguien(context, (Alguien) semanticObject); 
					return; 
				}
				else break;
			case SaludosDSLPackage.BIENVENIDA:
				if(context == grammarAccess.getBienvenidaRule() ||
				   context == grammarAccess.getSaludoRule()) {
					sequence_Bienvenida(context, (Bienvenida) semanticObject); 
					return; 
				}
				else break;
			case SaludosDSLPackage.DESPEDIDA:
				if(context == grammarAccess.getDespedidaRule() ||
				   context == grammarAccess.getSaludoRule()) {
					sequence_Despedida(context, (Despedida) semanticObject); 
					return; 
				}
				else break;
			case SaludosDSLPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Alguien(EObject context, Alguien semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SaludosDSLPackage.Literals.ALGUIEN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SaludosDSLPackage.Literals.ALGUIEN__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlguienAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     aQuien=[Alguien|ID]
	 */
	protected void sequence_Bienvenida(EObject context, Bienvenida semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SaludosDSLPackage.Literals.SALUDO__AQUIEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SaludosDSLPackage.Literals.SALUDO__AQUIEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBienvenidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1(), semanticObject.getAQuien());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     aQuien=[Alguien|ID]
	 */
	protected void sequence_Despedida(EObject context, Despedida semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SaludosDSLPackage.Literals.SALUDO__AQUIEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SaludosDSLPackage.Literals.SALUDO__AQUIEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDespedidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1(), semanticObject.getAQuien());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (quienes+=Alguien* saludos+=Saludo*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
