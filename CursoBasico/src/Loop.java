import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota");
            nota = leitura.nextDouble();
            mediaAvalicao += nota;
        }
        System.out.println("A média dos filmes é: " + mediaAvalicao /3);

    }

}
