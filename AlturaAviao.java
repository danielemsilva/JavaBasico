/**
* Laboratório de Programação 2
*
* @author Daniele Aparecida - 117110348
*/
import java.util.Scanner;

public class AlturaAviao {

	private static String msgOk = "OK";
	private static String msgPerigo = "PERIGO";
	private static String msgAdeq = "ADEQUADO";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alturaIdeal = sc.nextInt();
		int alturaAtual =  sc.nextInt();
		int diferenca = calcularVariacao(alturaIdeal, alturaAtual);
		
		String[] mensagens = new String[100];
		String condicao = "";
		int contador = 0;
		
		while (!condicao.equals(msgOk)){
			alturaAtual = sc.nextInt();
			int difAtual = calcularVariacao(alturaIdeal, alturaAtual);
			
			condicao = getCondicao(difAtual, diferenca);
			
			diferenca = difAtual;
			mensagens[contador] = condicao;
			contador++;
		}

		imprimirMsgs(mensagens, contador);
	}

	private static int calcularVariacao(int alturaIdeal, int alturaAtual) {
		return Math.abs(alturaIdeal - alturaAtual);
	}

	private static String getCondicao(int diferencaAtual, int ultimaDiferenca) {
		if (diferencaAtual == 0){
			return msgOk;
		} else if (diferencaAtual > ultimaDiferenca){
			return msgPerigo;
		} else {
			return msgAdeq;
		}
	}

	private static void imprimirMsgs(String[] mensagens, int contador) {
		for (int i = 0; i < contador; i++){
			System.out.println(mensagens[i]);
		}
	}

}
