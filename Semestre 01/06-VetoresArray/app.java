import java.util.Scanner;

/**
 * app
 */
public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        vetores obj = new vetores();
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                obj.exemplo1();
                break;
            case 2:
                obj.exemplo2();
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        scanner.close();
    }

}