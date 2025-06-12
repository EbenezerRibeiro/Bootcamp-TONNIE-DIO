package exercicios;
import java.util.Scanner;


public class ListaNumerosParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Listador de Números Pares ou Ímpares ---");

        // 1. Obter o primeiro número
        System.out.print("Digite o primeiro número do intervalo: ");
        int primeiroNumero = scanner.nextInt();

        int segundoNumero;
        // 2. Obter o segundo número e garantir que seja maior que o primeiro
        do {
            System.out.print("Digite o segundo número (precisa ser maior que " + primeiroNumero + "): ");
            segundoNumero = scanner.nextInt();
            if (segundoNumero <= primeiroNumero) {
                System.out.println("Erro: O segundo número deve ser obrigatoriamente maior que o primeiro. Tente novamente.");
            }
        } while (segundoNumero <= primeiroNumero);

        // Limpa o buffer do scanner antes de ler a próxima linha de texto
        scanner.nextLine(); 

        String escolha;
        // 3. Obter a escolha (par ou ímpar) e validar a entrada
        while (true) {
            System.out.print("Você deseja listar os números 'par' ou 'impar'? ");
            escolha = scanner.nextLine();
            if (escolha.equalsIgnoreCase("par") || escolha.equalsIgnoreCase("impar")) {
                break; // Sai do loop se a entrada for válida
            } else {
                System.out.println("Opção inválida. Por favor, digite exatamente 'par' ou 'impar'.");
            }
        }

        System.out.println("\nListando os números em ordem decrescente:");

        // 4. Loop para percorrer os números em ordem decrescente
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            // Verifica se a escolha foi "par" e se o número atual é par
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            }
            // Verifica se a escolha foi "ímpar" e se o número atual é ímpar
            else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}