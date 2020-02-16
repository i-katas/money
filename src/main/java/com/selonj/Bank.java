package com.selonj;

public class Bank {
  public void addRate(String from, String to, int rate) {
  }

  public Money reduce(Expression source, String to) {
    return source.reduce(to);
  }
}
