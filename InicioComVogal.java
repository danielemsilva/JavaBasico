/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class InicioComVogal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] iniciaComVogal = new String[5];
		
		for (int i = 0; i < 5; i++) {
			String palavra = sc.nextLine();
			
			if (palavra.charAt(0) == 'a') {
				iniciaComVogal[i] = "s";
			} else {
				iniciaComVogal[i] = "n";
			}
		}	
		for (int i = 0; i < 5; i++) {
			System.out.println(iniciaComVogal[i]);
		}
	}
}
