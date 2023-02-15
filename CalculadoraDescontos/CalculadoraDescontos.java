package JAVA.CalculadoraDescontos;

import java.security.cert.X509CRLEntry;

/**
 * CalculadoraDescontos
 */
import java.util.Scanner;
 public class CalculadoraDescontos {
    Scanner sc = new Scanner(System.in);
public void calcular20(){
    System.out.println("Informe o Preço do Produto:");
    double precoProduto = sc.nextDouble();
    final int desconto20 = 20;
    double precoComDesconto = precoProduto - (precoProduto*desconto20/100);
    System.out.println("O preço com Desconto é R$ " + precoComDesconto + " reais.");
}
public void calcular30(){
    double precoProduto = sc.nextDouble();
    System.out.println("Informe o Preço do Produto:");
    final int desconto30 = 30;
    double precoComDesconto = precoProduto - (precoProduto*desconto30/100);
    System.out.println("O preço com Desconto é R$ " + precoComDesconto + " reais.");

}
}