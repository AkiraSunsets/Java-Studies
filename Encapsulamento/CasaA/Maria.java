package CasaA;

public class Maria {
    private String segredo = "roubei um carro";
    String facoDentroDeCasa = "ronca durante o sono"; //só quem está dentro do package A sabe
    protected String familiaSabe = "Deve no banco";
    public String todoMundoSabe = "Maria vai no bar"; //todo mundo sabe, está publico

    void teste() {
        System.out.println(this.segredo);
        System.out.println(this.facoDentroDeCasa);
        System.out.println(this.familiaSabe);
        System.out.println(this.todoMundoSabe);
    }
}
