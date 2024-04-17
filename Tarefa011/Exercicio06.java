package exercícios_básicos_com_vetores_em_java;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6) Frequência de Elementos: Crie um programa que determine a frequência de
		 * cada elemento único em um vetor.
		 * 
		 */
		int[] vetor = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3 };
		Map<Integer, Integer> frequencia = new HashMap<>();
		for (int elemento : vetor) {
			if (frequencia.containsKey(elemento)) {
				frequencia.put(elemento, frequencia.get(elemento) + 1);
			} else {
				frequencia.put(elemento, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
			System.out.println("Elemento: " + entry.getKey() + " - Frequência: " + entry.getValue());
		}
	}

}
