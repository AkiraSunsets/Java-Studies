public class Main {
    public static void main(String[] args) {

        //Strings
        String variavelString = "Ketlyn L N de Araújo!";
        System.out.println(variavelString.length()); // conta a quantidade de caracteres de uma string
        System.out.println(variavelString.toUpperCase()); // tudo em letra minúscula
        System.out.println(variavelString.toLowerCase()); // tudo em letra maiúscula
        System.out.println(variavelString.charAt(6));

        String variavelStrings = "Welcome to Campinas";
        variavelStrings = variavelStrings + "!!!"; // concatenação
        System.out.println(variavelStrings+"!!!"); //(está dentro do print) +_"TEXTO" concatenação de strings, junta duas strings
        System.out.println(variavelStrings);
    }
}
