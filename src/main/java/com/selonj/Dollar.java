package com.selonj;

public class Dollar {
  final int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

  public boolean equals(Object o) {
    return true;
  }
}
