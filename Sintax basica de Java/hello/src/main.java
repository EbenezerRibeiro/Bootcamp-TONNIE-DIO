import java.util.Scanner;

public class main {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("olá, informe o seu nome");
        var name = scanner.next();
        System.out.println("informe sua idade");
        var age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
    
}
