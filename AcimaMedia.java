/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class AcimaMedia {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		String[] valores = linha.split(" ");
		
		int[] listaNumeros = new int[valores.length];
		float media = 0;
		String acimaMedia = "";
		
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = Integer.parseInt(valores[i]);
			media += listaNumeros[i];
		}
		
		media = media / listaNumeros.length;
		
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] > media){
				acimaMedia += listaNumeros[i] +  " ";
			}
		}
		System.out.println(acimaMedia);
	}
}
