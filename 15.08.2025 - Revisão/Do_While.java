import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        //primeira iteração do laço é sempre executada
        do{
            System.out.println("Diga-me algo: ");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("algo")); //! serve pra criar um loop que só para quando o usuário escrever a palavra "algo"
        //demais operações do laço, só são executadas se a condição for verdadeira
        entrada.close(); //entrada close serve pra fechar o scanner
    }
}
