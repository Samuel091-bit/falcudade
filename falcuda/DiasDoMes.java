import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome ou número do mês: ");
        String entrada = scanner.nextLine().trim().toLowerCase();

        int mes = -1;

        switch (entrada) {
            case "1": case "janeiro": mes = 1; break;
            case "2": case "fevereiro": mes = 2; break;
            case "3": case "março": case "marco": mes = 3; break;
            case "4": case "abril": mes = 4; break;
            case "5": case "maio": mes = 5; break;
            case "6": case "junho": mes = 6; break;
            case "7": case "julho": mes = 7; break;
            case "8": case "agosto": mes = 8; break;
            case "9": case "setembro": mes = 9; break;
            case "10": case "outubro": mes = 10; break;
            case "11": case "novembro": mes = 11; break;
            case "12": case "dezembro": mes = 12; break;
            default:
                System.out.println("Mês inválido.");
                System.exit(0);
        }

        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                System.out.print("Informe o ano: ");
                int ano = scanner.nextInt();
                dias = (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) ? 29 : 28;
                break;
            default:
                dias = -1;
        }

        System.out.println("Quantidade de dias: " + dias);
        scanner.close();
    }
}
