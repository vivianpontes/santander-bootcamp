/* 
Array -> lista
- Conjunto de elementos de um tipo correspondente
- Podemos ter um array de int, string, double, e por ai vai
- Sempre começam da posição [0]
*/

// O código abaixo mostra o nome do aluno de acordo com a sua posição no array
public class ForEmArrays {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
      //for (inicialização da viarável 'x'; enquanto 'x' for menor do que o tamanho de 'alunos'; soma +1)
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
