package CasaB;

import CasaA.Maria;

public class Agatha {
    Maria sogra = new Maria();
    void teste() {
        System.out.println(sogra.segredo); //private
        System.out.println(sogra.facoDentroDeCasa); //package
        System.out.println(sogra.familiaSabe); //protected
        System.out.println(sogra.todoMundoSabe); //public
    }

}
