package com.selonj;

class Sum implements Expression {
  private Expression augend, addend;

  public Sum(Expression augend, Expression addend){
    this.augend = augend;
    this.addend = addend;
  }
  
  public Money reduce(Bank bank, String to) {
    return new Money(augend.reduce(bank, to).amount + addend.reduce(bank, to).amount, to);
  }
}
