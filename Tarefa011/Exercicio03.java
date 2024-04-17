package exercícios_básicos_com_vetores_em_java;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3) Média dos Elementos: Desenvolva um programa que calcule a média dos
		 * elementos em um vetor de números reais.
		 */
		double[] num = { 9.5, 7.5, 7.7, 4.5, 5.5 }; 
		double media = Media(num);
		System.out.println("A média dos elementos do vetor é: " + media);
	}
	public static double Media(double[] vetor) {
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		double media = soma / vetor.length;
		return media;
	}
}
