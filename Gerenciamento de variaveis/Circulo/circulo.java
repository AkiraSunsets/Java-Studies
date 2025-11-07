public class Circulo {

    /*
    * Cor e raio são variaveis dinâmicas, elas mudam
    * de acordo com o objeto instanciado
    */
    String cor;
    double raio;
    static double pi = 3.14;
    /*static é usado para definir um valor fixo, ela pertence a uma classe
      a cada vez que uma instância se referir ao pi, ele sempre usará o mesmo espaço de memória
      que foi alocado
    */
    
    public Circulo (String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    double calcularArea () {
        return pi*raio*raio;
    }
}
