public class Main {
    public static void main(String[] args) {
        double media = 7.1;
        int faltas = 20;
        boolean postura = true;

        String situacao;

        if(media >= 5.0 && faltas < 25 && postura==true){
            //Caso seja verdadeiro, ele irá executar os comandos dentro das chaves
            situacao = "aprovado";
        }
        else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "recuperação";
        }
        else if (media >= 5.0 && faltas>= 25 && postura ){
            situacao = "sem férias";
        }
        else if (media >= 5.0 && faltas <25 && !postura) { //! é igual a ==
            situacao = "chamar pra conversar";
        }
        else {
            situacao = "reprovado";
        }

        System.out.println(situacao);
        /*
        Para ser aprovado, ele precisa que as 3 sejam verdadeiras.
        média>=5
        faltas < 25
        postura = true

        * se falhar na média = recuperação

        * se falhar nas faltas = sem férias

        * se falhar na postura = chamar para conversar


        // Se ele falhar em dois ou mais critérios, será reprovado diretamente
         */
        }
}
