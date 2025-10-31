//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Horista Daniela = new Horista(92902233, "Daniela", "Auxiliar Administrativo", 240, 8.50);
        System.out.printf("O salário de Daniela é: %.2fR$ ", Daniela.receberSalario());
    }
}
