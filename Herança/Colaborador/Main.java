//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Isabella", "12345678", "isabella@gmail.com");
        usuario.autenticar();
        UsuarioAdmin usuarioAdmin = new UsuarioAdmin("Murilo", "12345678", "Murilo@gmail.com");
        usuarioAdmin.autenticar();
    }
}
