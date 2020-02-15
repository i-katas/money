package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MoneyTest {
  @Test
  public void multiplication() throws Throwable {
    Dollar five = new Dollar(5);

    Dollar product = five.times(2);
    assertThat(product.amount, equalTo(10));

    product = five.times(3);
    assertThat(product.amount, equalTo(15));
  }
}
