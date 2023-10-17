package com.Sorteio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SorteioTest {
  String reset = "\u001B[0m";
  String green = "\u001B[32m";
   private static Sorteio sorteio;

    @BeforeAll
    public static void setUp() {
        int[] numerosSorteados = {1, 2, 3, 4, 5};
        int[] numerosBilhete = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(numerosSorteados, numerosBilhete);
        sorteio = new Sorteio(numerosSorteados, numerosBilhete);
    }
    @AfterAll
    public static void tearDown() {
        // Limpar qualquer estado após a execução de todos os testes
        sorteio = null;
    }
    @Test
    public void testBilhetePremiado() {
        assertEquals("Bilhete premiado!", sorteio.verificarBilhete());
        System.out.println(
        green + "Test para validar bilhete premiado passou" + reset);
    }
    @Test
    public void testBilheteComNumerosDivergentes() {
        int[] numerosBilheteNaoPremiado = {1, 2, 3, 4, 6};
        sorteio = new Sorteio(sorteio.getNumerosSorteados(), numerosBilheteNaoPremiado);
        assertEquals("Não foi dessa vez!", sorteio.verificarBilhete());
        System.out.println(green + "Teste para validar bilhete com numeros divergentes dos sorteados passou" + reset);
    }
     @Test
    public void testBilheteComQuantidadeMenor() {
        int[] numerosBilheteNaoPremiado = {1,4, 6};
        sorteio = new Sorteio(sorteio.getNumerosSorteados(), numerosBilheteNaoPremiado);
        assertEquals("Não foi dessa vez!", sorteio.verificarBilhete());
        System.out.println(green + "Teste para validar bilhete com quantidade de numeros menor que os sorteados passou" + reset);
    }

}
