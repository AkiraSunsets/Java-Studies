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


        //Exemplos práticos:

        boolean condicao1 = true;
        boolean condicao2 = 15<12;

        System.out.println(condicao1);
        System.out.println(condicao2);
        System.out.println(condicao1 && condicao2); // falso, pq em && as duas precisam ser verdadeiras (AND)
        System.out.println(condicao1 || condicao2); // true, pois ao menos uma é verdadeira (OR)
        System.out.println(!condicao1); // (NOT) - 
        System.out.println(condicao1^condicao2); // (XOR) - true, Eles possuem condições diferentes
 
        }
}
