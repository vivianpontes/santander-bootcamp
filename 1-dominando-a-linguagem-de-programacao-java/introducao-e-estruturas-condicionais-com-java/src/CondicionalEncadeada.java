// Esse código avalia se o aluno foi aprovado, em recuperação ou reprovado, baseado em sua nota

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Prova de Recuperação");
	else
		System.out.println("Reprovado");
    }
}
