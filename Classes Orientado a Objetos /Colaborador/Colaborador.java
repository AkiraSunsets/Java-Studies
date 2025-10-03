public class Colaborador {
    int edv;
    String cargo;
    String nome; //atributo da classe

    //Construtor padrão existe em toda classe


    //Construtor padrão ou sem parâmetros
    Colaborador() { //função desempenha uma ação
        System.out.println("O construtor sem parâmetros foi executado");
    }

    //Construtor com parâmetros
    Colaborador(String nome){ //nome é função
        this.nome = nome; //this. se refere ao atributo da classe 
        System.out.println("Construtor com um parâmetro foi chamado");
    }
}
