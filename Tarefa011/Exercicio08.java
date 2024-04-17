package exercícios_básicos_com_vetores_em_java;

import java.util.Arrays;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * 8) Buscar Elemento: Escreva um programa que verifique se um determinado
		 * elemento está presente em um vetor.
		 * 
		 */
		int[] num = { 5, 2, 9, 1, 6 };
		int elemento = 9;
		System.out.println("Vetor: " + Arrays.toString(num));
		System.out.println("Elemento a buscar: " + elemento);
		if (buscarElemento(num, elemento)) {
			System.out.println("O elemento " + elemento + " está presente no vetor.");
		} else {
			System.out.println("O elemento " + elemento + " não está presente no vetor.");
		}
	}

	public static boolean buscarElemento(int[] num, int elemento) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == elemento) {
				return true;
			}
		}
		return false;
	}

}
