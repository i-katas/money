package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class MoneyTest {
  @Test
  public void multiplication() throws Throwable {
    Dollar five = new Dollar(5);

    Dollar product = five.times(2);
    assertThat(product.amount, equalTo(10));

    product = five.times(3);
    assertThat(product.amount, equalTo(15));
  }

  @Test
  public void equality() throws Throwable {
    assertThat(new Dollar(5), equalTo(new Dollar(5)));
    assertThat(new Dollar(5), not(equalTo(new Dollar(6))));
  }
}
