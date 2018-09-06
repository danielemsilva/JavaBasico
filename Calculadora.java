/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class Calculadora{

	private static String adicao = "+";
	private static String subtracao = "-";
	private static String multiplicacao = "*";
	private static String divisao = "/";

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		
		if (!(op.equals(adicao) || op.equals(subtracao) || op.equals(multiplicacao) || op.equals(divisao))){
			System.out.println("ENTRADA INVALIDA");		
		} 
		else {
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();
			
			if (op.equals(divisao) && num2 == 0){		
				System.out.println("ERRO");
			} else {
				float resultado = 0;
				if (op.equals(adicao)) {
					resultado = somar(num1, num2);
				} 
				else if (op.equals(subtracao)) {
					resultado = subtrair(num1, num2);
				} 
				else if (op.equals(multiplicacao)) {
					resultado = multiplicar(num1, num2);
				} 
				else {
					resultado = dividir(num1, num2);
				}
				System.out.println("RESULTADO: " + resultado);
			}
		}

		sc.close();
	}

	private static float somar(float num1, float num2) {
		return num1 + num2;
	}

	private static float subtrair(float num1, float num2) {
		return num1 - num2;
	}

	private static float multiplicar(float num1, float num2) {
		return num1 * num2;
	}

	private static float dividir(float num1, float num2) {
		return num1 / num2;
	}
}
