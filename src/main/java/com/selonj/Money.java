package com.selonj;

public class Money {
  protected int amount;

  public boolean equals(Object o) {
    Money that = (Money) o;
    return this.amount == that.amount && this.getClass() == that.getClass();
  }
}
