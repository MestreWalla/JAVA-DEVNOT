package JAVA.EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoElseIf {
    private final Scanner scanner;

    public EstruturaDecisaoElseIf(Scanner scanner) {
        this.scanner = scanner;
    }

    public void decisaoIf() {
        System.out.println("Qual é o preço do produto?");
        double precoProduto = scanner.nextDouble();
        double percentualDesconto = 0;
        if (precoProduto < 100) {
            percentualDesconto = 0.0;
        } else if (precoProduto >= 100 && precoProduto < 200) {
            percentualDesconto = 5.0;
        } else if (precoProduto >= 200 && precoProduto < 300) {
            percentualDesconto = 10.0;
        } else {
            percentualDesconto = 10.0;
        }
        // Regra de Três
        double valorDesconto = precoProduto * percentualDesconto / 100;
        double precoComDesconto = precoProduto - valorDesconto;

        System.out.printf("O produto sairá por R$ %.2f\n", precoComDesconto);
    }
}
