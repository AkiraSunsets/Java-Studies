public class Main {
    public static void main(String[] args){

        for (int i = 0; i < 3; i++){

            System.out.println("Banana"); //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar

            for (int j = 0; j < 2; j++){
                System.out.println("Maçã");
                break; //quebrará o laço interno
            }
            //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar
        }
    }
}
