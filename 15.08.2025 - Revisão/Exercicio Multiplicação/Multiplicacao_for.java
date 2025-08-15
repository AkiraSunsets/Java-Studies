public class Main {
    public static void main(String[] args){

        for (int num1 = 1; num1 <= 10; num1++){

            System.out.println("Tabuada do " + num1 + ":"); //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar

            for (int j = 1; j <= 10; j++){
                int Multiplicacao = num1 * j;
                System.out.printf("\t%d" + "x" + "%d" + "=" + "%d\n", num1, j, Multiplicacao);
            }
        }
    }
}
