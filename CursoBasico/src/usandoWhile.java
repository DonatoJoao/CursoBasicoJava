import java.util.Scanner;

public class usandoWhile {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int contadorDeNotas = 0;


        while (nota != -1) {
            System.out.println("Digite uma nota ou -1 para parar: ");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                contadorDeNotas++;
            }
        }
        System.out.println("A média dos filmes é: " + mediaAvalicao / contadorDeNotas + " e foram computadas " + contadorDeNotas + " notas.");

    }
}