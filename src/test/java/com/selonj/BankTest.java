package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BankTest {
  @Test
  public void identityRate() throws Throwable {
    Bank bank = new Bank();

    int rate = bank.rate("USD", "USD");

    assertThat(rate, equalTo(1));
  }
}
