/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class JogoAdivinhacao {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numEscolhido = sc.nextInt();
		int tentativa;
		do {
			tentativa = sc.nextInt();
			if (tentativa > numEscolhido){
				System.out.println("MAIOR");
			} else if (tentativa < numEscolhido){
				System.out.println("MENOR");
			} else {
				System.out.println("ACERTOU");
			}
			
		} while(numEscolhido != tentativa);
	}
}
