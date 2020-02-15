package com.selonj;

public class Franc extends Money {

  Franc(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return franc(this.amount * multiplier);
  }

}
