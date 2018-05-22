/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class Gastos {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] semana1 = sc.nextLine().split(" ");
		String[] semana2 = sc.nextLine().split(" ");
		String[] semana3 = sc.nextLine().split(" ");
		String[] semana4 = sc.nextLine().split(" ");
		
		System.out.println(somaValores(semana1) + " " + menorValor(semana1) + " " + maiorValor(semana1));
		System.out.println(somaValores(semana2) + " " + menorValor(semana2) + " " + maiorValor(semana2));
		System.out.println(somaValores(semana3) + " " + menorValor(semana3) + " " + maiorValor(semana3));
		System.out.println(somaValores(semana4) + " " + menorValor(semana4) + " " + maiorValor(semana4));
	}
	
	public static int somaValores(String[] lista){
		int soma = 0;
		
		for (int i = 0; i < lista.length; i++){
			int num = Integer.parseInt(lista[i]);
			soma += num;
		}
		
		return soma;
	}
	
	public static int maiorValor(String[] lista){
		int maior = 0;
		
		for (int i = 0; i < lista.length; i++){
			int num = Integer.parseInt(lista[i]);
			if (num > maior){
				maior = num;
			}
		}
		return maior;
	}
	
	public static int menorValor(String[] lista){
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < lista.length; i++){
			int num = Integer.parseInt(lista[i]);
			if(num < menor){
				menor = num;
			}
		}
		return menor;
	}
}
