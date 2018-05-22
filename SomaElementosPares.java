/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class SomaElementosPares {

	private static int verificaPar(int numero){
		if (numero == 0 || numero % 2 == 0){
			return 1;
		} else { 
			return 0; 
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numeros = sc.nextLine();
		int qtdPares = 0;

		// Verifica a quantidade de itens pares da lista
		for (int i = 0; i < numeros.length(); i++) {
			String numString = String.valueOf(numeros.charAt(i));

			if (!numString.equals(" ")){
				qtdPares += verificaPar(Integer.parseInt(numString));
			}
		}

		System.out.println(qtdPares);
	}
}
