import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { //primeiro tenta executar um bloco de código
            int numero = scanner.nextInt(); //espera receber um número inteiro
            System.out.println(numero);

        } catch (Exception error) { //exception é a classe mãe de todos os erros, //inputMismatchException é o erro do scanner
            //caso ele não consiga, o catch identifica o erro e lança uma tentativa
            System.out.println("Digite apenas números inteiros: ");
        }
    }
}
