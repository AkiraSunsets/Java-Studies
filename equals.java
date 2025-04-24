import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String minhastring = new String("Like");
        Scanner scanner = new Scanner(System.in);
        minhastring = scanner.nextLine();
        System.out.println(minhastring.equals("Like")); //Comparação de objetos eu sempre utilizo o equals
    }
}
