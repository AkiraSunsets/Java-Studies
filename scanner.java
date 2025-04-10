import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero; // inserindo um número inteiro
        Scanner input = new Scanner(System.in); // função input (pedir ao usuário que digite um número
        System.out.println("Digite um número: ");
        numero = input.nextInt();  //receber números inteiros
        System.out.print("O número que você digitou foi: " + numero); // concatenção
        input.close(); // finaliza o scanner, necessário demais!!

    }
}
