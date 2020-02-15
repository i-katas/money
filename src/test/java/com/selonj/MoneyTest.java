package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class MoneyTest {
  @Test
  public void multiplication() throws Throwable {
    Dollar five = new Dollar(5);

    assertThat(five.times(2), equalTo(new Dollar(10)));
    assertThat(five.times(3), equalTo(new Dollar(15)));
  }

  @Test
  public void equality() throws Throwable {
    assertThat(new Dollar(5), equalTo(new Dollar(5)));
    assertThat(new Dollar(5), not(equalTo(new Dollar(6))));
  }
}
