import java.util.*;

public class estatisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        while (true) {
            System.out.print("Informe um número (ou pressione Enter para finalizar): ");
            String entrada = scanner.nextLine();


            if (entrada.isEmpty()) {
                break;
            }

            try {
                double valor = Double.parseDouble(entrada);
                numeros.add(valor);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
        if (numeros.isEmpty()) {
            System.out.println("Nenhum valor foi informado.");
            return;
        }
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = soma / numeros.size();
        double minimo = Collections.min(numeros);
        double maximo = Collections.max(numeros);
        Map<Double, Integer> frequencia = new HashMap<>();
        for (double num : numeros) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        double moda = numeros.get(0);
        int maxFreq = 0;
        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                moda = entry.getKey();
            }
        }
        double somaQuadrados = 0;
        for (double num : numeros) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / numeros.size());
        System.out.printf("Média = "+media);
        System.out.printf("Moda = "+ moda);
        System.out.printf("Mínimo = "+ minimo);
        System.out.printf("Máximo = "+ maximo);
        System.out.printf("Desvio Padrão = "+ desvioPadrao);
    }
}
