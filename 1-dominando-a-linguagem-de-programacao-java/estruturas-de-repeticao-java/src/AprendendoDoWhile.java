/*Do Whhile = Faça enquanto
Testa após executar o código

Estrutura do controle de fluxo do while:
do{
    comando que será executado até que a 
    expressão de validação torne-se falsa 
} while (expressão booleana de validação);
*/

import java.util.Random;

public class AprendendoDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}

    // Diz se atendeu ou não atendeu
    // 1 = ele atendeu
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
