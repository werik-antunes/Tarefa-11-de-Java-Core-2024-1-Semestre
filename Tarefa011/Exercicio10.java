package exercícios_básicos_com_vetores_em_java;
import java.util.Arrays;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10) União de Vetores: Crie um programa que una dois vetores em um terceiro
		 * vetor, mantendo a ordem dos elementos.
		 */
		int[] num1 = { 1, 2, 3 };
		int[] num2 = { 4, 5, 6, 7 };
		int[] numUniao = unirVetores(num1, num2);
		System.out.println("Vetor 1: " + Arrays.toString(num1));
		System.out.println("Vetor 2: " + Arrays.toString(num2));
		System.out.println("Vetor União: " + Arrays.toString(numUniao));
	}

	public static int[] unirVetores(int[] num1, int[] num2) {
		int tamanhoUniao = num1.length + num2.length;
		int[] vetorUniao = new int[tamanhoUniao];

		for (int i = 0; i < num1.length; i++) {
			vetorUniao[i] = num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			vetorUniao[num1.length + i] = num2[i];
		}

		return vetorUniao;
	}

}


}
