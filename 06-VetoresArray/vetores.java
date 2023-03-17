import java.util.Scanner;

/**
 * app
 */
public class vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um vetor
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º Posição- Indice[0]:" + valores[0]);
        System.out.println("2º Posição- Indice[1]:" + valores[1]);
        System.out.println("3º Posição- Indice[2]:" + valores[2]);
        System.out.println("4º Posição- Indice[3]:" + valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando valores do Indice[0]
        System.out.println("1º Posição- Indice[0]" + valores[0]);
    }

}