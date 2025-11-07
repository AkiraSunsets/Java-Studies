public class Circulo {

    /*
    * Cor e raio são variaveis dinâmicas, elas mudam
    * de acordo com o objeto instanciado
    */
    String cor;
    double raio;
    /*static é usado para definir um valor fixo, ela pertence a uma classe
      a cada vez que uma instância se referir ao pi, ele sempre usará o mesmo espaço de memória
      que foi alocado
    */
    final static double PI = Math.PI; // em letra maiúsculas são constantes
    //final não deixa que o valor seja alterado

    public Circulo (String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea () {
        return PI * this.raio * this.raio;
    }
}
