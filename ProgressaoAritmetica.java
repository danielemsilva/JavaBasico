/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class ProgressaoAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int termo = sc.nextInt();
		int razao = sc.nextInt();
		
		int soma = 0;
		
		for (int i = 0; i < 3; i++){
			System.out.println(termo);
			soma += termo;
			termo += razao;
		}
		
		System.out.println(soma);
	}
}
