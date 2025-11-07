//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Investimento investimentodeAna = new Investimento("Ana", 1000);
        Investimento investimentodeNick = new Investimento("Nick", 1000);

        Investimento.taxaDeRentabilidade = 0.03;

        System.out.printf("O investimento de %s está com o saldo de R$%.2f\n", investimentodeAna.nomeDoInvestidor, investimentodeAna.saldoAtual);
        System.out.printf("O investimento de %s está com o saldo de R$%.2f\n", investimentodeNick.nomeDoInvestidor, investimentodeNick.saldoAtual);
        investimentodeAna.rentabilizar();
        investimentodeNick.rentabilizar();
        System.out.printf("O investimento de %s está com o saldo de R$%.2f\n", investimentodeAna.nomeDoInvestidor, investimentodeAna.saldoAtual);
        System.out.printf("O investimento de %s está com o saldo de R$%.2f\n", investimentodeNick.nomeDoInvestidor, investimentodeNick.saldoAtual);
    }
}
