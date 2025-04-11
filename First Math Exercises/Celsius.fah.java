import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        celsius = input.nextDouble();
        double fah = (celsius*9/5) + 32;
        System.out.println("A temperatura de celsius em Fahreinheit é:" +fah);

    }
}

