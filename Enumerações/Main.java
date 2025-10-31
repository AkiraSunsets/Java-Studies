//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Prioridade prioridade = Prioridade.ALTA;

        switch (prioridade){
            case BAIXA -> System.out.println("Chamado com prioridade baixa, resolver quando houver disponibilidade");
            case MEDIA -> System.out.println("Chamado com prioridade média, resolver assim que possível");
            case ALTA -> System.out.println("Chamado com prioridade alta, resolver o quanto antes");
            case URGENTE -> System.out.println("Chamado urgente, resolver agora");

        }
    }
}
