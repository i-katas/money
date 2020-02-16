package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {
  private final Sum sum = new Sum(Money.dollar(3), Money.dollar(4));
  private final Bank bank = new Bank();

  @Test
  public void reduceSumOfSameCurrency() throws Throwable {
    Money reduced = bank.reduce(sum, "USD");

    assertThat(reduced, equalTo(Money.dollar(7)));
  }

  @Test
  public void plusSumOfSameCurrency() throws Throwable {
    Expression result = sum.plus(Money.dollar(1));

    Money reduced = bank.reduce(result, "USD");
    assertThat(reduced, equalTo(Money.dollar(8)));
  }

  @Test
  public void multiplySumOfSameCurrency() throws Throwable {
    Expression result = sum.times(2);

    Money reduced = bank.reduce(result, "USD");
    assertThat(reduced, equalTo(Money.dollar(14)));
  }

}
