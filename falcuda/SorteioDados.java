import java.util.Scanner;

public class SorteioDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 1;

        System.out.print("Digite a quantidade de dados (ou pressione Enter para 1 dado): ");
        String entrada = scanner.nextLine().trim();

        if (!entrada.isEmpty()) {
            try {
                quantidade = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Considerando 1 dado.");
            }
        }

        int[] resultados = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            resultados[i] = (int) (Math.random() * 6) + 1;
        }

        desenharDados(resultados);
        scanner.close();
    }

    public static void desenharDados(int[] valores) {
        String[][] faces = new String[valores.length][];
        for (int i = 0; i < valores.length; i++) {
            faces[i] = obterFace(valores[i]);
        }

        for (int linha = 0; linha < 5; linha++) {
            for (int i = 0; i < valores.length; i++) {
                System.out.print(faces[i][linha] + "   ");
            }
            System.out.println();
        }
    }

    public static String[] obterFace(int valor) {
        switch (valor) {
            case 1:
                return new String[] {
                        "+-------+",
                        "|       |",
                        "|   *   |",
                        "|       |",
                        "+-------+"
                };
            case 2:
                return new String[] {
                        "+-------+",
                        "| *     |",
                        "|       |",
                        "|     * |",
                        "+-------+"
                };
            case 3:
                return new String[] {
                        "+-------+",
                        "| *     |",
                        "|   *   |",
                        "|     * |",
                        "+-------+"
                };
            case 4:
                return new String[] {
                        "+-------+",
                        "| *   * |",
                        "|       |",
                        "| *   * |",
                        "+-------+"
                };
            case 5:
                return new String[] {
                        "+-------+",
                        "| *   * |",
                        "|   *   |",
                        "| *   * |",
                        "+-------+"
                };
            case 6:
                return new String[] {
                        "+-------+",
                        "| *   * |",
                        "| *   * |",
                        "| *   * |",
                        "+-------+"
                };
            default:
                return new String[] {
                        "+-------+",
                        "| ERROR |",
                        "|       |",
                        "|       |",
                        "+-------+"
                };
        }
    }
}