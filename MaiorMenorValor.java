/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class MaiorMenorValor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int maior = numero;
		int menor = numero;
		
		int contador = 1;
		while (contador < 5){
			numero = sc.nextInt();
			
			if (numero > maior) {
				maior = numero;
			}
			else if (numero < menor){
				menor = numero;
			}
			
			contador++;
		}
		
		System.out.println(maior - menor);
	}
}
	
