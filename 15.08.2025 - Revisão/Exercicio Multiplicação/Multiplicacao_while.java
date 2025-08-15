public class Main {
    public static void main(String[] args){

        int contador = 1;

        while (contador<= 10){
            int i = 1;
            while (i <= 10) {
                System.out.printf("%d" + "x" + "%d" + "=" + "%d\n", contador, i, contador * i);
                i++;
            }
            contador++;
            System.out.println();
        }
    }
}
