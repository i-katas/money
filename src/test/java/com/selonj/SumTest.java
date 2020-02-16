package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {
  @Test
  public void reduceSumOfSameCurrency() throws Throwable {
    Sum sum = new Sum(Money.dollar(3), Money.dollar(4));
    Bank bank = new Bank();

    Money reduced = bank.reduce(sum, "USD");

    assertThat(reduced, equalTo(Money.dollar(7)));
  }
}
