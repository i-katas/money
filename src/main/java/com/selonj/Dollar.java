package com.selonj;

public class Dollar extends Money {

  Dollar(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    return dollar(this.amount * multiplier);
  }

}
