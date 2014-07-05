package org.xtext.example.mydsl.interpreter;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.Asignacion;
import org.xtext.example.mydsl.myDsl.Aula;
import org.xtext.example.mydsl.myDsl.Clase;
import org.xtext.example.mydsl.myDsl.Curso;
import org.xtext.example.mydsl.myDsl.Horario;
import org.xtext.example.mydsl.myDsl.Materia;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.Planificacion;
import org.xtext.example.mydsl.myDsl.Profesor;

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
  
  public void interpret(final Model model) {
    EList<Clase> _clases = model.getClases();
    final Iterable<Planificacion> list = Iterables.<Planificacion>filter(_clases, Planificacion.class);
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion p) {
        DSLExternoInterpreter.this.obtenerEstadisticas(p);
      }
    };
    IterableExtensions.<Planificacion>forEach(list, _function);
    this.materiasDeProfesores(model);
  }
  
  public void obtenerEstadisticas(final Planificacion planificacion) {
    int _anio = planificacion.getAnio();
    String _plus = ("Planificacion: " + Integer.valueOf(_anio));
    String _plus_1 = (_plus + " semestre: ");
    int _semestre = planificacion.getSemestre();
    String _plus_2 = (_plus_1 + Integer.valueOf(_semestre));
    String _plus_3 = (_plus_2 + "{ \n");
    InputOutput.<String>println(_plus_3);
    Aula _aulaMasUsada = this.aulaMasUsada(planificacion);
    String _name = _aulaMasUsada.getName();
    String _plus_4 = ("Aula mas utilizada: " + _name);
    InputOutput.<String>println(_plus_4);
    InputOutput.<String>println("Horarios sin clase: ");
    this.horariosEnLosQueSeDictanClasePor(planificacion);
    this.porcentajesPorTurnos(planificacion);
    InputOutput.<String>println("\n }");
  }
  
  public HashMap<Aula, Integer> aulasUsadas(final Iterable<Horario> horarios) {
    HashMap<Aula, Integer> _xblockexpression = null;
    {
      final HashMap<Aula, Integer> aulasUsadas = new HashMap<Aula, Integer>();
      final Procedure1<Horario> _function = new Procedure1<Horario>() {
        public void apply(final Horario h) {
          Aula _aula = h.getAula();
          boolean _containsKey = aulasUsadas.containsKey(_aula);
          boolean _not = (!_containsKey);
          if (_not) {
            Aula _aula_1 = h.getAula();
            aulasUsadas.put(_aula_1, Integer.valueOf(1));
          } else {
            Aula _aula_2 = h.getAula();
            Aula _aula_3 = h.getAula();
            Integer _get = aulasUsadas.get(_aula_3);
            int _plus = ((_get).intValue() + 1);
            aulasUsadas.put(_aula_2, Integer.valueOf(_plus));
          }
        }
      };
      IterableExtensions.<Horario>forEach(horarios, _function);
      _xblockexpression = aulasUsadas;
    }
    return _xblockexpression;
  }
  
  public Iterable<Horario> horarios(final EList<Asignacion> asignaciones) {
    final Function1<Asignacion, EList<Horario>> _function = new Function1<Asignacion, EList<Horario>>() {
      public EList<Horario> apply(final Asignacion a) {
        return a.getHorarios();
      }
    };
    List<EList<Horario>> _map = ListExtensions.<Asignacion, EList<Horario>>map(asignaciones, _function);
    return Iterables.<Horario>concat(_map);
  }
  
  public Aula aulaMasUsada(final Planificacion p) {
    Aula _xblockexpression = null;
    {
      EList<Asignacion> _asignaciones = p.getAsignaciones();
      Iterable<Horario> _horarios = this.horarios(_asignaciones);
      final HashMap<Aula, Integer> mapAulas = this.aulasUsadas(_horarios);
      final Set<Aula> aulas = mapAulas.keySet();
      int maximo = 0;
      Aula aula = null;
      for (final Aula a : aulas) {
        Integer _get = mapAulas.get(a);
        boolean _greaterThan = ((_get).intValue() > maximo);
        if (_greaterThan) {
          Integer _get_1 = mapAulas.get(a);
          maximo = (_get_1).intValue();
          aula = a;
        }
      }
      _xblockexpression = aula;
    }
    return _xblockexpression;
  }
  
  public void horariosEnLosQueSeDictanClasePor(final Horario horario, final List<Integer> listaConHorarios) {
    final int horaInicio = horario.getHorarioInicio();
    final int horaFin = horario.getHorarioFin();
    IntegerRange _upTo = new IntegerRange(horaInicio, horaFin);
    for (final Integer h : _upTo) {
      boolean _contains = listaConHorarios.contains(h);
      if (_contains) {
        listaConHorarios.remove(h);
      }
    }
  }
  
  public void horariosEnLosQueSeDictanClasePor(final Planificacion planificacion) {
    EList<Asignacion> _asignaciones = planificacion.getAsignaciones();
    final Function1<Asignacion, EList<Horario>> _function = new Function1<Asignacion, EList<Horario>>() {
      public EList<Horario> apply(final Asignacion a) {
        return a.getHorarios();
      }
    };
    List<EList<Horario>> _map = ListExtensions.<Asignacion, EList<Horario>>map(_asignaciones, _function);
    final Iterable<Horario> listaDeHorarios = Iterables.<Horario>concat(_map);
    IntegerRange _upTo = new IntegerRange(7, 22);
    final List<Integer> horariosDelDia = IterableExtensions.<Integer>toList(_upTo);
    for (final Horario a : listaDeHorarios) {
      this.horariosEnLosQueSeDictanClasePor(a, horariosDelDia);
    }
    this.imprimirHorarios(horariosDelDia);
  }
  
  public void imprimirHorarios(final List<Integer> horarios) {
    for (final Integer h : horarios) {
      String _plus = (h + " horas");
      InputOutput.<String>println(_plus);
    }
  }
  
  public Integer cantHorarios(final Iterable<Asignacion> asignaciones) {
    final Function2<Integer, Asignacion, Integer> _function = new Function2<Integer, Asignacion, Integer>() {
      public Integer apply(final Integer r, final Asignacion a) {
        EList<Horario> _horarios = a.getHorarios();
        int _size = _horarios.size();
        return Integer.valueOf(((r).intValue() + _size));
      }
    };
    return IterableExtensions.<Asignacion, Integer>fold(asignaciones, Integer.valueOf(0), _function);
  }
  
  public int cantMateriasPorTurno(final Iterable<Horario> horarios, final Integer desde, final Integer hasta) {
    final Function1<Horario, Boolean> _function = new Function1<Horario, Boolean>() {
      public Boolean apply(final Horario h) {
        boolean _and = false;
        int _horarioInicio = h.getHorarioInicio();
        boolean _greaterEqualsThan = (_horarioInicio >= (desde).intValue());
        if (!_greaterEqualsThan) {
          _and = false;
        } else {
          int _horarioFin = h.getHorarioFin();
          boolean _lessEqualsThan = (_horarioFin <= (hasta).intValue());
          _and = _lessEqualsThan;
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<Horario> _filter = IterableExtensions.<Horario>filter(horarios, _function);
    return IterableExtensions.size(_filter);
  }
  
  public Iterable<Horario> horariosDePlanificacion(final Planificacion p) {
    EList<Asignacion> _asignaciones = p.getAsignaciones();
    final Function1<Asignacion, EList<Horario>> _function = new Function1<Asignacion, EList<Horario>>() {
      public EList<Horario> apply(final Asignacion a) {
        return a.getHorarios();
      }
    };
    List<EList<Horario>> _map = ListExtensions.<Asignacion, EList<Horario>>map(_asignaciones, _function);
    return Iterables.<Horario>concat(_map);
  }
  
  public double porcentajeTurno(final Planificacion p, final Integer desde, final Integer hasta) {
    double _xblockexpression = (double) 0;
    {
      final Iterable<Horario> horarios = this.horariosDePlanificacion(p);
      double porcentaje = 0.0;
      int _cantMateriasPorTurno = this.cantMateriasPorTurno(horarios, desde, hasta);
      int _multiply = (_cantMateriasPorTurno * 100);
      EList<Asignacion> _asignaciones = p.getAsignaciones();
      Integer _cantHorarios = this.cantHorarios(_asignaciones);
      double _divide = (_multiply / ((double) (_cantHorarios).intValue()));
      porcentaje = _divide;
      _xblockexpression = Math.rint(porcentaje);
    }
    return _xblockexpression;
  }
  
  public String porcentajesPorTurnos(final Planificacion p) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Turno Mañana ");
      double _porcentajeTurno = this.porcentajeTurno(p, Integer.valueOf(7), Integer.valueOf(13));
      _builder.append(_porcentajeTurno, "");
      _builder.append(" %");
      InputOutput.<String>println(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Turno Tarde ");
      double _porcentajeTurno_1 = this.porcentajeTurno(p, Integer.valueOf(13), Integer.valueOf(18));
      _builder_1.append(_porcentajeTurno_1, "");
      _builder_1.append(" %");
      InputOutput.<String>println(_builder_1.toString());
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("Turno Noche ");
      double _porcentajeTurno_2 = this.porcentajeTurno(p, Integer.valueOf(18), Integer.valueOf(22));
      _builder_2.append(_porcentajeTurno_2, "");
      _builder_2.append(" %");
      _xblockexpression = InputOutput.<String>println(_builder_2.toString());
    }
    return _xblockexpression;
  }
  
  public void materiasDeProfesores(final Model model) {
    EList<Clase> _clases = model.getClases();
    final Iterable<Profesor> profesores = Iterables.<Profesor>filter(_clases, Profesor.class);
    EList<Clase> _clases_1 = model.getClases();
    final Iterable<Planificacion> planificaciones = Iterables.<Planificacion>filter(_clases_1, Planificacion.class);
    final Procedure1<Profesor> _function = new Procedure1<Profesor>() {
      public void apply(final Profesor p) {
        DSLExternoInterpreter.this.materiasDeProfesor(p, planificaciones);
      }
    };
    IterableExtensions.<Profesor>forEach(profesores, _function);
  }
  
  public void materiasDeProfesor(final Profesor profesor, final Iterable<Planificacion> planificaciones) {
    String _name = profesor.getName();
    String _plus = ("el profesor: " + _name);
    String _plus_1 = (_plus + " dicta");
    InputOutput.<String>println(_plus_1);
    final Procedure1<Planificacion> _function = new Procedure1<Planificacion>() {
      public void apply(final Planificacion p) {
        DSLExternoInterpreter.this.materiaDictadaPorProfesor(p, profesor);
      }
    };
    IterableExtensions.<Planificacion>forEach(planificaciones, _function);
  }
  
  public void materiaDictadaPorProfesor(final Planificacion planificacion, final Profesor profesor) {
    EList<Curso> _cursos = planificacion.getCursos();
    final Function1<Curso, Boolean> _function = new Function1<Curso, Boolean>() {
      public Boolean apply(final Curso c) {
        Profesor _dictadaPor = c.getDictadaPor();
        return Boolean.valueOf(Objects.equal(_dictadaPor, profesor));
      }
    };
    final Iterable<Curso> cursosConProfesor = IterableExtensions.<Curso>filter(_cursos, _function);
    int _size = IterableExtensions.size(cursosConProfesor);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      int _anio = planificacion.getAnio();
      String _plus = ("\ten planificacion: " + Integer.valueOf(_anio));
      String _plus_1 = (_plus + " semestre: ");
      int _semestre = planificacion.getSemestre();
      String _plus_2 = (_plus_1 + Integer.valueOf(_semestre));
      InputOutput.<String>println(_plus_2);
      final Procedure1<Curso> _function_1 = new Procedure1<Curso>() {
        public void apply(final Curso c) {
          Materia _materia = c.getMateria();
          String _name = _materia.getName();
          String _plus = ("\t\t" + _name);
          InputOutput.<String>println(_plus);
        }
      };
      IterableExtensions.<Curso>forEach(cursosConProfesor, _function_1);
    }
  }
}
