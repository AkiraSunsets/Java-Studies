import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double valor;
        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();
        double quadrado = (valor * valor);
        System.out.printf("O valor de %s ao quadrado é %s", valor,quadrado); //printf

        double cubo = (valor*valor*valor);
        System.out.printf("O valor de %s ao cubo é %s", valor,cubo);


    }
}
