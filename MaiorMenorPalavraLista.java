/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class MaiorMenorPalavraLista {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.nextLine();
		String menorPalavra = palavra;
		String maiorPalavra = palavra;
		
		int contador = 1;
		while (contador < 5){
			palavra = sc.nextLine();
			
			if (palavra.length() > maiorPalavra.length()) {
				maiorPalavra = palavra;
			}
			else if (palavra.length() < menorPalavra.length()){
				menorPalavra = palavra;
			}
			
			contador++;
		}
		
		System.out.println(menorPalavra);
		System.out.println(maiorPalavra);
	}
}
	
