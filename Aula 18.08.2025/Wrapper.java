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
         */
        int numeroEmInt = Integer.parseInt(numeroEmTexto); //converter número em texto
        
    }
}
