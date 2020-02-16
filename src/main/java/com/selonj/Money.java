package com.selonj;

public final class Money implements Expression {
  private final int amount;
  private final String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public Expression plus(Money addend) {
    if(this.currency().equals(addend.currency())) {
      return new Money(this.amount + addend.amount, currency());
    }
    return Expression.super.plus(addend);
  }

  public Money times(int multiplier) {
    return new Money(this.amount * multiplier, currency());
  }

  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(currency, to);
    return new Money(this.amount / rate, to);
  }

  String currency() {
    return currency;
  }

  public boolean equals(Object o) {
    if(!(o instanceof Money)) {
      return false;
    }
    Money that = (Money) o;
    return this == that || this.amount == that.amount && this.currency().equals(that.currency());
  }

  public String toString() {
    return amount + currency();
  }
}
