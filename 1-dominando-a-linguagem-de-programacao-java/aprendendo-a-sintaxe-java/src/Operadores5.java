public class Operadores5 {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b;
        a = 5;
        b = 6;

        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b) 
            resultado = "verdadeiro";
        else 
            resultado = "falso";
        */

        //Forma abreviada, usando o Operador Ternário
        String resultado = a==b ? "verdadeira" : "falso";
        System.out.println(resultado);
    }
}
