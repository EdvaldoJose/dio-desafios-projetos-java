public class BoasVindas {

    public static void main(String[] args) {
        String meuNome = "Edvaldo";
        int numero = 5;
        // numero = 10;
        boolean variavel = true;
        String concatenaNumero = 1 + 1 + 1 + "1";
        System.out.println(concatenaNumero);

        // numero = numero * -1;
        // numero = numero + 2;
        // numero = numero++;
        System.out.println(numero++);
        System.out.println(++numero);
        System.out.println(--numero);
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("O numero agora 'e: " + numero + " " + "Meu nome: " +
                meuNome);
    }
}
