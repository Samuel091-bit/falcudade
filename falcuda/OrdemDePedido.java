import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdemDePedido {

    // Classe interna para representar um item do pedido
    static class Item {
        String categoria;
        String descricao;
        int quantidade;

        public Item(String categoria, String descricao, int quantidade) {
            this.categoria = categoria;
            this.descricao = descricao;
            this.quantidade = quantidade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> pedido = new ArrayList<>();

        System.out.println("=== Sistema de Ordem de Pedido ===");

        while (true) {
            System.out.print("\nInforme a descrição do item (ou pressione Enter para finalizar): ");
            String descricao = scanner.nextLine().trim();

            if (descricao.isEmpty()) {
                break;
            }

            System.out.print("Informe a quantidade do item: ");
            int quantidade;
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Quantidade inválida. Tente novamente.");
                continue;
            }

            System.out.println("Selecione a categoria:");
            System.out.println("1. Alimento");
            System.out.println("2. Eletrônico");
            System.out.println("3. Outros");
            System.out.print("Digite o número da categoria: ");
            int opcaoCategoria;
            try {
                opcaoCategoria = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            String categoria;
            switch (opcaoCategoria) {
                case 1: categoria = "Alimento"; break;
                case 2: categoria = "Eletrônico"; break;
                case 3: categoria = "Outros"; break;
                default:
                    System.out.println("Categoria inválida. Item ignorado.");
                    continue;
            }

            pedido.add(new Item(categoria, descricao, quantidade));
        }

        // Exibe a lista final
        System.out.println("\n=== Lista de Itens do Pedido ===");
        for (Item item : pedido) {
            System.out.printf("%-10s %-30s %d\n", item.categoria, item.descricao, item.quantidade);
        }

        System.out.println("\nPedido finalizado.");
        scanner.close();
    }
}
