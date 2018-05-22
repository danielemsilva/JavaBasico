/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class VogalXplots {
	
	public static String vogal(String palavra) {
		String vogalMaior = "";
		String[] vogais = {"A", "E", "U", "O", "I"};
		
		int i = 0;
		
		while (vogalMaior.isEmpty()){
			
			for (int j = 0; j < palavra.length(); j++) {
				if (vogais[i].equals(palavra.substring(j, j+1))) {
					vogalMaior = vogais[i];
				}
			}
			
			i++;
		}
		
		return vogalMaior;
		
	}
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		
		System.out.println(vogal(palavra));
		
	}
}
	
