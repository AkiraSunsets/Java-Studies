public class Mensalista extends Colaborador{ //extends é usado para definir a relação de herança entre duas classes
    double bancoDeHoras;
    double salarioMensal;

    public Mensalista(int edv, String nome, String cargo, double salarioMensal){
        //super é usado para puxar dados da classe pai
        super(edv, nome, cargo); //super é pra se referir ao pai
        this.salarioMensal = salarioMensal; //salário mensal só existe no mensalista
    }

    double receberSalario(){
        return this.salarioMensal; //retorna o valor do salário

    }

    //alt + insert + toString

    @Override
    public String toString() {
        return "Mensalista{" +
                "salarioMensal=" + salarioMensal +
                ", edv=" + edv +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }


    /* forma de implementar o toString
        @Override //serve para
        public String toString(){ //converter classe pra string
        return "Nome: " + this.nome;
     */



}
