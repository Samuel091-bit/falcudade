import java.util.Scanner;

public class GestaoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();
        System.out.print("Quantidade de notas por aluno: ");
        int quantidadeNotas = scanner.nextInt();

        String[] nomes = new String[quantidadeAlunos];
        double[][] notas = new double[quantidadeAlunos][quantidadeNotas];
        double[] medias = new double[quantidadeAlunos];

        scanner.nextLine();

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = scanner.nextLine();

            double soma = 0;
            for (int j = 0; j < quantidadeNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            medias[i] = soma / quantidadeNotas;
            scanner.nextLine();
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < quantidadeAlunos; i++) {
            String resultado = medias[i] >= 6.0 ? "Aprovado" : "Reprovado";
            System.out.printf("%s [%.2f] [%s]\n", nomes[i], medias[i], resultado);
        }

        scanner.close();
    }
}
