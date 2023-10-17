package com.Sorteio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorteioTest {
  String reset = "\u001B[0m";
  String green = "\u001B[32m";

  @Test
  public void testVerificarBihete() {
    int[] numerosSorteados = { 1, 2, 3, 4, 5 };
    int[] numerosBilhete1 = { 1, 2, 3, 4, 5 };
    int[] numerosBilhete2 = { 1, 7, 3, 4, 6 };
    int[] numerosBilhete3 = { 1, 4, 6 };

    Sorteio sorteio1 = new Sorteio(numerosSorteados, numerosBilhete1);
    Assertions.assertArrayEquals(numerosSorteados, numerosBilhete1);
    assertEquals("Bilhete premiado!", sorteio1.verificarBilhete());
    System.out.println(
        green + "Teste para verificar se os números do bilhete são iguais aos numeros sorteados passou" + reset);

    Sorteio sorteio2 = new Sorteio(numerosSorteados, numerosBilhete2);
    assertEquals("Não foi dessa vez!", sorteio2.verificarBilhete());
    System.out.println(green + "Teste para verificar se os números do bilhete não são iguais aos numeros sorteados passou" + reset);

    Sorteio sorteio3 = new Sorteio(numerosSorteados, numerosBilhete3);
    assertEquals("Não foi dessa vez!", sorteio3.verificarBilhete());
    System.out.println(green + "Teste para verificar se o bihete possui menos numeros do que foi sorteado passou" + reset);

  }
}
