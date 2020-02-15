package com.selonj;

public class Dollar {
  int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    this.amount *= multiplier;
    return null;
  }
}
