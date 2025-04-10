import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int numero; // inserindo um número inteiro
        
        Scanner input = new Scanner(System.in); // função input (pedir ao usuário que digite um número
        System.out.println("Digite um número: ");
        numero = input.nextInt();  //receber números inteiros
        System.out.print("O número que você digitou foi: " + numero); // concatenção
        input.close(); // finaliza o scanner, necessário demais!!
/////////////////////////////////////////////////////////////////////////////////////////////////
        String palavra; // para escrever letras
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: "); 
        palavra = entrada.nextLine(); // receber strings
        System.out.print("A palavra que você digitou foi: " + palavra);
//////////////////////////////////////////////////////////////////////////////////////////////////
        String nome, sobrenome; //declarando duas variáveis

        Scanner scanner = new Scanner(System.in); // só declara uma vez
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine(); // lê tudo, incluindo espaços
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.printf("O meu nome é %s e meu sobrenome é %s", nome,sobrenome); // %s é máscara para string
        scanner.close();

//////////////////////////////////////////////////////////////////////////////////////////////////
        String nome, sobrenome; // Três entradas.
        int idade;
        
        Scanner scanner = new Scanner(System.in);// só declara uma vez
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); //primeira maneira, colocado para limpar o buffer (vazio)
        System.out.print("Digite o seu sobrenome: ");
        sobrenome = scanner.nextLine();
    }
}
