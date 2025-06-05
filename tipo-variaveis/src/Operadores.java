public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        //x repetição
        numero = numero +2;
        System.out.println(numero);

        //numero = numero +1
        System.out.println(++ numero);

        //---------

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}