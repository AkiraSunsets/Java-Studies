import java.security.DigestInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String valor = "";

        //Toda vez que o usuário digitar algo diferente de sair, o código continua,
        //quando o usuário digitar a palavra "sair", o código encerra

        //Usamos o while quando não é definido quantas vezes o laço irá se repetir.

        //enquanto determinada expressão for verdadeira, execute o código

        //strings só se compara com metodo equals, não utilize ==

        // == só se utiliz para tipo primitivo de dados, int, double, boolean, e etc.
        while(!valor.equalsIgnoreCase("sair")){
            System.out.println("Digite algo: ");
            valor = entrada.nextLine();
        }
    }
}
