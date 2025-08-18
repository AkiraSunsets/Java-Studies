import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        String numeroEmTexto = scanner.nextLine(); //lê textos e salva com string

        try{ //cria uma solução para o erro que possa dar aqui, se o usuário digitar letras
            int NumeroEmInt = Integer.parseInt(numeroEmTexto); //solicita que somente números sejam inseridos
            System.out.println("O número que você digitou foi "+NumeroEmInt);
        }catch (NumberFormatException | InputMismatchException error){
            System.out.println("Formato incorreto, digite apenas números"); //ao colocar letras, aparecerá esta mensagem e o processo encerra
        }finally { //chamado tanto no final do try tanto do catch, ele garante que o código sempre será executado
            System.out.println("Finally é sempre executado"); //Finally é opcional
        }
    }
}
