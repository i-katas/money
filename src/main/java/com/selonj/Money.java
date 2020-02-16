package com.selonj;

public class Money implements Expression {
  protected int amount;
  protected String currency;

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

  Expression plus(Money addend) {
    return new Sum(this, addend);
  }

  Money times(int multiplier) {
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
    Money that = (Money) o;
    return this.amount == that.amount && this.currency().equals(that.currency());
  }

  public String toString() {
    return amount + currency();
  }
}
