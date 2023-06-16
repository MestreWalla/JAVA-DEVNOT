package IteracaoIf.ExercicioWhile;

public class ExercicioWhile {
    // 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].
    public static void exercicio1() {
        int vetorA[] = new int[] { 3, 7, 9, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    // 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja:
    // B[i] = A[i] * 2.
    public static void exercicio2() {
        int vetorA[] = new int[] { 3, 7, 9, 11, 13, 15, 18, 20 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("vetorB[" + i + "]:" + vetorB[i]);
            i++;
        }
    }

    // 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do
    // respectivo elemento de A, ou seja: B[i] = A[i] * A[I].
    public static void exercicio3() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("vetorB[" + i + "]:" + vetorB[i]);
            i++;
        }
    }

    // 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
    // tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
    // respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
    public static void exercicio4() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        double vetorB[] = new double[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("vetorB[" + i + "]:" + vetorB[i]);
            i++;
        }
    }

    // 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
    // elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i]
    // * i.
    public static void exercicio5() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("vetorB[" + i + "]:" + vetorB[i]);
            i++;
        }
    }

    // 6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
    // vetor C, onde cada elemento de C é a soma dos respectivos elementos em A e B,
    // ou seja: C[i] = A[i] + B[i].
    public static void exercicio6() {
        int vetorA[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorB[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int vetorC[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("vetorC[" + i + "]:" + vetorC[i]);
            i++;
        }
    }
}