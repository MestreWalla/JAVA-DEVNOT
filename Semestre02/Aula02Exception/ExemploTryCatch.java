package Semestre02.Aula02Exception;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // boolean calc = true;
    // while (calc) {
    // try {
    // System.out.println("Digite um valor inteiro..:");
    // int numero1 = sc.nextInt();
    // System.out.println("Digite um valor inteiro..:");
    // int numero2 = sc.nextInt();
    // System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    // calc = false;
    // } catch (NumberFormatException erro1) {
    // JOptionPane.showMessageDialog(null, "Erro - Valor digitado invalido");
    // } catch (Exception erro2) {
    // JOptionPane.showMessageDialog(null, "Erro");
    // }
    // }
    // }

    public static void main(String[] args) {

        int primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int segundo = Integer.parseInt(JOptionPane.showInputDialog("Segundo o primeiro numero"));
        String[] options = { "Adição", "Subtração", "Multiplicação", "Divisão" };
        int operacao = JOptionPane.showOptionDialog(null,
                "\nSelecione a operação",
                "OPERAÇÂO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                options[0]);
        System.out.println(operacao);
        try {
            if (operacao == 0) {
                JOptionPane.showMessageDialog(null, primeiro + " + " + segundo + " = " + (primeiro + segundo));
            } else if (operacao == 1) {
                JOptionPane.showMessageDialog(null, primeiro + " - " + segundo + " = " + (primeiro - segundo));
            } else if (operacao == 2) {
                JOptionPane.showMessageDialog(null, primeiro + " * " + segundo + " = " + primeiro * segundo);
            } else if (operacao == 3) {
                JOptionPane.showMessageDialog(null, primeiro + " / " + segundo + " = " + primeiro / segundo);
            }
        } catch (NumberFormatException erro1) {
            JOptionPane.showMessageDialog(null, "Erro - Valor digitado invalido");
        } catch (ArithmeticException erro2) {
            JOptionPane.showMessageDialog(null, "Um numero não pode ser dividido por zero");
        } catch (Exception erro3) {
            JOptionPane.showMessageDialog(null, "Erro");
        } finally {
            JOptionPane.showMessageDialog(null, "Fim");
        }
    }
}