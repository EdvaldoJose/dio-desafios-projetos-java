
public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "P"; // P/M/G

        if (sigla == "P") {
            System.out.println("Pequeno");

        } else if (sigla == "M") {
            System.out.println("Medio");

        } else if (sigla == "G") {
            System.out.println("Grande");

        } else {
            System.out.println("Indefinido");
        }
    }
}