/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class SomaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int soma = 0;
		
		while (numero != -1) {
			if (numero % 2 == 0){
				soma += numero;
			}
			numero = sc.nextInt();
		}
		
		System.out.println(soma);
	}
}
