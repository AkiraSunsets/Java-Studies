public class Main {
    public static void main(String[] args) {
    //Tipos de variaveis inteiras
        byte variavelByte = 127; //Padrão Camel Case = first word starts with lowercase letter and seccond word with uppercase letter
        System.out.println(variavelByte);

        System.out.printf("Tamanho do byte: %d e também %d",variavelByte,10);
        // printf é o print formatado, onde as váriaveis são trocadas por máscaras de substituição
        /*
        * Tipos das mascaras
        * %d - inteiros - byte, short, int, long
        * %f - reais - float, double
        * %c - caractere - char
        * %s - string
         */
        short variavelShort = 32444;
        System.out.printf("Tamanho do short: %d\n", variavelShort);

        int variavelInt = 2_147_483_647;
        System.out.printf("Tamanho do int: %d\n", variavelInt);

        long variavelLong = 9_223_372_036_854_775_807L; //Obrigatório colocar a letra L
        System.out.printf("Tamanho do long: %d\n", variavelLong);

        //Reais

        float variavelFloat = 3.4e+38F; // Obrigatório letra F pra funcionar
        System.out.printf("Valor de float: %f\n", variavelFloat);

        double variavelDouble = 1.7e+308;
        System.out.printf("Valor de double: %f\n", variavelDouble);

        double variavelTeste = 3.1415678;
        System.out.printf("Valor da variavel teste: %.3f\n", variavelTeste);

    }
}
