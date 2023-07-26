import java.util.Scanner;

public class While {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 10) {
            System.out.println("O número da iteração é " + iteracao);
            iteracao += 1;
        }
    }
    public void adivinhar() {
        Random rd = new Random();
        int nSorteado = rd.nextInt(bound:10);
        boolean tenteNovamente;
        while (tenteNovamente) {
            System.out.println("Digite um numero: ");
            int nDigitado = sc.nextInt();
            if (nDigitado==nSortead){
                System.out.println("Acertou Miseravi");
                tenteNovamente = false;
            } else {
                System.out.println("Errouuuu!");
                tenteNovamente = true;
            }
        }
    }
}
