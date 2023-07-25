import java.util.Scanner;

/**
 * app
 */

    //Faça um programa que leia um vetor de 5 numeros inteiros e mostre-os.
public class vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um vetor
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º Posição- Indice[0]:" + valores[0]);
        System.out.println("2º Posição- Indice[1]:" + valores[1]);
        System.out.println("3º Posição- Indice[2]:" + valores[2]);
        System.out.println("4º Posição- Indice[3]:" + valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando valores do Indice[0]
        System.out.println("1º Posição- Indice[0]" + valores[0]);
    }
    public void exemplo2() {
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Nº inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        System.out.println("1º Posição- Indice[0]:" + valoresInt[0]);
        System.out.println("2º Posição- Indice[1]:" + valoresInt[1]);
        System.out.println("3º Posição- Indice[2]:" + valoresInt[2]);
        System.out.println("4º Posição- Indice[3]:" + valoresInt[3]);
        System.out.println("5º Posição- Indice[4]:" + valoresInt[4]);
    }
    //Faça um programa que leia um vetor de 10 numeros reais e mostre-os na ordem.
    public void exemplo3() {
        int numerosReais[] = new int[] {1,2,3,4,5,6,7,8,9,10}; //Criar array das notas
        System.out.println("1º numero: "+numerosReais[9]);
        System.out.println("2º numero: "+numerosReais[8]);
        System.out.println("3º numero: "+numerosReais[7]);
        System.out.println("4º numero: "+numerosReais[6]);
        System.out.println("5º numero: "+numerosReais[5]);
        System.out.println("6º numero: "+numerosReais[4]);
        System.out.println("7º numero: "+numerosReais[3]);
        System.out.println("8º numero: "+numerosReais[2]);
        System.out.println("9º numero: "+numerosReais[1]);
        System.out.println("10º numero: "+numerosReais[0]);
    }
    //Faça um programa que leia 4 notas, mostre as notas e a média na tela.
    public void exemplo4() {
        int notas[] = new int[4]; //Criar array das notas
        System.out.println("Digite 4 notas"); //comando syso
        notas[0]=sc.nextInt();
        notas[1]=sc.nextInt();
        notas[2]=sc.nextInt();
        notas[3]=sc.nextInt();
        System.out.println("1º nota: "+notas[0]);
        System.out.println("2º nota: "+notas[1]);
        System.out.println("3º nota: "+notas[2]);
        System.out.println("4º nota: "+notas[3]);
        System.out.println("Média: "+(notas[0]+notas[1]+notas[2]+notas[3])/4);
}}