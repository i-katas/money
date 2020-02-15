package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MoneyTest {
  @Test
  public void multiplication() throws Throwable {
    Dollar five = new Dollar(5);

    five.times(2);

    assertThat(five.amount, equalTo(10));
  }
}
