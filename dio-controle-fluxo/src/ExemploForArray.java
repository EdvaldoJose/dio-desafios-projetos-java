
public class ExemploForArray {
    public static void main(String[] args) {

        String alunos1[] = { "Edvaldo", "Dinaldo", "Eliedson", "Breno" };

        for (int x = 0; x < alunos1.length; x++) {
            System.out.println("O grupo1 de aluno na posicao x = " + x + " -> " + alunos1[x]);
        }
        System.out.println("Fim da primeira contagem!..");

        String alunos2[] = { "Simone", "Maria", "Vanderlita", "Nininha" };

        for (int y = 0; y < alunos2.length; y++) {
            System.out.println("O grupo2 de aluno na posicao y = " + y + " -> " + alunos2[y]);
        }
        System.out.println("Fim da segunda contagem!..");

    }
}
