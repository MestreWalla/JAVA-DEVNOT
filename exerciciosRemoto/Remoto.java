import java.util.Scanner;

public class Remoto {
  Scanner sc = new Scanner(System.in);
  public void valorMaior() {
    System.out.println("Informe um numero que direi se é maior que 10:");
    int valor = sc.nextInt();
    if (valor >= 10) {
    System.out.println("O número " +valor+" é maior que 10.");
    } else {System.out.println("O número "+valor+" não é maior que 10.");
}}
  
}