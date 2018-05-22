/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class AlturaAviao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alturaIdeal = sc.nextInt();
		int alturaAtual =  sc.nextInt();
		int diferenca = Math.abs(alturaIdeal - alturaAtual);
		
		String[] mensagens = new String[100];
		String condicao = "";
		int indice = 0;
		
		while (!condicao.equals("OK")){
			alturaAtual = sc.nextInt();
			int difAtual = Math.abs(alturaIdeal - alturaAtual);
			
			if (difAtual == 0){
				condicao = "OK";
			} else if (difAtual > diferenca){
				condicao = "PERIGO";
			} else {
				condicao = "ADEQUADO";
			}
			
			diferenca = difAtual;
			mensagens[indice] = condicao;
			indice++;
		}
		
		for (int i = 0; i < indice; i++){
			System.out.println(mensagens[i]);
		}
	}
}
