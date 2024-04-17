package exercícios_básicos_com_vetores_em_java;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * 5) Elementos Pares: Escreva um programa que conte e exiba a quantidade de
		 * números pares em um vetor de inteiros.
		 * 
		 */
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        int pares = Pares(num);

        System.out.println("Quantidade de números pares no vetor: " + pares);
    }

    public static int Pares(int[] num) {
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) { 
                count++;
            }
        }
        return count;
	}

}
