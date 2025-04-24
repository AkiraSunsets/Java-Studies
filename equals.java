import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String minhastring = new String("Like a Bosch");
        Scanner scanner = new Scanner(System.in);
        minhastring = scanner.nextLine();
        System.out.println(minhastring.equals("Like a Bosch")); //Comparação de objetos eu sempre utilizo o equals
    }
}
