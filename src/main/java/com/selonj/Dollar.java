package com.selonj;

public class Dollar {
  private final int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

  public boolean equals(Object o) {
    Dollar that = (Dollar) o;
    return this.amount == that.amount;
  }
}
