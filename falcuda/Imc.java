import java.util.Scanner;
import java.math.BigDecimal;
public class Imc {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("digite sua altura");
        double Altura = leia.nextDouble();
        System.out.println("digite seu peso");
        int Peso = leia.nextInt();
        //calculo
        double Altura2 = Altura * Altura;
        double Indice = Peso / Altura2;
        System.out.println("seu imc é " + Indice);
        if (Indice < 18.5) {
            System.out.println("vc ta abaixo do indice " + Indice);
        }
        if (Indice <= 24.9) {
            System.out.println("vc ta medio do indice " + Indice);
        }
        if((Indice >= 25.9) && (Indice<=29.5)){
            System.out.println("vc ta Sobrepeso do indice " + Indice);
        }if(Indice >= 30.0){
            System.out.println("vc ta gorto como uma baleia "+Indice);
        }
    }
}
