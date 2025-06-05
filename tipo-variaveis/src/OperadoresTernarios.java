public class OperadoresTernarios {
    public static void main(String[] args) {
        //Operadores ternários

        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";
        
        System.out.println(resultado);

//Outra forma de verificar essa String.
       
    //String resultado = a == b ? "Verdadeiro" : "Falso";
        
    //System.out.println(resultado);

//--------------------------------------------------------------

//Verificando a variável a e b, se fossem do tipo int.

       // int resultado = a == b ? 1 : 0;
       //  System.out.println(resultado);

    }
}
