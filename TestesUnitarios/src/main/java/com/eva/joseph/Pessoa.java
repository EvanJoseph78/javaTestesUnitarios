package com.eva.joseph;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
  private String nome;
  private LocalDate nascimento;
  private int idade;

  public Pessoa(String nome, LocalDate nascimento) {
    this.nome = nome;
    this.nascimento = nascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }

  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade() {
    LocalDate dataAtual = LocalDate.of(2023, 10, 7);
    Period period = Period.between(this.nascimento, dataAtual);
    this.idade = period.getYears();
  }

  public boolean ehMaiorDeIdade() {
    return this.getIdade() >= 18;
  }
}
