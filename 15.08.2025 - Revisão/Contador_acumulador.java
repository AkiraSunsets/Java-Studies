import java.security.DigestInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int contador = 0, acumulador = 0; 

        while (contador<5){
            System.out.println(contador); //vai printar de 0 a 4
            contador++; //o ++ serve para dar um break
            System.out.print("Digite um número: "); //pede ao usuário para inserir um número
            acumulador += entrada.nextInt();
            //acumulador = acumulador + entrada.nextInt()
            entrada.nextLine();
            System.out.printf("Contador está em %d e " + "o acumulador está %d\n", contador, acumulador);
            //contador conta quantas vezes o comando está sendo executado, e o acumulador acumula o valor que entra
        }
    }
}
