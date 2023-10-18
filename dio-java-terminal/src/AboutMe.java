import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite seu peso: ");
            double peso = scanner.nextDouble();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("----------------------------");
            System.out.println("Ola, me chamo: " + nome + " " + sobrenome + ".");
            System.out.println("Tenho: " + idade + " anos");
            System.out.println("Meu peso: " + peso + "kg");
            System.out.println("Minha altura: " + altura + "cm");
            System.out.println("----------------------------");
            System.out.println("Dados inseridos com sucesso.");

        } catch (InputMismatchException error) {
            System.out.println("O campos idade e altura tem que ser number!");
        } finally {
            scanner.close();
        }
    }
}
