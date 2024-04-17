package exercícios_básicos_com_vetores_em_java;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7) Ordenação Crescente: Implemente um algoritmo que ordene os elementos de um
		 * vetor em ordem crescente.
		 * 
		 */
		int[] num = { 5, 2, 9, 1, 6 };

		System.out.println("Vetor original:");
		exibirVetor(num);

		ordenarCrescente(num);

		System.out.println("\nVetor ordenado crescentemente:");
		exibirVetor(num);
	}

	public static void ordenarCrescente(int[] num) {
		int n = num.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (num[j] > num[j + 1]) {

					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
	}

	public static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
	}

}
