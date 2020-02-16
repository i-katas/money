package com.selonj;

class Sum implements Expression {
  public Money augend, addend;

  public Sum(Money augend, Money addend){
    this.augend = augend;
    this.addend = addend;
  }
  
}
