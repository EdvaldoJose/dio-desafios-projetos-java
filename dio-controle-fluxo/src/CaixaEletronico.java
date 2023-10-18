
import java.text.DecimalFormat;

public class CaixaEletronico {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#0.00");

        double saldo = 25.00;
        double valorSolicitado = 15.00;
        System.out.println("Saldo atual: R$ " + formato.format(saldo));

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor do saque: R$ " + formato.format(valorSolicitado));
            System.out.println("Saldo disponivel: R$ " + formato.format(saldo));
        } else
            System.out.println("Saldo insuficiente para saque!");

    }
}
