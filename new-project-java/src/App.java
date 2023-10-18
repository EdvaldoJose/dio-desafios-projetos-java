public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Edvaldo";
        String segundoNome = "Jose";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println("Nome Completo: " + nomeCompleto);
    }

    // Definindo o método nomeCompleto
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }
}
