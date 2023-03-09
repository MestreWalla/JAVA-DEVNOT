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
        double mediaAluno = (nota1 + nota2) / 2;
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

    public void exercicio08() {
        System.out.println("Informe um número e eu informarei se é impar ou par: ");
        double numero = sc.nextDouble();
        double par = numero % 2;
        if (par == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
    // 09- Desafio 1: Crie um programa que recebe uma nota ( pela classe Scanner) e
    // checa se você passou direto, ficou de recuperação ou foi reprovado na
    // matéria.
    // A regra é a seguinte:
    // Nota 7 ou mais: passou direto
    // Entre 5 e 7: têm direito de fazer uma prova de recuperação
    // Abaixo de 5: reprovado direto

    public void exercicio09() {
        System.out.println("Informe a Nota do aluno:");
        int nota = sc.nextInt();
        if (nota >= 8) {
            System.out.println("Você passou direto.");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Você ficou de recuperação.");
        } else if (nota <= 4) {
            System.out.println("Você não passou.");
        }
    }

    // 10- Faça um programa que verifique (usando if e else) se uma letra digitada é
    // vogal ou consoante.
    // *Difícil:

    public void exercicio10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma letra:");
        char letra = sc.next().charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("A letra é vogal.");
        } else {
            System.out.println("A letra não é vogal.");
        }
    }
    // 11- Faça um programa que recebe o salário de um colaborador e o reajuste
    // segundo o seguinte critério, baseado no salário atual:
    // -Salários até R$ 1280,00 (incluindo): aumento de 20%;
    // -Salários entre R$ 1280,00 e R$1700,00: aumento de 15%;
    // -Salários entre R$ 1700,00 e R$2500,00: aumento de 10%;
    // -Salários de R$ 2500,00 em diante: aumento de 5%
    // Após o aumento ser realizado; informe na tela:
    // *O salário antes do reajuste;
    // *O percentual de aumento aplicado;
    // *O valor do aumento;
    // *O novo salário, após o aumento.
    public void exercicio11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário do colaborador:");
        double salario = sc.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        int quantidadeHoras = sc.nextInt();
        double salarioNovo = salario + (salario * 0.20);
        double salarioAumento = salarioNovo + (salarioNovo * 0.15);
        double salarioDesconto = salarioNovo - (salarioNovo * 0.20);
        System.out.println("O salário antes do reajuste é: " + salario);
        System.out.println("O percentual de aumento aplicado é: " + (salarioAumento - salario));
}
// 12- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
// descontos são do imposto de Renda, que depende do salário bruto (conforme
// tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
// salário bruto, mas não é descontado (é a empresa que deposita.)
// O salário líquido corresponde ao salário bruto menos os descontos O programa
// deverá pedir ao usuário o valor da sua hora e a quantidade de horas
// trabalhadas no mês.
// a. Desconto do IR;
// b. Salário Bruto até R$900,00 (inclusive) – Isento;
// c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
// d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
// e. Salário bruto acima de 2500 – Desconto de 20%.
// Imprima na tela as informações, dispostas conforme o exemplo abaixo, no
// exemplo valor da hora é 5 e a quantidade de horas é 220.
// Salário bruto (5 * 220) : R$ 1100,00
// ( – ) IR (5%) : R$ 55,00
// ( – ) INSS ( 10% ) : R$ 110,00
// FGTS ( 11%) : R$ 121,00
// Total de descontos : R$ 165,00
// Salário Líquido : R$ 935,00
    public void exercicio12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da hora:");
        double hora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês:");
        int quantidadeHoras = sc.nextInt();
        double salarioBruto = hora * quantidadeHoras;
        double salarioLiquido = salarioBruto - (salarioBruto * 0.11);
        System.out.println("O salário líquido é: " + salarioLiquido);
        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("Total de descontos: R$ " + (salarioLiquido - salarioBruto));
    }
}