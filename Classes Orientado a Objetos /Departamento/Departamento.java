public class Departamento {
    String nome;
    double orcamento;
    int numeroFuncionarios;

    public Departamento(String nome, double orcamento, int numeroFuncionarios){
        this.nome = nome;
        this.orcamento = orcamento;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Atualizar nome
    void atualizarNome(String nome){
        //void são métodos que não possuem retorno
        this.nome = nome;
    }


    void exibirDetalhes() { // Nome de método segue o padrão camel case
        System.out.printf(
                "O departamento de %s está com %d funcionários e com o orçamento de %.2f\n",
                this.nome, this.numeroFuncionarios, this.orcamento);
    }

    double calcularAumentoDeOrcamento (double percentual){
        return (orcamento*percentual) + orcamento;
    }

    double obterNumeroDeFuncionarios () {
        return numeroFuncionarios;
    }
}
