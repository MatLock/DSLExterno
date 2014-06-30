package org.uqbar.paco.dsl.xtext.saludos.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.uqbar.paco.dsl.xtext.saludos.services.SaludosDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSaludosDSLParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g"; }


     
     	private SaludosDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SaludosDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:61:1: ( ruleModel EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:76:1: ( rule__Model__Group__0 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSaludo"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:88:1: entryRuleSaludo : ruleSaludo EOF ;
    public final void entryRuleSaludo() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:89:1: ( ruleSaludo EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:90:1: ruleSaludo EOF
            {
             before(grammarAccess.getSaludoRule()); 
            pushFollow(FOLLOW_ruleSaludo_in_entryRuleSaludo121);
            ruleSaludo();

            state._fsp--;

             after(grammarAccess.getSaludoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSaludo128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSaludo"


    // $ANTLR start "ruleSaludo"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:97:1: ruleSaludo : ( ( rule__Saludo__Alternatives ) ) ;
    public final void ruleSaludo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:101:2: ( ( ( rule__Saludo__Alternatives ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:102:1: ( ( rule__Saludo__Alternatives ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:102:1: ( ( rule__Saludo__Alternatives ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:103:1: ( rule__Saludo__Alternatives )
            {
             before(grammarAccess.getSaludoAccess().getAlternatives()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:104:1: ( rule__Saludo__Alternatives )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:104:2: rule__Saludo__Alternatives
            {
            pushFollow(FOLLOW_rule__Saludo__Alternatives_in_ruleSaludo154);
            rule__Saludo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSaludoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSaludo"


    // $ANTLR start "entryRuleBienvenida"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:116:1: entryRuleBienvenida : ruleBienvenida EOF ;
    public final void entryRuleBienvenida() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:117:1: ( ruleBienvenida EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:118:1: ruleBienvenida EOF
            {
             before(grammarAccess.getBienvenidaRule()); 
            pushFollow(FOLLOW_ruleBienvenida_in_entryRuleBienvenida181);
            ruleBienvenida();

            state._fsp--;

             after(grammarAccess.getBienvenidaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBienvenida188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBienvenida"


    // $ANTLR start "ruleBienvenida"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:125:1: ruleBienvenida : ( ( rule__Bienvenida__Group__0 ) ) ;
    public final void ruleBienvenida() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:129:2: ( ( ( rule__Bienvenida__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:130:1: ( ( rule__Bienvenida__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:130:1: ( ( rule__Bienvenida__Group__0 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:131:1: ( rule__Bienvenida__Group__0 )
            {
             before(grammarAccess.getBienvenidaAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:132:1: ( rule__Bienvenida__Group__0 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:132:2: rule__Bienvenida__Group__0
            {
            pushFollow(FOLLOW_rule__Bienvenida__Group__0_in_ruleBienvenida214);
            rule__Bienvenida__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBienvenidaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBienvenida"


    // $ANTLR start "entryRuleDespedida"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:144:1: entryRuleDespedida : ruleDespedida EOF ;
    public final void entryRuleDespedida() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:145:1: ( ruleDespedida EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:146:1: ruleDespedida EOF
            {
             before(grammarAccess.getDespedidaRule()); 
            pushFollow(FOLLOW_ruleDespedida_in_entryRuleDespedida241);
            ruleDespedida();

            state._fsp--;

             after(grammarAccess.getDespedidaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDespedida248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDespedida"


    // $ANTLR start "ruleDespedida"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:153:1: ruleDespedida : ( ( rule__Despedida__Group__0 ) ) ;
    public final void ruleDespedida() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:157:2: ( ( ( rule__Despedida__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:158:1: ( ( rule__Despedida__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:158:1: ( ( rule__Despedida__Group__0 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:159:1: ( rule__Despedida__Group__0 )
            {
             before(grammarAccess.getDespedidaAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:160:1: ( rule__Despedida__Group__0 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:160:2: rule__Despedida__Group__0
            {
            pushFollow(FOLLOW_rule__Despedida__Group__0_in_ruleDespedida274);
            rule__Despedida__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDespedidaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDespedida"


    // $ANTLR start "entryRuleAlguien"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:172:1: entryRuleAlguien : ruleAlguien EOF ;
    public final void entryRuleAlguien() throws RecognitionException {
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:173:1: ( ruleAlguien EOF )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:174:1: ruleAlguien EOF
            {
             before(grammarAccess.getAlguienRule()); 
            pushFollow(FOLLOW_ruleAlguien_in_entryRuleAlguien301);
            ruleAlguien();

            state._fsp--;

             after(grammarAccess.getAlguienRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlguien308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlguien"


    // $ANTLR start "ruleAlguien"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:181:1: ruleAlguien : ( ( rule__Alguien__Group__0 ) ) ;
    public final void ruleAlguien() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:185:2: ( ( ( rule__Alguien__Group__0 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:186:1: ( ( rule__Alguien__Group__0 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:186:1: ( ( rule__Alguien__Group__0 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:187:1: ( rule__Alguien__Group__0 )
            {
             before(grammarAccess.getAlguienAccess().getGroup()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:188:1: ( rule__Alguien__Group__0 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:188:2: rule__Alguien__Group__0
            {
            pushFollow(FOLLOW_rule__Alguien__Group__0_in_ruleAlguien334);
            rule__Alguien__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlguienAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlguien"


    // $ANTLR start "rule__Saludo__Alternatives"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:200:1: rule__Saludo__Alternatives : ( ( ruleBienvenida ) | ( ruleDespedida ) );
    public final void rule__Saludo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:204:1: ( ( ruleBienvenida ) | ( ruleDespedida ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:205:1: ( ruleBienvenida )
                    {
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:205:1: ( ruleBienvenida )
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:206:1: ruleBienvenida
                    {
                     before(grammarAccess.getSaludoAccess().getBienvenidaParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBienvenida_in_rule__Saludo__Alternatives370);
                    ruleBienvenida();

                    state._fsp--;

                     after(grammarAccess.getSaludoAccess().getBienvenidaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:211:6: ( ruleDespedida )
                    {
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:211:6: ( ruleDespedida )
                    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:212:1: ruleDespedida
                    {
                     before(grammarAccess.getSaludoAccess().getDespedidaParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDespedida_in_rule__Saludo__Alternatives387);
                    ruleDespedida();

                    state._fsp--;

                     after(grammarAccess.getSaludoAccess().getDespedidaParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Saludo__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:224:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:228:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:229:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0417);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0420);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:236:1: rule__Model__Group__0__Impl : ( ( rule__Model__QuienesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:240:1: ( ( ( rule__Model__QuienesAssignment_0 )* ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:241:1: ( ( rule__Model__QuienesAssignment_0 )* )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:241:1: ( ( rule__Model__QuienesAssignment_0 )* )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:242:1: ( rule__Model__QuienesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getQuienesAssignment_0()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:243:1: ( rule__Model__QuienesAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:243:2: rule__Model__QuienesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__QuienesAssignment_0_in_rule__Model__Group__0__Impl447);
            	    rule__Model__QuienesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQuienesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:253:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:257:1: ( rule__Model__Group__1__Impl )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:258:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1478);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:264:1: rule__Model__Group__1__Impl : ( ( rule__Model__SaludosAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:268:1: ( ( ( rule__Model__SaludosAssignment_1 )* ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:269:1: ( ( rule__Model__SaludosAssignment_1 )* )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:269:1: ( ( rule__Model__SaludosAssignment_1 )* )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:270:1: ( rule__Model__SaludosAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSaludosAssignment_1()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:271:1: ( rule__Model__SaludosAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:271:2: rule__Model__SaludosAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__SaludosAssignment_1_in_rule__Model__Group__1__Impl505);
            	    rule__Model__SaludosAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSaludosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Bienvenida__Group__0"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:285:1: rule__Bienvenida__Group__0 : rule__Bienvenida__Group__0__Impl rule__Bienvenida__Group__1 ;
    public final void rule__Bienvenida__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:289:1: ( rule__Bienvenida__Group__0__Impl rule__Bienvenida__Group__1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:290:2: rule__Bienvenida__Group__0__Impl rule__Bienvenida__Group__1
            {
            pushFollow(FOLLOW_rule__Bienvenida__Group__0__Impl_in_rule__Bienvenida__Group__0540);
            rule__Bienvenida__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bienvenida__Group__1_in_rule__Bienvenida__Group__0543);
            rule__Bienvenida__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__0"


    // $ANTLR start "rule__Bienvenida__Group__0__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:297:1: rule__Bienvenida__Group__0__Impl : ( 'Hola' ) ;
    public final void rule__Bienvenida__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:301:1: ( ( 'Hola' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:302:1: ( 'Hola' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:302:1: ( 'Hola' )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:303:1: 'Hola'
            {
             before(grammarAccess.getBienvenidaAccess().getHolaKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Bienvenida__Group__0__Impl571); 
             after(grammarAccess.getBienvenidaAccess().getHolaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__0__Impl"


    // $ANTLR start "rule__Bienvenida__Group__1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:316:1: rule__Bienvenida__Group__1 : rule__Bienvenida__Group__1__Impl rule__Bienvenida__Group__2 ;
    public final void rule__Bienvenida__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:320:1: ( rule__Bienvenida__Group__1__Impl rule__Bienvenida__Group__2 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:321:2: rule__Bienvenida__Group__1__Impl rule__Bienvenida__Group__2
            {
            pushFollow(FOLLOW_rule__Bienvenida__Group__1__Impl_in_rule__Bienvenida__Group__1602);
            rule__Bienvenida__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bienvenida__Group__2_in_rule__Bienvenida__Group__1605);
            rule__Bienvenida__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__1"


    // $ANTLR start "rule__Bienvenida__Group__1__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:328:1: rule__Bienvenida__Group__1__Impl : ( ( rule__Bienvenida__AQuienAssignment_1 ) ) ;
    public final void rule__Bienvenida__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:332:1: ( ( ( rule__Bienvenida__AQuienAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:333:1: ( ( rule__Bienvenida__AQuienAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:333:1: ( ( rule__Bienvenida__AQuienAssignment_1 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:334:1: ( rule__Bienvenida__AQuienAssignment_1 )
            {
             before(grammarAccess.getBienvenidaAccess().getAQuienAssignment_1()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:335:1: ( rule__Bienvenida__AQuienAssignment_1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:335:2: rule__Bienvenida__AQuienAssignment_1
            {
            pushFollow(FOLLOW_rule__Bienvenida__AQuienAssignment_1_in_rule__Bienvenida__Group__1__Impl632);
            rule__Bienvenida__AQuienAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBienvenidaAccess().getAQuienAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__1__Impl"


    // $ANTLR start "rule__Bienvenida__Group__2"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:345:1: rule__Bienvenida__Group__2 : rule__Bienvenida__Group__2__Impl ;
    public final void rule__Bienvenida__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:349:1: ( rule__Bienvenida__Group__2__Impl )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:350:2: rule__Bienvenida__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Bienvenida__Group__2__Impl_in_rule__Bienvenida__Group__2662);
            rule__Bienvenida__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__2"


    // $ANTLR start "rule__Bienvenida__Group__2__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:356:1: rule__Bienvenida__Group__2__Impl : ( '!' ) ;
    public final void rule__Bienvenida__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:360:1: ( ( '!' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:361:1: ( '!' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:361:1: ( '!' )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:362:1: '!'
            {
             before(grammarAccess.getBienvenidaAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Bienvenida__Group__2__Impl690); 
             after(grammarAccess.getBienvenidaAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__Group__2__Impl"


    // $ANTLR start "rule__Despedida__Group__0"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:381:1: rule__Despedida__Group__0 : rule__Despedida__Group__0__Impl rule__Despedida__Group__1 ;
    public final void rule__Despedida__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:385:1: ( rule__Despedida__Group__0__Impl rule__Despedida__Group__1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:386:2: rule__Despedida__Group__0__Impl rule__Despedida__Group__1
            {
            pushFollow(FOLLOW_rule__Despedida__Group__0__Impl_in_rule__Despedida__Group__0727);
            rule__Despedida__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Despedida__Group__1_in_rule__Despedida__Group__0730);
            rule__Despedida__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__0"


    // $ANTLR start "rule__Despedida__Group__0__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:393:1: rule__Despedida__Group__0__Impl : ( 'Chau' ) ;
    public final void rule__Despedida__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:397:1: ( ( 'Chau' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:398:1: ( 'Chau' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:398:1: ( 'Chau' )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:399:1: 'Chau'
            {
             before(grammarAccess.getDespedidaAccess().getChauKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Despedida__Group__0__Impl758); 
             after(grammarAccess.getDespedidaAccess().getChauKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__0__Impl"


    // $ANTLR start "rule__Despedida__Group__1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:412:1: rule__Despedida__Group__1 : rule__Despedida__Group__1__Impl rule__Despedida__Group__2 ;
    public final void rule__Despedida__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:416:1: ( rule__Despedida__Group__1__Impl rule__Despedida__Group__2 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:417:2: rule__Despedida__Group__1__Impl rule__Despedida__Group__2
            {
            pushFollow(FOLLOW_rule__Despedida__Group__1__Impl_in_rule__Despedida__Group__1789);
            rule__Despedida__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Despedida__Group__2_in_rule__Despedida__Group__1792);
            rule__Despedida__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__1"


    // $ANTLR start "rule__Despedida__Group__1__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:424:1: rule__Despedida__Group__1__Impl : ( ( rule__Despedida__AQuienAssignment_1 ) ) ;
    public final void rule__Despedida__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:428:1: ( ( ( rule__Despedida__AQuienAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:429:1: ( ( rule__Despedida__AQuienAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:429:1: ( ( rule__Despedida__AQuienAssignment_1 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:430:1: ( rule__Despedida__AQuienAssignment_1 )
            {
             before(grammarAccess.getDespedidaAccess().getAQuienAssignment_1()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:431:1: ( rule__Despedida__AQuienAssignment_1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:431:2: rule__Despedida__AQuienAssignment_1
            {
            pushFollow(FOLLOW_rule__Despedida__AQuienAssignment_1_in_rule__Despedida__Group__1__Impl819);
            rule__Despedida__AQuienAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDespedidaAccess().getAQuienAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__1__Impl"


    // $ANTLR start "rule__Despedida__Group__2"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:441:1: rule__Despedida__Group__2 : rule__Despedida__Group__2__Impl ;
    public final void rule__Despedida__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:445:1: ( rule__Despedida__Group__2__Impl )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:446:2: rule__Despedida__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Despedida__Group__2__Impl_in_rule__Despedida__Group__2849);
            rule__Despedida__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__2"


    // $ANTLR start "rule__Despedida__Group__2__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:452:1: rule__Despedida__Group__2__Impl : ( '!' ) ;
    public final void rule__Despedida__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:456:1: ( ( '!' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:457:1: ( '!' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:457:1: ( '!' )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:458:1: '!'
            {
             before(grammarAccess.getDespedidaAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Despedida__Group__2__Impl877); 
             after(grammarAccess.getDespedidaAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__Group__2__Impl"


    // $ANTLR start "rule__Alguien__Group__0"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:477:1: rule__Alguien__Group__0 : rule__Alguien__Group__0__Impl rule__Alguien__Group__1 ;
    public final void rule__Alguien__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:481:1: ( rule__Alguien__Group__0__Impl rule__Alguien__Group__1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:482:2: rule__Alguien__Group__0__Impl rule__Alguien__Group__1
            {
            pushFollow(FOLLOW_rule__Alguien__Group__0__Impl_in_rule__Alguien__Group__0914);
            rule__Alguien__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alguien__Group__1_in_rule__Alguien__Group__0917);
            rule__Alguien__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alguien__Group__0"


    // $ANTLR start "rule__Alguien__Group__0__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:489:1: rule__Alguien__Group__0__Impl : ( 'quien' ) ;
    public final void rule__Alguien__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:493:1: ( ( 'quien' ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:494:1: ( 'quien' )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:494:1: ( 'quien' )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:495:1: 'quien'
            {
             before(grammarAccess.getAlguienAccess().getQuienKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Alguien__Group__0__Impl945); 
             after(grammarAccess.getAlguienAccess().getQuienKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alguien__Group__0__Impl"


    // $ANTLR start "rule__Alguien__Group__1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:508:1: rule__Alguien__Group__1 : rule__Alguien__Group__1__Impl ;
    public final void rule__Alguien__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:512:1: ( rule__Alguien__Group__1__Impl )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:513:2: rule__Alguien__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Alguien__Group__1__Impl_in_rule__Alguien__Group__1976);
            rule__Alguien__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alguien__Group__1"


    // $ANTLR start "rule__Alguien__Group__1__Impl"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:519:1: rule__Alguien__Group__1__Impl : ( ( rule__Alguien__NameAssignment_1 ) ) ;
    public final void rule__Alguien__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:523:1: ( ( ( rule__Alguien__NameAssignment_1 ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:524:1: ( ( rule__Alguien__NameAssignment_1 ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:524:1: ( ( rule__Alguien__NameAssignment_1 ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:525:1: ( rule__Alguien__NameAssignment_1 )
            {
             before(grammarAccess.getAlguienAccess().getNameAssignment_1()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:526:1: ( rule__Alguien__NameAssignment_1 )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:526:2: rule__Alguien__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alguien__NameAssignment_1_in_rule__Alguien__Group__1__Impl1003);
            rule__Alguien__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlguienAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alguien__Group__1__Impl"


    // $ANTLR start "rule__Model__QuienesAssignment_0"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:541:1: rule__Model__QuienesAssignment_0 : ( ruleAlguien ) ;
    public final void rule__Model__QuienesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:545:1: ( ( ruleAlguien ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:546:1: ( ruleAlguien )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:546:1: ( ruleAlguien )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:547:1: ruleAlguien
            {
             before(grammarAccess.getModelAccess().getQuienesAlguienParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAlguien_in_rule__Model__QuienesAssignment_01042);
            ruleAlguien();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQuienesAlguienParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QuienesAssignment_0"


    // $ANTLR start "rule__Model__SaludosAssignment_1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:556:1: rule__Model__SaludosAssignment_1 : ( ruleSaludo ) ;
    public final void rule__Model__SaludosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:560:1: ( ( ruleSaludo ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:561:1: ( ruleSaludo )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:561:1: ( ruleSaludo )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:562:1: ruleSaludo
            {
             before(grammarAccess.getModelAccess().getSaludosSaludoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSaludo_in_rule__Model__SaludosAssignment_11073);
            ruleSaludo();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSaludosSaludoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SaludosAssignment_1"


    // $ANTLR start "rule__Bienvenida__AQuienAssignment_1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:571:1: rule__Bienvenida__AQuienAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bienvenida__AQuienAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:575:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:576:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:576:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:577:1: ( RULE_ID )
            {
             before(grammarAccess.getBienvenidaAccess().getAQuienAlguienCrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:578:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:579:1: RULE_ID
            {
             before(grammarAccess.getBienvenidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bienvenida__AQuienAssignment_11108); 
             after(grammarAccess.getBienvenidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBienvenidaAccess().getAQuienAlguienCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bienvenida__AQuienAssignment_1"


    // $ANTLR start "rule__Despedida__AQuienAssignment_1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:590:1: rule__Despedida__AQuienAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Despedida__AQuienAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:594:1: ( ( ( RULE_ID ) ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:595:1: ( ( RULE_ID ) )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:595:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:596:1: ( RULE_ID )
            {
             before(grammarAccess.getDespedidaAccess().getAQuienAlguienCrossReference_1_0()); 
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:597:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:598:1: RULE_ID
            {
             before(grammarAccess.getDespedidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Despedida__AQuienAssignment_11147); 
             after(grammarAccess.getDespedidaAccess().getAQuienAlguienIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDespedidaAccess().getAQuienAlguienCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Despedida__AQuienAssignment_1"


    // $ANTLR start "rule__Alguien__NameAssignment_1"
    // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:609:1: rule__Alguien__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alguien__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:613:1: ( ( RULE_ID ) )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:614:1: ( RULE_ID )
            {
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:614:1: ( RULE_ID )
            // ../org.uqbar.paco.dsl.xtext.saludos.ui/src-gen/org/uqbar/paco/dsl/xtext/saludos/ui/contentassist/antlr/internal/InternalSaludosDSL.g:615:1: RULE_ID
            {
             before(grammarAccess.getAlguienAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alguien__NameAssignment_11182); 
             after(grammarAccess.getAlguienAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alguien__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSaludo_in_entryRuleSaludo121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSaludo128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Saludo__Alternatives_in_ruleSaludo154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBienvenida_in_entryRuleBienvenida181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBienvenida188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__0_in_ruleBienvenida214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDespedida_in_entryRuleDespedida241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDespedida248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Despedida__Group__0_in_ruleDespedida274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlguien_in_entryRuleAlguien301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlguien308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alguien__Group__0_in_ruleAlguien334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBienvenida_in_rule__Saludo__Alternatives370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDespedida_in_rule__Saludo__Alternatives387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0417 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__QuienesAssignment_0_in_rule__Model__Group__0__Impl447 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SaludosAssignment_1_in_rule__Model__Group__1__Impl505 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__0__Impl_in_rule__Bienvenida__Group__0540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__1_in_rule__Bienvenida__Group__0543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Bienvenida__Group__0__Impl571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__1__Impl_in_rule__Bienvenida__Group__1602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__2_in_rule__Bienvenida__Group__1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bienvenida__AQuienAssignment_1_in_rule__Bienvenida__Group__1__Impl632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bienvenida__Group__2__Impl_in_rule__Bienvenida__Group__2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Bienvenida__Group__2__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Despedida__Group__0__Impl_in_rule__Despedida__Group__0727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Despedida__Group__1_in_rule__Despedida__Group__0730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Despedida__Group__0__Impl758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Despedida__Group__1__Impl_in_rule__Despedida__Group__1789 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Despedida__Group__2_in_rule__Despedida__Group__1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Despedida__AQuienAssignment_1_in_rule__Despedida__Group__1__Impl819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Despedida__Group__2__Impl_in_rule__Despedida__Group__2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Despedida__Group__2__Impl877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alguien__Group__0__Impl_in_rule__Alguien__Group__0914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alguien__Group__1_in_rule__Alguien__Group__0917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Alguien__Group__0__Impl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alguien__Group__1__Impl_in_rule__Alguien__Group__1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alguien__NameAssignment_1_in_rule__Alguien__Group__1__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlguien_in_rule__Model__QuienesAssignment_01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSaludo_in_rule__Model__SaludosAssignment_11073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bienvenida__AQuienAssignment_11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Despedida__AQuienAssignment_11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alguien__NameAssignment_11182 = new BitSet(new long[]{0x0000000000000002L});

}