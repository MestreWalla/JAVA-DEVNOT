package JAVA.ExerciciosIfElse;

import java.time.format.TextStyle;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio01() {
        System.out.println("Informe o primeiro valor:");
        double valor01 = sc.nextDouble();
        System.out.println("Informe o segundo valor:");
        double valor02 = sc.nextDouble();

        if (valor01 > valor02) {
            System.out.println("O primeiro valor é maior" + " (" + valor01 + ")");
        } else if (valor01 < valor02) {
            System.out.println("O segundo valor é maior" + " (" + valor02 + ")");
        } else if (valor01 == valor02) {
            System.out.println("Os dois tem o mesmo valor" + " (" + valor01 + ")");
        }
    }

    public void exercicio02() {
        System.out.println("Informe o ano em que estamos:");
        double anoAtual = sc.nextDouble();
        System.out.println("Informe a data de nascimento:");
        double anoNasc = sc.nextDouble();
        double difIdade = anoAtual - anoNasc;

        if (difIdade >= 16) {
            System.out.println("Você ja pode decidir o futuro do nosso país, voce tem:" + difIdade + " anos");
        } else {
            System.out.println(
                    "Você ainda nao pode decidir o futuro do nosso país, você ainda tem " + difIdade + " anos");
        }
    }

    public void exercicio03() {
        System.out.println("Informe a senha de acesso");
        double senhaInformada = sc.nextDouble();
        double senha = 1234;
        System.out.println("Verificando senha...");
        if (senhaInformada == senha) {
            System.out.println("Senha Correta");
        } else {
            System.out.println("Senha Incorreta");
        }
    }

    public void exercicio04() {
        System.out.println("Informe a quantidade de maçãs");
        double quantiaMaca = sc.nextDouble();
        double valorMaca = 0.30;
        if (quantiaMaca <= 11) {
            valorMaca = 0.30;
        } else {
            valorMaca = 0.25;
        }
        double valorTotal = valorMaca * quantiaMaca;
        System.out.println("O valor total da compra é de R$ " + valorTotal);
    }

    public void exercicio05() {
        System.out.println("Nesse exercicio você irá informar 3 numeros inteiros de 1 a 9 de cada vez.");
        System.out.println("Informe o primeiro número:");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Informe o segundo número:");
        double segundoNumero = sc.nextDouble();
        System.out.print("Informe o terceiro número:");
        double terceiroNumero = sc.nextDouble();

        if (primeiroNumero > segundoNumero && segundoNumero > terceiroNumero) {
            System.out.println(terceiroNumero + ", " + segundoNumero + ", " + primeiroNumero);
        } else if (primeiroNumero > terceiroNumero && terceiroNumero > segundoNumero) {
            System.out.println(segundoNumero + ", " + terceiroNumero + ", " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero && primeiroNumero > terceiroNumero) {
            System.out.println(terceiroNumero + ", " + primeiroNumero + ", " + segundoNumero);
        } else if (segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero) {
            System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
        } else if (terceiroNumero > primeiroNumero && primeiroNumero > segundoNumero) {
            System.out.println(segundoNumero + ", " + primeiroNumero + ", " + terceiroNumero);
        } else if (terceiroNumero > segundoNumero && segundoNumero > primeiroNumero) {
            System.out.println(primeiroNumero + ", " + segundoNumero + ", " + terceiroNumero);
        }
    }

    public void exercicio06() {
        System.out.println("Informe sua altura em metros:");
        double altura = sc.nextDouble();
        System.out.print("Informe seu sexo, digitando (1) para feminino ou (2) masculino");
        double sexo = sc.nextDouble();
        String sexoWrite = "masculino";
        if (sexo == 1) {
            sexoWrite = "feminino";
        } else {
            sexoWrite = "masculino";
        }
        System.out.println("Você informou que sua altura é: " + altura + "m, e que você é do sexo: " + sexoWrite
                + ". Está correto? Informe com (1) para sim ou (2) para não: ");
        double correto = sc.nextDouble();
        double formulaHomens = (72.7 * altura) - 58;
        double formulaMulheres = (62.1 * altura) - 44.7;
        double formulaUsar = formulaHomens;
        if (sexo == 1) {
            formulaUsar = formulaMulheres;
        }
        if (sexo == 2) {
            formulaUsar = formulaHomens;
        }
        if (correto == 1) {
            System.out.println("Com base nas suas informações o seu peso ideal é: " + formulaUsar + "kg");
        } else {
            System.out.println("Comece o programa novamente");
        }
    }

    public void exercicio07() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();
        // double mediaAluno = (nota1 + nota2)/2;
        double mediaAluno = (nota1+nota2)/2;
        System.out.println("A media do Aluno é: " + mediaAluno);
        if (mediaAluno >= 50) {
            System.out.println("O Aluno Esta Aprovado por Nota, " + mediaAluno);
        } else
        System.out.println("O Aluno Esta Reprovado por Nota, " + mediaAluno);
        System.out.println("Informe a Frequencia do Aluno:");
        int frequenciaAluno = sc.nextInt();
        if (frequenciaAluno >= 75) {
            System.out.println("O Aluno Esta Aprovado por Frequência: " + frequenciaAluno);
        } else
            System.out.println("O Aluno esta Reprovado por Frequencia: " + frequenciaAluno);
        if (frequenciaAluno >= 75 && mediaAluno >= 50) {
            System.out.println("O Aluno esta Aprovado no Curso");
        } else
            System.out.println("O Aluno Esta Reprovado no Curso");
        }
    }
    public void exercicio08() {
        System.out.println("Informe um número e eu informarei se é impar ou par: ");
        double numero = sc.nextDouble();
        if (numero)
    }