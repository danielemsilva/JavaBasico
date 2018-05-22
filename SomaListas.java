/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class SomaListas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanhoLista = sc.nextInt();
		int[] lista1 = new int[tamanhoLista];
		int[] lista2 = new int[tamanhoLista];

		// Recebe os valores da primeira lista
		for (int i = 0; i < tamanhoLista; i++){
			lista1[i] = sc.nextInt();
		}

		// Recebe os valores da segunda lista
		for (int i = 0; i < tamanhoLista; i++){
			lista2[i] = sc.nextInt();
		}

		// Soma os elementos das listas para um mesmo índice
		for (int i = 0; i < tamanhoLista; i++){
			System.out.println(lista1[i] + lista2[i]);
		}
	}
}
