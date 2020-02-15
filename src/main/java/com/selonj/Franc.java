package com.selonj;

public class Franc {
  private final int amount;

  Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(this.amount * multiplier);
  }

  public boolean equals(Object o) {
    Franc that = (Franc) o;
    return this.amount == that.amount;
  }
}
