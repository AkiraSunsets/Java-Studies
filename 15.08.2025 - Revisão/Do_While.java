import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        do{
            System.out.println("Diga-me algo: ");
            valor = entrada.nextLine();
        } while (!valor.equalsIgnoreCase("algo")); //! serve pra criar um loop que só para quando o usuário escrever a palavra "algo"
        entrada.close();
    }
}
