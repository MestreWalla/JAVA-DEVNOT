package JAVA.NotaAluno;

import java.util.Scanner;

public class NotaAluno {
    Scanner sc = new Scanner(System.in);
    public void notaFrequencia() {
        System.out.println("Informe a Nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do aluno:");
        int nota2 = sc.nextInt();
        // double mediaAluno = (nota1 + nota2)/2;
        double mediaAluno = nota1;
        mediaAluno += nota2;
        mediaAluno /= 2;
        System.out.println("A media do Aluno é "+mediaAluno);
        boolean mediaAprovado = mediaAluno >=50;
        System.out.println("O Aluno Esta Aprovado por Nota? "+mediaAprovado);
        System.out.println("Informe a Frequencia do Aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno>=75;
        System.out.println("O Aluno Esta Aprovado po Frequência? "+frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println("O Aluno esta Aprovado no Curso? "+aprovacaoFinal);
    }
}
