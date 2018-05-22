/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class UltimaLetra {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String palavra, vogais = "";
		char letra;
		
		while (i < 5){
			palavra = sc.nextLine();
			letra = palavra.charAt(palavra.length() - 1);
		
			if (letra == 'a' || letra == 'e' || letra == 'i' || 
				letra == 'o' || letra == 'u'){
				vogais += String.valueOf(letra);
			}
		
			i++;
		}
		
		System.out.println(vogais);
	}
}
