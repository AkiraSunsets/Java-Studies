//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circulo circuloVermelho = new Circulo("Vermelho", 2);
        System.out.printf("A área do circulo %s é de %.2f", circuloVermelho.cor, circuloVermelho.calcularArea());
        }
    }
