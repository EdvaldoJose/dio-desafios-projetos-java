import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 40.00;

        final DecimalFormat formato = new DecimalFormat("#0.00");

        while (mesada > 2) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor " + formato.format(valorDoce) + " Adiciona no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Joaozinho gastou toda a sua mesada em doces!");
        System.out.println("Saldo de sua Mesada: " + formato.format(mesada));
    }

    public static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(0, 10);
    }
}
