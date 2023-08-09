package Semestre02.Aula04Colecoes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Cadastrar Novo Carro na ArrayList
        // Consultar Carro
        // Excluir Carro da Minha Lista
        List<Carros> listaCarros = new ArrayList<>();
        boolean menu = true;
        
        while (menu) {
            String[] options = { "Cadastrar Carro", "Consultar Carro", "Apagar Carro", "Sair" };
            int acao = JOptionPane.showOptionDialog(null,
                    "\n--------CARROS---------"
                            + "\nClique a ação Desejada:",
                    "CARROS",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                    options[0]);
            System.out.println(acao);
            if (acao == 0) { // Cadastrar Carro
                boolean cadastro = true;
                while (cadastro) {
                    Carros car = new Carros(JOptionPane.showInputDialog("Informe a marca do carro"),
                            JOptionPane.showInputDialog("Informe a modelo do carro"),
                            JOptionPane.showInputDialog("Informe o ano do carro"),
                            JOptionPane.showInputDialog("Informe a cor do carro"));
                    listaCarros.add(car);
                    cadastro = false;
                }
            } else if (acao == 1) { // Consultar Carro
                boolean consulta = true;
                String resultado = "";
                while (consulta) {
                    for (Carros a : listaCarros) {
                        resultado += a.getMarca() + " "
                                  + a.getModelo() + " "
                                  + a.getAno() + " "
                                  + a.getCor() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                    consulta = false;
                }
            } else if (acao == 2) { // Apagar Carro
                boolean apagar = true;
                while (apagar) {
                }
            } else {
                menu = false;
            }
        }
    }
}