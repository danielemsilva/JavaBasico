/**
* Laboratório de Programação 2 - Lab 1
*
* @author Daniele Aparecida - 117110348
*/

import java.util.Scanner;

public class FuncaoMonotona{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		if (num1 != num2 && num1 != num2 && num1 != num3 && num1 != num4 &&
			num2 != num3 && num2 != num4 && num3 != num4){
			
			if (num1 < num2 && num1 < num2 && num1 < num3 && num1 < num4 &&
				num2 < num3 && num2 < num4 && num3 < num4){
					
				System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
			
			} 
			else if (num1 > num2 && num1 > num2 && num1 > num3 && num1 > num4 &&
				num2 > num3 && num2 > num4 && num3 > num4){
					
				System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		
			} else {
				
				System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
			
			}
		
		} else {
			
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		
		}
	}
}
