import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //O programa só aceita números e esses números devem ser maior ou igual a 20
        //caso forem menores ou forem outros tipos de texto, o programa pede para digitar novamente
        //o programa só encerra quando atender os critérios

        int numero;
        while (true) { //laço infinito
            try {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt(); //salva o número

                break;
                
            } catch (InputMismatchException error) { //erro do scanner
                System.out.println("Opa... Você digitou caracteres inválidos, digite apenas números");
            }
            scanner.nextLine();
        }
            System.out.println(numero);
        }
}
