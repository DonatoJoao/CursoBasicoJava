import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {

        int numeroSorteado = new Random().nextInt(10);
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int chute = leitura.nextInt();
        int contador = 5;

        for (int i = 1; i < contador; i++) {
            if (chute == numeroSorteado){
                System.out.println("Vc ganhou");
                break;
            } else if (chute != numeroSorteado) {
                System.out.println("Vc errou. Digite outro numero, vc ainda tem " + (contador - i) + " tentativas");
                chute = leitura.nextInt();

            } else {
                System.out.println("Fim do jogo");
            }
        }

//        Scanner leitura = new Scanner(System.in);
//        System.out.println("tente adivinhar o numero sorteado:");
//        int chute = leitura.nextInt();
//        int contadorDeChutes = 0;




//        for (int i = 0; i < contadorDeChutes; i++) {
//            if (chute == numeroSorteado) {
//                System.out.println("Você acertou na tentativa " + i);
//                break;
//            } else {
//                System.out.println("tente outra vez... você ainda tem: " + (contadorDeChutes - i) + " chutes.");
//                leitura = new Scanner(System.in);
//                chute = leitura.nextInt();
//            }
//        }
    }
}