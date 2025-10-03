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


    //Construtor 2 com parâmetros
    Colaborador(String nome, int edv){ //nome é função
        this.nome = nome; //this. se refere ao atributo da classe
        this.edv = edv;
        System.out.println("Construtor com 2 parâmetros foi chamado");
    }

    Colaborador(String nome, int edv, String cargo){
        this.nome = nome;
        this.edv = edv;
        this.cargo = cargo;
        System.out.println("Construtor com 3 parâmetros foi chamado");
    }
}

