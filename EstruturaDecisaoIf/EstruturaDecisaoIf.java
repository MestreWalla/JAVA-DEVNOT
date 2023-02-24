package JAVA.EstruturaDecisaoIf;

import java.util.Scanner;

public class EstruturaDecisaoIf {
    Scanner sc = new Scanner(System.in);

    public void DecisaoIf() {
        System.out.println("Qual é o Preço do Produto?");
        double precoProduto = sc.nextDouble();
        // boolean produtoAltoValor = precoProduto >= 100; NAO NECESSARIO MAIS
        double percentualDesconto = 0.0; // Desconto Inicial
        if (precoProduto >= 200) { // Se o Preço do Produto for Maior ou Igual a 200
            percentualDesconto = 10.0; // O Desconto Será de 10%
        }
        if (precoProduto >= 100 && precoProduto<200) { //Se Valor do Produto For Igual ou Maior que 100 e Menor que 200
            percentualDesconto = 5.0; // O Desconto sera de 5%
        }
        // Iniciar Regra de Três
        double desconto = (precoProduto * percentualDesconto) / 100; //Valor do Desconto em R$
        double precoComDesconto = precoProduto - desconto; //Valor Final em R$
        System.out.println("O produto sairá por R$" + precoComDesconto); //Resposta final + Valor Final
    }
}
