import java.util.Scanner;

public class ContaSegura{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Conta conta = new Conta("João", "1234", 1000.0);

        System.out.print("Digite a senha da conta: ");
        String senha = scanner.nextLine();

        if (!conta.autenticar(senha)) {
            System.out.println("Acesso negado. Senha incorreta.");
            return;
        }

        while (true) {
            System.out.println("\nTitular: " + conta.getTitular() + " | Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar (1% de imposto)");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Valor para depositar: R$ ");
                double valor = scanner.nextDouble();
                conta.depositar(valor);
            } else if (opcao == 2) {
                System.out.print("Valor para sacar: R$ ");
                double valor = scanner.nextDouble();
                boolean sucesso = conta.sacar(valor);
                if (!sucesso) {
                    System.out.println("Saque recusado: saldo insuficiente com imposto de 1% incluso.");
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}

class Conta {
    private String titular;
    private String senha;
    private double saldo;

    public Conta(String titular, String senha, double saldoInicial) {
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autenticar(String senhaInformada) {
        return senha.equals(senhaInformada);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        double imposto = valor * 0.01;
        double total = valor + imposto;
        if (valor > 0 && saldo >= total) {
            saldo -= total;
            return true;
        }
        return false;
    }
}
