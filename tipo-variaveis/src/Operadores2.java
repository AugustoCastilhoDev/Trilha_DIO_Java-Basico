public class Operadores2 {
    public static void main(String[] args) {
        String nomeUm = "Augusto";
        String nomeDois = new String("Augusto");

        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){//true
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("NumeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;
        
        System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que numeroDois? " + simNao);

    }
    
    
}
