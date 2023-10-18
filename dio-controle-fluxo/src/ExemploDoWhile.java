import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando, atenda!!!");
        } while (tocando());
        System.out.println("Alô, quam fala!!!");
        System.out.println("Fim da ligacao.");

    }

    private static boolean tocando() {
        final boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
