package com.eva.joseph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
  @Test
  void validarLancamentos() {
    int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
    int[] segundoLancamento = { 1, 2, 3, 4, 5 };

    Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
  }
}
