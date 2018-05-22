/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class Calculadora{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String op = sc.nextLine();
		
		if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
			
			System.out.println("ENTRADA INVALIDA");		
		
		} else {
		
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();
			
			if (op.equals("/") && num2 == 0){		
			
				System.out.println("ERRO");
			
			} else {
				
				float resultado = 0;
				
				if (op.equals("+")) {
			
					resultado = num1 + num2;
					
				} else if (op.equals("-")) {
					
					resultado = num1 - num2;
					
				} else if (op.equals("*")) {
					
					resultado = num1 * num2;
				
				} else {
					
					resultado = num1 / num2;
					
				}
				
				System.out.println("RESULTADO: " + resultado);
			}
		}
	}
}
