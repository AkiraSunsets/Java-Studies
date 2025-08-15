public class Main {
    public static void main(String[] args){

        externo:
        for (int i = 0; i < 3; i++){

            System.out.println("Banana"); //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar

            for (int j = 0; j < 2; j++){
                System.out.println("Maçã");
                break externo; // ele quebra os 2 laços, simplificar o código
            }
            //vai printar 1 banana, vai printar 2 vezes maça e assim até acabar
        }
    }
}
