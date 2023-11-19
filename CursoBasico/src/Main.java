import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner leitura = new Scanner(System.in);
//        System.out.println("Digite alguma coisa: ");
//
//        String filme = leitura.nextLine();
 //       System.out.println("Você digitou: " + filme);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu salário: ");
        BigDecimal salario = scanner.nextBigDecimal();

        System.out.println(nome + " tem " + idade + " anos de idade, e ganha " + salario + " mil por mês." );

        scanner.close();

    }
}