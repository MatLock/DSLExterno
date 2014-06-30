package org.xtext.example.mydsl.interpreter;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Clase;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Planificacion;

@SuppressWarnings("all")
public class DSLExternoInterpreter {
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      throw new RuntimeException("Debe invocar este interprete con la ruta completa a un archivo .mydsl como argumento!");
    }
    final String fileName = args[0];
    final Model model = DSLExternoInterpreter.parsear(fileName);
    DSLExternoInterpreter _dSLExternoInterpreter = new DSLExternoInterpreter();
    _dSLExternoInterpreter.interpret(model);
  }
  
  public static Model parsear(final String fileName) {
    try {
      MyDslStandaloneSetup _myDslStandaloneSetup = new MyDslStandaloneSetup();
      final Injector injector = _myDslStandaloneSetup.createInjectorAndDoEMFRegistration();
      final XtextResourceSet resourceSet = injector.<XtextResourceSet>getInstance(XtextResourceSet.class);
      URI _createURI = URI.createURI(fileName);
      final Resource resource = resourceSet.createResource(_createURI);
      DSLExternoInterpreter.validate(injector, resource);
      Map<Object, Object> _xsetliteral = null;
      Map<Object, Object> _tempMap = Maps.<Object, Object>newHashMap();
      _xsetliteral = Collections.<Object, Object>unmodifiableMap(_tempMap);
      resource.load(_xsetliteral);
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      return ((Model) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void validate(final Injector injector, final Resource resource) {
    final IResourceValidator validator = injector.<IResourceValidator>getInstance(IResourceValidator.class);
    final List<Issue> issues = validator.validate(resource, CheckMode.ALL, null);
    boolean _isEmpty = issues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final Procedure1<Issue> _function = new Procedure1<Issue>() {
        public void apply(final Issue it) {
          String _string = it.toString();
          InputOutput.<String>println(_string);
        }
      };
      IterableExtensions.<Issue>forEach(issues, _function);
      System.exit((-1));
    }
  }
  
  public String interpret(final Model model) {
    String _xblockexpression = null;
    {
      EList<Clase> _clases = model.getClases();
      final Iterable<Planificacion> list = Iterables.<Planificacion>filter(_clases, Planificacion.class);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("planificacion ");
      Planificacion _get = ((Planificacion[])Conversions.unwrapArray(list, Planificacion.class))[0];
      int _anio = _get.getAnio();
      _builder.append(_anio, "");
      _builder.append(" ");
      _xblockexpression = InputOutput.<String>println(_builder.toString());
    }
    return _xblockexpression;
  }
}
