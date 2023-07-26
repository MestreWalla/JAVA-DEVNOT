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
                    "\n-------------Bem vindo a Clinica My Pet-------------"
                            + "\nInforme a ação Desejada:"
                            + "\n 1-Cadastrar Animal"
                            + "\n 2-Consultar Animal"
                            + "\n 3-Sair"));

            if (acao == 1) { // Cadastrar Animal
                boolean cadastro = true;
                while (cadastro) {
                    int acaoCadastro = Integer.parseInt(JOptionPane.showInputDialog(
                            "\n-------------Clinica My Pet-------------"
                                    + "\nInforme a ação Desejada:"
                                    + "\n 1-Cadastrar Cachorro"
                                    + "\n 2-Cadastrar Gato"
                                    + "\n 3-Cadastrar Outro Especime"
                                    + "\n 4-Voltar"));
                    if (acaoCadastro == 1) {
                        if (contC < animalCachorro.length) {
                            animalCachorro[contC] = new Cachorro(null, null, acaoCadastro, null, null, null, null,
                                    null);
                            animalCachorro[contC].setTipoAnimal(
                                    JOptionPane.showInputDialog("\nCadatro de Cachorro" + "\nInforme o tipo:"));
                            animalCachorro[contC].setNome(JOptionPane
                                    .showInputDialog("\nCadatro de Cachorro" + "\nInforme o Nome do animal:"));
                            animalCachorro[contC].setSexo(
                                    JOptionPane.showInputDialog("\nCadatro de Cachorro" + "\nInforme o sexo:"));
                            animalCachorro[contC].setRaca(
                                    JOptionPane.showInputDialog("\nCadatro de Cachorro" + "\nInforme a Raça:"));
                            animalCachorro[contC].setCorPredominante(JOptionPane
                                    .showInputDialog("\nCadatro de Cachorro" + "\nInforme a cor predominante:"));
                            animalCachorro[contC].setProprietario(
                                    JOptionPane.showInputDialog("\nCadatro de Cachorro" + "\nInforme o proprietário:"));
                                    contC++;
                        }
                    } else if (acaoCadastro == 2) {
                        if (contG < animalGato.length) {
                            animalGato[contC] = new Gato(null, null, acaoCadastro, null, null, null, null, null);
                            animalGato[contC].setTipoAnimal(
                                    JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme o tipo:"));
                            animalGato[contC].setNome(
                                    JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme o Nome do animal:"));
                            animalGato[contC]
                                    .setSexo(JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme o sexo:"));
                            animalGato[contC]
                                    .setRaca(JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme a Raça:"));
                            animalGato[contC].setCorPredominante(
                                    JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme a cor predominante:"));
                            animalGato[contC].setProprietario(
                                    JOptionPane.showInputDialog("\nCadatro de Gato" + "\nInforme o proprietário:"));
                                    contG++;
                        }
                    } else if (acaoCadastro == 3) {
                        if (contO < animalOutros.length) {
                            animalOutros[contC] = new Outros(null, null, acaoCadastro, null, null, null, null);
                            animalOutros[contC].setTipoAnimal(
                                    JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme o tipo:"));
                            animalOutros[contC].setNome(
                                    JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme o Nome do animal:"));
                            animalOutros[contC]
                                    .setSexo(JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme o sexo:"));
                            animalOutros[contC].setTipoAnimal(
                                    JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme tipo de animal:"));
                            animalOutros[contC].setEspecie(
                                    JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme a especie:"));
                            animalOutros[contC].setProprietario(
                                    JOptionPane.showInputDialog("\nCadatro de Outro" + "\nInforme o proprietário:"));
                                    contO++;
                        }
                    } else if (acaoCadastro == 4) {
                        cadastro = false;
                        break;
                    }
                }
            } else if (acao == 2) { // Consultar Animal
                boolean consulta = true;
                while (consulta) {
                    int acaoConsulta = Integer.parseInt(JOptionPane.showInputDialog(
                            "\n-------------Clinica My Pet-------------"
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