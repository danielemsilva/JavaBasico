/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class MaiorMenorPalavra {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra1 = sc.nextLine();
		String palavra2 = sc.nextLine();
		
		if(palavra1.length() < palavra2.length()) {
			System.out.println(palavra1);
			System.out.println(palavra2);
		}
		else if(palavra2.length() < palavra1.length()) {
			System.out.println(palavra2);
			System.out.println(palavra1);
		}
		else {
			System.out.println(palavra1);
			System.out.println(palavra1);
		}
	}
}
	
