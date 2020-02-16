package com.selonj;

public interface Expression {
  default Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  Expression times(int multiplier);

  Money reduce(Bank bank, String to);
}
