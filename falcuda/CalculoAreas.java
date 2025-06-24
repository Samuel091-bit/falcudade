import java.util.Scanner;

public class CalculoAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Área do Retângulo");
            System.out.println("2 - Área do Triângulo");
            System.out.println("3 - Área do Círculo");
            System.out.println("4 - Área da Caixa (Paralelepípedo)");
            System.out.println("5 - Área da Pirâmide (base quadrada)");
            System.out.println("6 - Área do Tubo (Cilindro)");
            System.out.println("7 - Área da Bola (Esfera)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Base: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaR = scanner.nextDouble();
                    System.out.println("Área do Retângulo = " + (baseR * alturaR));
                    break;

                case 2:
                    System.out.print("Base: ");
                    double baseT = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alturaT = scanner.nextDouble();
                    System.out.println("Área do Triângulo = " + (baseT * alturaT) / 2);
                    break;

                case 3:
                    System.out.print("Raio: ");
                    double raioC = scanner.nextDouble();
                    System.out.println("Área do Círculo = " + (Math.PI * Math.pow(raioC, 2)));
                    break;

                case 4:
                    System.out.print("Comprimento: ");
                    double comp = scanner.nextDouble();
                    System.out.print("Largura: ");
                    double larg = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double alt = scanner.nextDouble();
                    double areaCaixa = 2 * (comp * larg + comp * alt + larg * alt);
                    System.out.println("Área da Caixa = " + areaCaixa);
                    break;

                case 5:
                    System.out.print("Base da Pirâmide (lado): ");
                    double baseP = scanner.nextDouble();
                    System.out.print("Altura da face (apotema): ");
                    double alturaFace = scanner.nextDouble();
                    double areaBase = Math.pow(baseP, 2);
                    double areaLateral = 2 * baseP * alturaFace;
                    System.out.println("Área da Pirâmide = " + (areaBase + areaLateral));
                    break;

                case 6:
                    System.out.print("Raio da base do tubo: ");
                    double raioT = scanner.nextDouble();
                    System.out.print("Altura do tubo: ");
                    double alturaTubo = scanner.nextDouble();
                    double areaTubo = 2 * Math.PI * raioT * (raioT + alturaTubo);
                    System.out.println("Área do Tubo = " + areaTubo);
                    break;

                case 7:
                    System.out.print("Raio da bola: ");
                    double raioB = scanner.nextDouble();
                    double areaBola = 4 * Math.PI * Math.pow(raioB, 2);
                    System.out.println("Área da Bola = " + areaBola);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}