import javax.swing.Spring;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; // planos B/M/T

        if (plano == "B") {
            System.out.println("100 min de ligacao");

        } else if (plano == "M") {
            System.out.println("100 min ligacao + Whats e Instagran gratis");

        } else if (plano == "T") {
            System.out.println("100 min de ligacao + Whats + Instagran e 5G gratis");
        }
    }
}
