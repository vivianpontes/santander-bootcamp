//estrutura do controle de fluxo for

/*
for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
*/

//for (declaração da variavel; enquanto a variável for 'x'; o que fazer no loop)

public class AprendendoFor {
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
        System.out.println("Joãozinho dormiu");
	}
}
