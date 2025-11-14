package CasaB;

import CasaA.Maria;

public class João extends Maria {
    void teste() {
        System.out.println(super.segredo); //private, só ve na mesma classe
        System.out.println(super.facoDentroDeCasa); //package - só ve o mesmo pacote
        System.out.println(super.familiaSabe); // protected - pode ver em pacotes diferentes desde que exista a relação de herança
        System.out.println(super.todoMundoSabe); // public - todas as classes podem ver


    }

}
