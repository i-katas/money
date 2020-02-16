package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class MoneyTest {
  @Test
  public void multiplication() throws Throwable {
    Money five = Money.dollar(5);

    assertThat(five.times(2), equalTo(Money.dollar(10)));
    assertThat(five.times(3), equalTo(Money.dollar(15)));
  }

  @Test
  public void plusSameCurrency() throws Throwable {
    Money five = Money.dollar(5);
    Bank bank = new Bank();

    Expression sum = five.plus(five);

    Money reduced = bank.reduce(sum, "USD");
    assertThat(reduced, equalTo(Money.dollar(10)));
  }

  @Test
  public void reduceToSameCurrency() throws Throwable {
    Money five = Money.dollar(5);
    Bank bank = new Bank();

    Money reduced = bank.reduce(five, "USD");

    assertThat(reduced, equalTo(five));
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
