package com.eva.joseph;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
  @Test
  void deveCalcularIdadeCorretamente() {
    Pessoa evan = new Pessoa("Evan", LocalDate.of(1998, 4, 2));
    Assertions.assertEquals(25, evan.getNascimento());
  }

  @Test
  void deveRetornarSeEhMaiorDeIdade() {
    Pessoa evan = new Pessoa("Evan", LocalDate.of(1998, 4, 2));
    Assertions.assertTrue(evan.ehMaiorDeIdade());

    Pessoa joseph = new Pessoa("Evan", LocalDate.of(2023, 4, 2));
    Assertions.assertTrue(joseph.ehMaiorDeIdade());
  }
}
