/* While = enquanto
testa a condição antes de testar o código

estrutura do controle de fluxo while
   while (expressão booleana de validação) {
        comando que será executado até que a 
        expressão de validação torne-se falsa 
    }
*/

import java.util.concurrent.ThreadLocalRandom;

public class AprendendoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // método que irá dar um valor aleatório ao valor do doce
    private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}


