public class TipoEVariaveis3 {
    public static void main(String[] args) throws Exception{
    
    // Variaveis podem mudar de um valor para o outro, desde que seja para um valor correspondente

    short numeroCurto = 1;
    int numeroNormal = numeroCurto; // O 'int' suporta um valor 'short', porém dá para colocar um 'int' dentro de um 'short'
    // short numeroCurto2 = numeroNormal; 
    // uma solução é fazer um 'Casting' = pega um tipo mais abrangente e converte para um tipo mais específico:
    short numeroCurto2 = (short) numeroNormal;
    }
}
