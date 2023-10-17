package com.calculadora;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CalculadoraTest extends TestCase {
  String reset = "\u001B[0m";
  String green = "\u001B[32m";

  @Test
  public void testSomarPositivo() {
    Calculadora calculadora = new Calculadora();

    // Teste com números positivos
    int resultadoPositivo = calculadora.somar(2, 3);
    assertEquals(5, resultadoPositivo);
    System.out.println(green + "Teste com números positivos passou" + reset);
  }
  public void testSomarNegativo() {
    Calculadora calculadora = new Calculadora();
    // Teste com números negativos
    int resultadoNegativo = calculadora.somar(-2, -3);
    assertEquals(-5, resultadoNegativo);
    System.out.println(green +"Teste com números negativos passou" + reset);
  }
  public void testSomarPositivoNegativo() {
    Calculadora calculadora = new Calculadora();
    // Teste com um número positivo e um negativo
    int resultadoPosNeg = calculadora.somar(5, -3);
    assertEquals(2, resultadoPosNeg);
    System.out.println(green + "Teste com números positivo e um negativo passou" + reset);
  }
}