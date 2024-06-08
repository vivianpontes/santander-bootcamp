public class AprendendoBreakEContinue {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }
        /*Qual a saída no console ?
        * 1
        * 2
        * pois quando for 3, chega no 'break' e o código sai
        */

        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
        }

        /*Qual a saída no console ?
        * 1
        * 2
        * pois quando for 3, chega no 'continue' e volta para o loop
        * mudou o fluxo do 'for' temporariamente
        * 4
        * 5
        */
    }
}
