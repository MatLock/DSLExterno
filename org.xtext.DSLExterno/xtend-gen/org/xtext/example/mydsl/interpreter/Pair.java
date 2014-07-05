package org.xtext.example.mydsl.interpreter;

import com.google.common.base.Objects;
import org.xtext.example.mydsl.myDsl.Aula;

@SuppressWarnings("all")
public class Pair {
  private Aula _aula;
  
  public Aula getAula() {
    return this._aula;
  }
  
  public void setAula(final Aula aula) {
    this._aula = aula;
  }
  
  private Integer _veces;
  
  public Integer getVeces() {
    return this._veces;
  }
  
  public void setVeces(final Integer veces) {
    this._veces = veces;
  }
  
  public Pair(final Aula a, final int i) {
    this.setAula(a);
    this.setVeces(Integer.valueOf(i));
  }
  
  public boolean operator_equals(final Pair b) {
    Aula _aula = this.getAula();
    Aula _aula_1 = b.getAula();
    return Objects.equal(_aula, _aula_1);
  }
}
