public class FormatadorCepExemp {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("CEP formatado: " + cepFormatado);

        } catch (CepInvalidoException err) {
            System.out.println("Error: CEP invalido.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();

        }

        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "." + cep.substring(5, 8);
    }
}

class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP invalido");
    }
}