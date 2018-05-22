 import java.util.Scanner;
 
 public class MediaAritmetica{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		float media = (num1 + num2) / 2;
		if (media >= 7.0){
			System.out.println("pass: True!");
		} else {
			System.out.println("pass: False!");
		}
	}
}
