package com.selonj;

import java.util.Map;
import java.util.HashMap;

public class Bank {
  private final Map<Pair, Integer> rates = new HashMap<>();

  public void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }

  int rate(String from, String to) {
    return from.equals(to) ? 1 : rates.get(new Pair(from, to));
  }

  public Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }

  private static class Pair {
    private String from, to;

    private Pair(String from, String to) {
      this.from = from;
      this.to = to;
    }

    public boolean equals(Object o) {
      Pair that = (Pair) o;
      return this.from.equals(that.from) && this.to.equals(that.to);
    }

    public int hashCode() {
      return from.hashCode() * 31 + to.hashCode();
    }

  }
}
