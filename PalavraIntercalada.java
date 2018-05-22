/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class PalavraIntercalada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] linha1 = sc.nextLine().split(" ");
		String[] linha2 = sc.nextLine().split(" ");
				
		for (int i = 0; i < linha1.length; i++){
			System.out.println(linha1[i] + " " + linha2[i]);
		}
	}
}
