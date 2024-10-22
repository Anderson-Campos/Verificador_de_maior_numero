import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três número para verificar qual é o maior");
        System.out.println("...");
        System.out.println("Primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O Primeiro número é o maior");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O Segundo número é o maior");
        } else {
            System.out.println("O Terceiro número é o maior");
        }
    }
}
