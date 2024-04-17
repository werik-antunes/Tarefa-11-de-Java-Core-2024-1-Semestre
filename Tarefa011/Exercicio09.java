package exercícios_básicos_com_vetores_em_java;

import java.util.Arrays;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * 9) Remover Elemento: Desenvolva um programa que remova todas as ocorrências
		 * de um elemento específico de um vetor.
		 * 
		 */
		int[] num = { 5, 2, 9, 1, 6, 9, 7, 9 };
		int elementoParaRemover = 9;
		System.out.println("Vetor original: " + Arrays.toString(num));
		num = removerElemento(num, elementoParaRemover);
		System.out.println(
				"Vetor após remover todas as ocorrências de " + elementoParaRemover + ": " + Arrays.toString(num));
	}
	public static int[] removerElemento(int[] num, int elemento) {
		int ocorrencias = 0;	
		for (int i = 0; i < num.length; i++) {
			if (num[i] == elemento) {
				ocorrencias++;
			}
		}
		int[] novoVetor = new int[num.length - ocorrencias];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != elemento) {
				novoVetor[index++] = num[i];
			}
		}
		return novoVetor;
	}

}
