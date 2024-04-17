package exercícios_básicos_com_vetores_em_java;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2) Maior e Menor Valor: Crie um programa que encontre o maior e o menor valor
		 * em um vetor de números inteiros.
		 * 
		 */
		int[] numero = { 5, 3, 9, 1, 7 };

		int maior = enconMaior(numero);
		int menor = enconMenor(numero);

		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
	}

	public static int enconMaior(int[] numero) {
		int maior = numero[0];

		for (int i = 1; i < numero.length; i++) {
			if (numero[i] > maior) {
				maior = numero[i];
			}
		}

		return maior;
	}

	public static int enconMenor(int[] numero) {
		int menor = numero[0];

		for (int i = 1; i < numero.length; i++) {
			if (numero[i] < menor) {
				menor = numero[i];
			}
		}

		return menor;
	}

}
