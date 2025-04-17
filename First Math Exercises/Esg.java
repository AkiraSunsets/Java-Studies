import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = 1;
        double B = 12;
        double C = -13;
        double delta = Math.pow (B,2) - 4 * A * C;
        System.out.printf("O delta da equação de segundo grau é" + delta);
    }
}
