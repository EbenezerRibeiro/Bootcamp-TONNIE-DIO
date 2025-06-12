package exercicios;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class tabuadainversa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para encontrar na tabuada: ");
        int numeroAlvo = scanner.nextInt();

        List<String> resultados = new ArrayList<>();

        // Procura por todas as combinações na tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j == numeroAlvo) {
                    resultados.add(i + " x " + j);
                }
            }
        }

        if (resultados.isEmpty()) {
            System.out.println("Não foi encontrada nenhuma multiplicação na tabuada de 1 a 10 que resulte em " + numeroAlvo + ".");
        } else {
            // Seleciona um dos resultados encontrados de forma aleatória
            Random random = new Random();
            String resultadoSorteado = resultados.get(random.nextInt(resultados.size()));
            System.out.println("Uma multiplicação que resulta em " + numeroAlvo + " é: " + resultadoSorteado);
        }

        scanner.close();
    }
}