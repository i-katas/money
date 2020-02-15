package com.selonj;

public class Franc extends Money {

  Franc(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return franc(this.amount * multiplier);
  }

}
