package com.selonj;

class Sum implements Expression {
  private Money augend, addend;

  public Sum(Money augend, Money addend){
    this.augend = augend;
    this.addend = addend;
  }
  
  public Money reduce(Bank bank, String to) {
    return new Money(augend.amount + addend.amount, to);
  }
}
