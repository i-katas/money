package com.selonj;

class Sum implements Expression {
  private Expression augend, addend;

  public Sum(Expression augend, Expression addend){
    this.augend = augend;
    this.addend = addend;
  }

  public Expression times(int multiplier) {
    return new Sum(augend.times(multiplier), addend.times(multiplier));
  }
  
  public Money reduce(Bank bank, String to) {
    return augend.reduce(bank, to).plus(addend.reduce(bank, to)).reduce(bank, to);
  }
}
