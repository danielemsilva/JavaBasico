/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class SomaLista {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int[] numeros = new int[5];
		
		while (contador < 5){
			numeros[contador] = sc.nextInt();
			contador++;
		}
		
		int posicao1 = sc.nextInt();
		int posicao2 = sc.nextInt();
		int soma = numeros[posicao1] + numeros[posicao2];
		
		System.out.println(soma);
		
	}
	
}
