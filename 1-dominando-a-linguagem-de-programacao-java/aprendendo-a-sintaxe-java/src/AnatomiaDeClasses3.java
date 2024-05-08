public class AnatomiaDeClasses3 {
    public static void main(String [] args) {
        
        // Declarando uma variável
        // Estrutura -> Tipo NomeBemDefinido = Atribuição do valor
        String primeiroNome = "Vívian";
        String segundoNome = "Pontes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto); // Vai printar o nome completo

    }

    // Método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
