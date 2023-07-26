package Semestre02.Aula01RevisaoFPOO;

import javax.swing.JOptionPane;

import Semestre02.Aula01RevisaoFPOO.Cadastro.Cachorro;
import Semestre02.Aula01RevisaoFPOO.Cadastro.Gato;
import Semestre02.Aula01RevisaoFPOO.Cadastro.Outros;

public class App {
    public static void main(String[] args) {
        Gato animalGato[] = new Gato[10];
        Cachorro animalCachorro[] = new Cachorro[10];
        Outros animalOutros[] = new Outros[10];
        int contA = 0;
        int contC = 0;
        int contG = 0;
        int contO = 0;
        boolean menu = true;

        while (menu) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n-------------Bem vindo a Clinica My Pet*-------------"
                            + "\nInforme a ação Desejada:"
                            + "\n 1-Cadastrar Animal"
                            + "\n 2-Consultar Animal"
                            + "\n 3-Sair"));

            if (acao == 1) { // Cadastrar Animal
                boolean cadastro = true;
                while (cadastro) {
                    int acaoCadastro = Integer.parseInt(JOptionPane.showInputDialog(
                            "\n-------------Clinica My Pet*-------------"
                                    + "\nInforme a ação Desejada:"
                                    + "\n 1-Cadastrar Cachorro"
                                    + "\n 2-Cadastrar Gato"
                                    + "\n 3-Cadastrar Outro Especime"
                                    + "\n 4-Voltar"));
                                    if (acao == 1) {
                                        if (contC < animalCachorro.length) {
                                            animalCachorro[contC] = new Cachorro(null, null, acaoCadastro, null, null, null, null, null);
                                            animalCachorro[contC].setTipoAnimal(JOptionPane.showInputDialog("Informe o tipo:"));
                                            animalCachorro[contC].setNome(JOptionPane.showInputDialog("Informe o Nome do animal:"));
                                            animalCachorro[contC].setEspecie(JOptionPane.showInputDialog("Informe a especie:"));
                                            animalCachorro[contC].setSexo(JOptionPane.showInputDialog("Informe o sexo:"));
                                            animalCachorro[contC].setRaca(JOptionPane.showInputDialog("Informe a Raça:"));
                                            animalCachorro[contC].setCorPredominante(JOptionPane.showInputDialog("Informe a cor predominante:"));
                                            animalCachorro[contC].setProprietario(JOptionPane.showInputDialog("Informe o proprietário:"));
                                        }
                                    }
                }
            } else if (acao == 2) { // Consultar Animal
                boolean consulta = true;
                while (consulta) {
                    int acaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
                            "\n-------------Clinica My Pet*-------------"
                                    + "\nInforme a ação Desejada:"
                                    + "\n 1-Consultar Cachorro"
                                    + "\n 2-Consultar Gato"
                                    + "\n 3-Consultar Outro Especime"
                                    + "\n 4-Voltar"));
                }
            } else {
                menu = false;
                break;
            }
        }
    }
}