package com.selonj;

public interface Expression {
  Money reduce(Bank bank, String to);
}
