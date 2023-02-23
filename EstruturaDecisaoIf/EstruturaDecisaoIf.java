package JAVA.EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);
    public void DecisaoIf() {
        double precoProduto = sc.nextDouble();
        boolean produtoAltoValor = precoProduto >= 100;
        double percentualDesconto = 0.0;
        if (produtoAltoValor) { // Estrutura de desisão if
        // Desconto para produtos de alto valor.
    percentualDesconto = 5.0;
}
//Regra de três
double desconto = (precoProduto * percentualDesconto) / 100;
double precoComDesconto = precoProduto - desconto;
System.out.println("O produto sairá por R$" + precoComDesconto);
    }
}
