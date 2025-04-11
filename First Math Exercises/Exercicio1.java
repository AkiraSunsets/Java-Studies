import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        double fah;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        fah = input.nextDouble();
        double celsius = (fah-32) * 5/9;
        System.out.println("A temperatura de Fahreinheit convertido para Celsius é: " + celsius);

    }
}
