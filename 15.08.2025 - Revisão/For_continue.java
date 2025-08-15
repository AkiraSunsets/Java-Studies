public class Main {
    public static void main(String[] args){

        for (int i = 0; i <= 10; i++) {

            if(i%2==0){ //se for par (multiplo de 2)
                continue; //reinicia o laço de repetição
            }
            System.out.println(i); //só vai printar os números impares, pois ele reinicia o laço antes do print
        }
    }
}
