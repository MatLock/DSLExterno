package org.uqbar.paco.dsl.xtext.saludos.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.uqbar.paco.dsl.xtext.saludos.services.SaludosDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaludosDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hola'", "'!'", "'Chau'", "'quien'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSaludosDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSaludosDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSaludosDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g"; }



     	private SaludosDSLGrammarAccess grammarAccess;
     	
        public InternalSaludosDSLParser(TokenStream input, SaludosDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SaludosDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_quienes_0_0= ruleAlguien ) )* ( (lv_saludos_1_0= ruleSaludo ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_quienes_0_0 = null;

        EObject lv_saludos_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:79:28: ( ( ( (lv_quienes_0_0= ruleAlguien ) )* ( (lv_saludos_1_0= ruleSaludo ) )* ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:80:1: ( ( (lv_quienes_0_0= ruleAlguien ) )* ( (lv_saludos_1_0= ruleSaludo ) )* )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:80:1: ( ( (lv_quienes_0_0= ruleAlguien ) )* ( (lv_saludos_1_0= ruleSaludo ) )* )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:80:2: ( (lv_quienes_0_0= ruleAlguien ) )* ( (lv_saludos_1_0= ruleSaludo ) )*
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:80:2: ( (lv_quienes_0_0= ruleAlguien ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:81:1: (lv_quienes_0_0= ruleAlguien )
            	    {
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:81:1: (lv_quienes_0_0= ruleAlguien )
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:82:3: lv_quienes_0_0= ruleAlguien
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getQuienesAlguienParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAlguien_in_ruleModel131);
            	    lv_quienes_0_0=ruleAlguien();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"quienes",
            	            		lv_quienes_0_0, 
            	            		"Alguien");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:98:3: ( (lv_saludos_1_0= ruleSaludo ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:99:1: (lv_saludos_1_0= ruleSaludo )
            	    {
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:99:1: (lv_saludos_1_0= ruleSaludo )
            	    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:100:3: lv_saludos_1_0= ruleSaludo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSaludosSaludoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSaludo_in_ruleModel153);
            	    lv_saludos_1_0=ruleSaludo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"saludos",
            	            		lv_saludos_1_0, 
            	            		"Saludo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSaludo"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:124:1: entryRuleSaludo returns [EObject current=null] : iv_ruleSaludo= ruleSaludo EOF ;
    public final EObject entryRuleSaludo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaludo = null;


        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:125:2: (iv_ruleSaludo= ruleSaludo EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:126:2: iv_ruleSaludo= ruleSaludo EOF
            {
             newCompositeNode(grammarAccess.getSaludoRule()); 
            pushFollow(FOLLOW_ruleSaludo_in_entryRuleSaludo190);
            iv_ruleSaludo=ruleSaludo();

            state._fsp--;

             current =iv_ruleSaludo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSaludo200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSaludo"


    // $ANTLR start "ruleSaludo"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:133:1: ruleSaludo returns [EObject current=null] : (this_Bienvenida_0= ruleBienvenida | this_Despedida_1= ruleDespedida ) ;
    public final EObject ruleSaludo() throws RecognitionException {
        EObject current = null;

        EObject this_Bienvenida_0 = null;

        EObject this_Despedida_1 = null;


         enterRule(); 
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:136:28: ( (this_Bienvenida_0= ruleBienvenida | this_Despedida_1= ruleDespedida ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:137:1: (this_Bienvenida_0= ruleBienvenida | this_Despedida_1= ruleDespedida )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:137:1: (this_Bienvenida_0= ruleBienvenida | this_Despedida_1= ruleDespedida )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:138:5: this_Bienvenida_0= ruleBienvenida
                    {
                     
                            newCompositeNode(grammarAccess.getSaludoAccess().getBienvenidaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBienvenida_in_ruleSaludo247);
                    this_Bienvenida_0=ruleBienvenida();

                    state._fsp--;

                     
                            current = this_Bienvenida_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:148:5: this_Despedida_1= ruleDespedida
                    {
                     
                            newCompositeNode(grammarAccess.getSaludoAccess().getDespedidaParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDespedida_in_ruleSaludo274);
                    this_Despedida_1=ruleDespedida();

                    state._fsp--;

                     
                            current = this_Despedida_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSaludo"


    // $ANTLR start "entryRuleBienvenida"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:164:1: entryRuleBienvenida returns [EObject current=null] : iv_ruleBienvenida= ruleBienvenida EOF ;
    public final EObject entryRuleBienvenida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBienvenida = null;


        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:165:2: (iv_ruleBienvenida= ruleBienvenida EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:166:2: iv_ruleBienvenida= ruleBienvenida EOF
            {
             newCompositeNode(grammarAccess.getBienvenidaRule()); 
            pushFollow(FOLLOW_ruleBienvenida_in_entryRuleBienvenida309);
            iv_ruleBienvenida=ruleBienvenida();

            state._fsp--;

             current =iv_ruleBienvenida; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBienvenida319); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBienvenida"


    // $ANTLR start "ruleBienvenida"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:173:1: ruleBienvenida returns [EObject current=null] : (otherlv_0= 'Hola' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleBienvenida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:176:28: ( (otherlv_0= 'Hola' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:177:1: (otherlv_0= 'Hola' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:177:1: (otherlv_0= 'Hola' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:177:3: otherlv_0= 'Hola' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleBienvenida356); 

                	newLeafNode(otherlv_0, grammarAccess.getBienvenidaAccess().getHolaKeyword_0());
                
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:181:1: ( (otherlv_1= RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:182:1: (otherlv_1= RULE_ID )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:182:1: (otherlv_1= RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:183:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBienvenidaRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBienvenida376); 

            		newLeafNode(otherlv_1, grammarAccess.getBienvenidaAccess().getAQuienAlguienCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBienvenida388); 

                	newLeafNode(otherlv_2, grammarAccess.getBienvenidaAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBienvenida"


    // $ANTLR start "entryRuleDespedida"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:206:1: entryRuleDespedida returns [EObject current=null] : iv_ruleDespedida= ruleDespedida EOF ;
    public final EObject entryRuleDespedida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDespedida = null;


        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:207:2: (iv_ruleDespedida= ruleDespedida EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:208:2: iv_ruleDespedida= ruleDespedida EOF
            {
             newCompositeNode(grammarAccess.getDespedidaRule()); 
            pushFollow(FOLLOW_ruleDespedida_in_entryRuleDespedida424);
            iv_ruleDespedida=ruleDespedida();

            state._fsp--;

             current =iv_ruleDespedida; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDespedida434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDespedida"


    // $ANTLR start "ruleDespedida"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:215:1: ruleDespedida returns [EObject current=null] : (otherlv_0= 'Chau' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleDespedida() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:218:28: ( (otherlv_0= 'Chau' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:219:1: (otherlv_0= 'Chau' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:219:1: (otherlv_0= 'Chau' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!' )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:219:3: otherlv_0= 'Chau' ( (otherlv_1= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDespedida471); 

                	newLeafNode(otherlv_0, grammarAccess.getDespedidaAccess().getChauKeyword_0());
                
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:223:1: ( (otherlv_1= RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:224:1: (otherlv_1= RULE_ID )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:224:1: (otherlv_1= RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:225:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDespedidaRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDespedida491); 

            		newLeafNode(otherlv_1, grammarAccess.getDespedidaAccess().getAQuienAlguienCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDespedida503); 

                	newLeafNode(otherlv_2, grammarAccess.getDespedidaAccess().getExclamationMarkKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDespedida"


    // $ANTLR start "entryRuleAlguien"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:248:1: entryRuleAlguien returns [EObject current=null] : iv_ruleAlguien= ruleAlguien EOF ;
    public final EObject entryRuleAlguien() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlguien = null;


        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:249:2: (iv_ruleAlguien= ruleAlguien EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:250:2: iv_ruleAlguien= ruleAlguien EOF
            {
             newCompositeNode(grammarAccess.getAlguienRule()); 
            pushFollow(FOLLOW_ruleAlguien_in_entryRuleAlguien539);
            iv_ruleAlguien=ruleAlguien();

            state._fsp--;

             current =iv_ruleAlguien; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlguien549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlguien"


    // $ANTLR start "ruleAlguien"
    // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:257:1: ruleAlguien returns [EObject current=null] : (otherlv_0= 'quien' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAlguien() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:260:28: ( (otherlv_0= 'quien' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:261:1: (otherlv_0= 'quien' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:261:1: (otherlv_0= 'quien' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:261:3: otherlv_0= 'quien' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAlguien586); 

                	newLeafNode(otherlv_0, grammarAccess.getAlguienAccess().getQuienKeyword_0());
                
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:266:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:266:1: (lv_name_1_0= RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos/src-gen/org/uqbar/paco/dsl/xtext/saludos/parser/antlr/internal/InternalSaludosDSL.g:267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlguien603); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlguienAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlguienRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlguien"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlguien_in_ruleModel131 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_ruleSaludo_in_ruleModel153 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleSaludo_in_entryRuleSaludo190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSaludo200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBienvenida_in_ruleSaludo247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDespedida_in_ruleSaludo274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBienvenida_in_entryRuleBienvenida309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBienvenida319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBienvenida356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBienvenida376 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBienvenida388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDespedida_in_entryRuleDespedida424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDespedida434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDespedida471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDespedida491 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDespedida503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlguien_in_entryRuleAlguien539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlguien549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAlguien586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlguien603 = new BitSet(new long[]{0x0000000000000002L});

}