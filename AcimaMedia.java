/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class AcimaMedia {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		String[] strValores = entrada.split(" ");

		int[] numeros = converterValores(strValores);
		float media = calcularMedia(numeros);
		imprimirAcimaDaMedia(numeros, media);
	}

	private static int[] converterValores(String[] strValores) {
		int[] numeros = new int[strValores.length];

		for (int i = 0; i < strValores.length; i++) {
			numeros[i] = Integer.parseInt(strValores[i]);
		}

		return numeros;
	}

	private static float calcularMedia(int[] numeros) {
		float soma = 0, media = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		media = soma / numeros.length;
		return media;
	}

	private static void imprimirAcimaDaMedia(int[] numeros, float media) {
		String acimaMedia = "";

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media){
				acimaMedia += numeros[i] +  " ";
			}
		}
		
		System.out.println(acimaMedia);
	}
	
}
