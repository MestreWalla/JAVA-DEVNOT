package ExercicioFor;

import java.util.Scanner;

public class ExercicioFor {
    Scanner sc = new Scanner(System.in);

    public void Exemplo02() {
        int vetor[]=new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]=");
            vetor[i]=sc.nextInt();
        }
        //imprimir o vetor na ordem inversa
        for (int i = 9; i >=0; i--) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
    public void Exemplo03() {
        //Carrinho de compra
        double[] carrinhoCompra = new double[]{19.90,35.70,56.80,97.50};
        // Finalizar a compra
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
        //Imprimir o valor parcial
            System.out.println("Valor parcial compra: R$" + valorFinal);
        }
        //Mostrar o valor final da compra
        System.out.println("O valor da compra é: R$ " + valorFinal);
    }
    public void Exemplo04() {
        //Ler 4 notas e mostrar as 4 notas e a média
        double[] vetorNotas = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Informe a " + (i+1)+"ª nota: ");
            vetorNotas[i] = sc.nextDouble();
        }
        //Imprimir as 4 notas e calcular a média
        double mediaNotas =0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas+=vetorNotas[i];
            System.out.println("A "+(i+1)+"ª nota é: "+vetorNotas[i]);
        }
        mediaNotas/=vetorNotas.length;
        System.out.printf("A média é: %.1f", mediaNotas);
    }
        // Faça um programa que peça as quatro notas de 10 lunos, calcule e armazene num
        // vetor a média de cada aluno, imprima o número de alunos com média maior ou
        // igual a 7.
        public void Exemplo05() {
            double[] notasAlunos = new double[10];
        // Vetor guardar médias
            double vetorMedia[] = new double[10];
        // Preencher o vetor de médias
            for (int i = 0; i < notasAlunos.length; i++) {
                int notas=0;
                for(int j = 0; j < 4; j++) {
                    System.out.print("Nota "+(j+1)+" Aluno "+(i+1)+": ");
                    notas+=sc.nextDouble();
                }
                notas/=4; // Calcula a média
                vetorMedia[i]=notas; // Coloca a média no vetorMedia
            }
            // Impimir notas maior ou igual a 7 do vetorMedia
            for (int i = 0; i < vetorMedia.length; i++) {
                if (vetorMedia[i] >= 7){
                    System.out.println("A média do aluno "+(i+1)+" é: "+vetorMedia[i]);
                }
            }
        }
    // Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, a
    // multiplicação e os números.
    public void Exercicio07() {
        int vetor[] = new int[]{1,2,3,4}, soma=0, multiplicacao=1;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Número do "+(i+1)+"º vetor: "+ vetor[i]);
            soma+=vetor[i];
            multiplicacao*=vetor[i];
        }
        System.out.println("A soma é de todos é : " + soma);
        System.out.println("A multicacao de todos é: " + multiplicacao);
    }

    // faça um programa que peça a idade e altura de 5 pessoas, armazene cada
    // informação no seu respectivo vetor. Imprma a idade e a altura na ordem
    // inversa a ordem lida.
    public void Exercicio08() {
        int idadeP[] = new int[5];
        double alturaP[] = new double[5];
        for (int i = 0; i < idadeP.length; i++) {
            System.out.println("Digite a idade da "+(i+1)+"ª pessoa: ");
            idadeP[i]+=sc.nextInt();
            System.out.println("Digite a altura da "+(i+1)+"ª pessoa: ");
            alturaP[i]+=sc.nextDouble();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i+1)+": Idade: "+idadeP[i]+" Altura: "+alturaP[i]);
        }
    }

    // Faça um programa que leia um vetorA com 10 números inteiros, calcule e mostre
    // a soma dos quadrados dos elementos do vetor.
    public void Exercicio09() {
        int vetorA[] = new int[10];
        double soma=0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o "+(i+1)+"º numero inteiro: ");
            vetorA[i]+=sc.nextInt();
            soma+=(vetorA[i]*vetorA[i]);
        }
        System.out.println("A soma é dos quadrados de todos é : " + soma);
    }

    public void Exercicio10() {
        //char letras[] = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String letras[] = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        // Percorrer o Vetor para procurar letras vogais ou consoantes
        // Contar o numero de consoantes
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i]!="a" && letras[i]!="e" && letras[i]!="i" && letras[i]!="o" && letras[i]!="u") {
                System.out.println(letras[i]+" é consoante");
                cont++;
            }
            System.out.println("O numero de consoantes é "+cont);
        }
    }
    public void Exercicio10EX() {
        String palavra = sc.next(); // Ler a palavra digitada pelo usuario e guardar na string
        palavra = palavra.toLowerCase(null);
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c !='a' && c !='e' && c !='i' && c !='o' && c !='u') {
                System.out.println(c +" é consoante");
                cont++;
            } else {
                System.out.println(c+" é vogal");
            }
            System.out.println("O numero de consoantes é "+cont);
        }
    }
    //Ler 20 numeros e separar em pares e impares
    public void Exercicio11() {
        // Criar um vetor para os numeros
        int numeros[]=new int[20];
        int contPar = 0, contImpar = 0;
        // Preencher os vetores
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o numero ["+i+"]= ");
            numeros[i]=sc.nextInt();
            if(numeros[i]%2==0){
                contPar++;
            } else {
                contImpar++;
            }
        }
        // Após a contagem dos pares e impares, criar os respectivos vetores
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // Distribuir os numeros do vetor numeros para os vetore par e impar
        contPar = 0; contImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2==0) {
                nPar[contPar]=numeros[i];
                contPar++;
            } else {
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
        }
    }
}
