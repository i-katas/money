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

    Money sum = five.plus(five);

    assertThat(sum, equalTo(Money.dollar(10)));
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
