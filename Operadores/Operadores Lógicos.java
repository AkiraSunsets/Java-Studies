public class Main {
    public static void main(String[] args) {
        //Operadores Lógicos


        //binários, possuem duas entradas

        // And (&&) - quando as duas ou mais entradas são verdadeiras

       //====Exemplo====
       // |A| |B| |X|;
       //  1   0   0
       //  0   1   0
       //  0   0   0
       //  1   1   1

        // Or - (||)
        //====Exemplo====
        //  |A| |B| |X|
        //   1   0   1 - Se ao menos uma for verdadeira, será verdadeiro
        //   0   1   1
        //   0   0   0  - Quando nenhuma for verdadeira, será falso
        //   1   1   1  - Não há diferença se ambos forem verdadeiro, o resultado final será verdadeiro


        // unário, inversor lógico
        // Not (!)

        // |A| |X| | |
        //  0   1
        //  1   falso


        // Xor
        // |A| |B| |X|
        // |0| |0| |0|
        // |0| |1| |1|
        // |1| |0| |1|  - Se um estiver ligado, a saída será true
        // |1| |1| |0|  - Se ambos estiverem ligados, não irá funcionar
        }
}
