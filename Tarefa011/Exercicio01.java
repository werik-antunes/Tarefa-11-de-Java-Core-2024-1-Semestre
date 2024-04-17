package exercícios_básicos_com_vetores_em_java;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1) Soma dos Elementos: Escreva um programa que calcule a soma de todos os
		 * elementos de um vetor de inteiros.
		 * 
		 */
		int[] num = { 1, 2, 3, 4, 5 };

		int soma = soma(num);

		System.out.println("A soma é: " + soma);
	}

	public static int soma(int[] num) {
		int soma = 0;

		for (int i = 0; i < num.length; i++) {
			soma += num[i];
		}
		return soma;
	}
}
