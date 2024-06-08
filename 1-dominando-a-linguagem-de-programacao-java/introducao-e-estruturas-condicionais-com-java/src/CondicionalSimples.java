// Este código simula um caixa eletronico que só tem a função de sacar

public class CondicionalSimples {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        // Se o valor solicidade for menor do que o meu saldo, o que está dentro do 'if' irá ser executado
        // Caso não, o sistema não faz nada, apenas printa o saldo
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
 
        System.out.println(saldo);
    }
}
