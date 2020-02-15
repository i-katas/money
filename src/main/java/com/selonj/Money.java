package com.selonj;

public abstract class Money {
  protected int amount;
  protected String currency;

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  abstract Money times(int multiplier);

  String currency() {
    return currency;
  }

  public boolean equals(Object o) {
    Money that = (Money) o;
    return this.amount == that.amount && this.getClass() == that.getClass();
  }
}
