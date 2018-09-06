/**
* Laboratório de Programação 2
* Verifica a quantidade de itens pares da lista
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class SomaElementosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		int [] numeros = converterInteiro(entrada);
		System.out.println(somarOsPares(numeros));
	}

	private static int[] converterInteiro(String[] strNumeros) {
		int[] numeros = new int[strNumeros.length];
		for (int i = 0; i < strNumeros.length; i++) {
			numeros[i] = Integer.valueOf(strNumeros[i]);
		}
		return numeros;
	}

	private static int verificaPar(int numero){
		if (numero == 0 || numero % 2 == 0){
			return 1;
		} else { 
			return 0; 
		}
	}

	private static int somarOsPares(int[] numeros) {
		int qtdPares = 0;
		for (int i = 0; i < numeros.length; i++) {
			qtdPares += verificaPar(numeros[i]);
		}
		return qtdPares;
	}
}
