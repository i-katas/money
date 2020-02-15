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
  public void francMultiplication() throws Throwable {
    Money five = Money.franc(5);

    assertThat(five.times(2), equalTo(Money.franc(10)));
    assertThat(five.times(3), equalTo(Money.franc(15)));
  }

  @Test
  public void equality() throws Throwable {
    assertThat(Money.dollar(5), equalTo(Money.dollar(5)));
    assertThat(Money.dollar(5), not(equalTo(Money.dollar(6))));
    assertThat(Money.franc(5), equalTo(Money.franc(5)));
    assertThat(Money.franc(5), not(equalTo(Money.franc(6))));
    assertThat(Money.dollar(5), not(equalTo(Money.franc(5))));
  }

  @Test
  public void currency() throws Throwable {
    assertThat(Money.dollar(5).currency(), equalTo("USD"));
    assertThat(Money.franc(5).currency(), equalTo("CHF"));
    
  }

  @Test
  public void differentClassEquality() throws Throwable {
    assertThat(new Franc(5, "CHF"), equalTo(new Money(5, "CHF")));
  }
}
