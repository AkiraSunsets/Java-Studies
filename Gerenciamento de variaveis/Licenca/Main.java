//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Contagem de licenças atual: " +Licenca.retornaLicencasAtribuidas());
        Licenca windows = new Licenca("Windows", "CaP/ETS");
        System.out.println("Contagem de licenças após compra do Windows: " + Licenca.retornaLicencasAtribuidas());
        Licenca docker = new Licenca("Docker", "BD/XD");
        System.out.println("Contagem de licenças após compra do Docker: " + Licenca.retornaLicencasAtribuidas());
    }
}
