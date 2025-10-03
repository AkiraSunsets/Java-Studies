public class Main {
    public static void main(String[] args) {

          //Colaborador com 1 parâmetro
          Colaborador colaborador = new Colaborador("Ana Beatriz"); //Instantiation
          System.out.println("Nome do colaborador: " + colaborador.nome);

          System.out.println("=============================================");
          //Colaborador com 2 parâmetros
          Colaborador colaborador2 = new Colaborador("Ana Beatriz", 9092647); //Instantiation
          System.out.println("Nome: " + colaborador2.nome);
          System.out.println("EDV: "  + colaborador2.edv);

          System.out.println("=============================================");
          //Colaborador com 3 parâmetros
          Colaborador colaborador3 = new Colaborador("Maria", 9290421, "Aprendiz");
          System.out.println("Nome do colaborador: " + colaborador3.nome);
          System.out.println("Edv: " + colaborador3.edv);
          System.out.println("Cargo: " + colaborador3.cargo);
    }
}
