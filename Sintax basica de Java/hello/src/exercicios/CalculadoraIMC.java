package exercicios;
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Configura o Locale para usar o ponto como separador decimal na entrada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- Calculadora de IMC ---");

        System.out.print("Digite seu peso (em kg, ex: 75.5): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros, ex: 1.75): ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Formata o resultado do IMC para duas casas decimais
        String imcFormatado = String.format("%.2f", imc);

        System.out.println("\nSeu IMC é: " + imcFormatado);

        // Exibe a classificação de acordo com o resultado do IMC
        System.out.print("Classificação: ");
        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else { // se for maior ou igual a 40.0
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        scanner.close();
    }
}