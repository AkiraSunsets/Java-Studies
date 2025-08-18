import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroEmTexto = scanner.nextLine();
        //Wrapper:
        /*
        Tipos primitivos são básicos, salvam somente valores
        Wrappers: são complexos, tem valores e funções
        Exemplos de wrappers: Integer, Double, Boolean, Character
        Obs: tipos primitivos são sempre com letras minúsculas. Wrappers iniciam com letra maiúscula

        ParseInt -- Converte strings em números inteiros
         */
        int numeroEmInt = Integer.parseInt(numeroEmTexto); //converter número em texto
        //ParseDouble - converte String em números do tipo double
        Double numeroEmDouble = Double.parseDouble(numeroEmTexto);

        System.out.println(numeroEmDouble+18); //quando soma um int dom double, ele soma em double pra não perder informação

    }
}
