import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        double peso;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        peso = scanner.nextDouble();
        double altura;
        System.out.println("Digite sua altura em metros: ");
        altura = scanner.nextDouble();
        double IMC = (peso / (altura * altura));
        System.out.println("O seu IMC é:" + IMC);
    }
}
