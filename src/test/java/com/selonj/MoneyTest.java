package com.selonj;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class MoneyTest {
  private final Bank bank = new Bank();

  @Before
  public void registerExchangeRates() throws Throwable {
    bank.addRate("CHF", "USD", 2);
  }

  @Test
  public void multiplication() throws Throwable {
    Money five = Money.dollar(5);

    assertThat(five.times(2), equalTo(Money.dollar(10)));
    assertThat(five.times(3), equalTo(Money.dollar(15)));
  }

  @Test
  public void plusSameCurrency() throws Throwable {
    Money five = Money.dollar(5);

    Expression sum = five.plus(five);

    assertThat(sum, equalTo(Money.dollar(10)));
  }

  @Test
  public void plusDifferentCurrency() throws Throwable {
    Money fiveBucks = Money.dollar(5);
    Money tenFrancs = Money.franc(10);

    Expression sum = fiveBucks.plus(tenFrancs);

    Money reduced = bank.reduce(sum, "USD");
    assertThat(reduced, equalTo(Money.dollar(10)));
  }

  @Test
  public void reduceToSameCurrency() throws Throwable {
    Money five = Money.dollar(5);

    Money reduced = bank.reduce(five, "USD");

    assertThat(reduced, equalTo(five));
  }

  @Test
  public void reduceToDifferentCurrency() throws Throwable {
    Money twoFrancs = Money.franc(2);

    Money reduced = bank.reduce(twoFrancs, "USD");

    assertThat(reduced, equalTo(Money.dollar(1)));
  }

  @Test
  public void equality() throws Throwable {
    assertThat(Money.dollar(5), equalTo(Money.dollar(5)));
    assertThat(Money.dollar(5), not(equalTo(Money.dollar(6))));
    assertThat(Money.dollar(5), not(equalTo(Money.franc(5))));
  }

  @Test
  public void currency() throws Throwable {
    assertThat(Money.dollar(5).currency(), equalTo("USD"));
    assertThat(Money.franc(5).currency(), equalTo("CHF"));
  }

}
