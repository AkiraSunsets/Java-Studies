import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        System.out.printf("Insira o valor da base: \n");
        base = scanner.nextDouble();
        double altura;
        System.out.printf("Insira o valor da altura: \n");
        altura = scanner.nextDouble();
        double area = (base*altura/2);
        System.out.println("A area do triangulo é: " + area);
    }
}
