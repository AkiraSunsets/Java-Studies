//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Instrutor instrutor = new Instrutor("Leo");
     Treinamento treinamento = new Treinamento ("Power BI", 4000, true, instrutor);
     Treinamento treinamento1 = new Treinamento();
        System.out.println(treinamento1);
    }
}
