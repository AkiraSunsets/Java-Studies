public class Main {
    public static void main(String[] args) {
          Departamento departamento = new Departamento("ETS", 200000, 232);

          //renomear departamento
          System.out.println(departamento.nome);
          departamento.atualizarNome("BTC");
          System.out.println(departamento.nome);
          
          //aumentar orçamento
          System.out.println("O orçamento foi de: " + departamento.calcularAumentoDeOrcamento(0.20));

          //ver número de funcionários
          System.out.printf("O departamento %s tem %.0f funcionários", departamento.nome, departamento.obterNumeroDeFuncionarios());
    }
}
