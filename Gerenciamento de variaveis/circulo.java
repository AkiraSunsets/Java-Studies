public class Circulo {
    String cor;
    double raio;
    double pi = 3.14;

    public Circulo (String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }
    
    double calcularArea () {
        return pi*raio*raio;
    }
}
    
