package exercícios_básicos_com_vetores_em_java;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4) Vetor Invertido: Implemente um programa que inverta a ordem dos elementos
		 * em um vetor.
		 * 
		 */
		int[] num = { 1, 2, 3, 4, 5, };
		System.out.println("Vetor original:");
		imprimirVetor(num);
		inverterVetor(num);
		System.out.println("Vetor invertido:");
		imprimirVetor(num);
	}

	public static void inverterVetor(int[] num) {
		int tamanho = num.length;
		for (int i = 0; i < tamanho / 2; i++) {
			int temp = num[i];
			num[i] = num[tamanho - 1 - i];
			num[tamanho - 1 - i] = temp;
		}
	}

	public static void imprimirVetor(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
