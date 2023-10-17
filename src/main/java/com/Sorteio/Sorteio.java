package com.Sorteio;

public class Sorteio {
    private int[]numerosSorteados;
    private int[]numerosBilhete;

    public Sorteio(int[] numerosSorteados, int[] numerosBilhete) {
        this.numerosSorteados = numerosSorteados;
        this.numerosBilhete = numerosBilhete;
    }

    public String verificarBilhete(){
        if(numerosSorteados.length != numerosBilhete.length){
            return "Não foi dessa vez!"; // Arrays de tamanhos diferentes
        }
        for(int numero = 0; numero < numerosSorteados.length; numero++){
            if(numerosSorteados[numero] != numerosBilhete[numero]){
                return "Não foi dessa vez!"; // Números não coincidem
            }
        }
        return "Bilhete premiado!"; // Números coincidem
    }
    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }
}
