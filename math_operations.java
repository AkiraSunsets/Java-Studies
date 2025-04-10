public class Main {
    public static void main(String[] args) {

        int numero1 = 9; // número inteiro
        int numero2 = 2;

        System.out.println(numero1+numero2); //adição
        System.out.println(numero1-numero2); //subtração
        System.out.println(numero1*numero2); //multiplicação
        System.out.println(numero1/numero2); //divisão
        System.out.println(numero1%numero2); //resto da divisão
/*
        double numero1 = 9; //número quebrado (com .)
        double numero2 = 2;

        System.out.println(numero1+numero2); //adição
        System.out.println(numero1-numero2); //subtração
        System.out.println(numero1*numero2); //multiplicação
        System.out.println(numero1/numero2); //divisão
*/
        double potencia = Math.pow(2,3);  //primeiro argumento é a base, o segundo é o expoente.
        //pow vem de power, potência. Para pow só é permitido usar double.
        System.out.println(potencia);

        double raiz = Math.sqrt(4.0); // função para raiz quadrada.
        System.out.println(raiz);

        
    }
}
