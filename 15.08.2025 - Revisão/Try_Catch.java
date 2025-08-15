import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { //try prevenir erros
            int numero = scanner.nextInt(); //espera receber um número inteiro
            System.out.println(numero);
            
        } catch (Exception error) { //quando o usuário digitar algo que não for número, vai aparecer essa mensagem na tela
            System.out.println("Digite apenas números");
        }
    }
}
