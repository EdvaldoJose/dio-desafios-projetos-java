
public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "T"; // planos B/M/T

        switch (plano) {
            case "B": {
                System.out.println("100 min de ligacao");
                break;
            }
            case "M": {
                System.out.println("100 min ligacao + Whats e Instagran gratis");
                break;
            }
            case "T": {
                System.out.println("100 min de ligacao + Whats + Instagran e 5G gratis");
                break;
            }
            default:
        }
    }
}
