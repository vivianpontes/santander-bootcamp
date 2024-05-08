public class Operadores6 {
    public static void main(String[] args) {
        //Operadores Relacionais: nos auxiliam em tomadas de decisão e/ou controle de fluxo

        int numero1 = 1;
        int numero2 = 2;

        //Numero1 é igual ao Numero2 ? 
        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //Numero1 é diferente ao Numero2 ? 
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        //Numero1 é maior ao Numero2 ? 
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        //Comparando textos ou objetos
        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";

        //nomeUm é igual a nomeDois?
        System.out.println(nomeUm == nomeDois);

        nomeUm = "GLEYSON";
        nomeDois = new String("GLEYSON");

        //nomeUm é igual a nomeDois?
        //'.equals' compara conteudos, ideal para comparar objetos
        System.out.println(nomeUm.equals(nomeDois));
    }
}