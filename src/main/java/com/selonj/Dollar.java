package com.selonj;

public class Dollar extends Money {

  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return dollar(this.amount * multiplier);
  }

}
