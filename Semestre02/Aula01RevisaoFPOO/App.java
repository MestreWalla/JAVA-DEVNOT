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
                                                        + "\n 3-Agendar Consulta"
                                                        + "\n 4-Sair"));

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
                                                        animalCachorro[contC] = new Cachorro(acao, null, null, null,
                                                                        acaoCadastro, null, null, null, null);
                                                        animalCachorro[contC].setTipoAnimal(
                                                                        JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Cachorro"
                                                                                                        + "\nInforme o tipo:"));
                                                        animalCachorro[contC].setNome(JOptionPane
                                                                        .showInputDialog("\nCadatro de Cachorro"
                                                                                        + "\nInforme o Nome do animal:"));
                                                        animalCachorro[contC].setSexo(
                                                                        JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Cachorro"
                                                                                                        + "\nInforme o sexo:"));
                                                        animalCachorro[contC].setRaca(
                                                                        JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Cachorro"
                                                                                                        + "\nInforme a Raça:"));
                                                        animalCachorro[contC].setCorPredominante(JOptionPane
                                                                        .showInputDialog("\nCadatro de Cachorro"
                                                                                        + "\nInforme a cor predominante:"));
                                                        animalCachorro[contC].setProprietario(
                                                                        JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Cachorro"
                                                                                                        + "\nInforme o proprietário:"));
                                                        contC++;
                                                }
                                        } else if (acaoCadastro == 2) {
                                                if (contG < animalGato.length) {
                                                        animalGato[contC] = new Gato(acao, null, null, null,
                                                                        acaoCadastro, null, null, null, null);
                                                        animalGato[contC].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o tipo:"));
                                                        animalGato[contC].setNome(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o Nome do animal:"));
                                                        animalGato[contC]
                                                                        .setSexo(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Gato"
                                                                                                        + "\nInforme o sexo:"));
                                                        animalGato[contC]
                                                                        .setRaca(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Gato"
                                                                                                        + "\nInforme a Raça:"));
                                                        animalGato[contC].setCorPredominante(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme a cor predominante:"));
                                                        animalGato[contC].setProprietario(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o proprietário:"));
                                                        contG++;
                                                }
                                        } else if (acaoCadastro == 3) {
                                                if (contO < animalOutros.length) {
                                                        animalOutros[contC] = new Outros(acao, null, null, null,
                                                                        acaoCadastro, null, null, null);
                                                        animalOutros[contC].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o tipo:"));
                                                        animalOutros[contC].setNome(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o Nome do animal:"));
                                                        animalOutros[contC]
                                                                        .setSexo(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Outro"
                                                                                                        + "\nInforme o sexo:"));
                                                        animalOutros[contC].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme tipo de animal:"));
                                                        animalOutros[contC].setEspecie(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme a especie:"));
                                                        animalOutros[contC].setProprietario(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o proprietário:"));
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

                                        if (acaoConsulta == 1) {
                                                String cachorroBuscado = JOptionPane
                                                                .showInputDialog("Informe o nome do Cachorro");
                                                int i;
                                                for (i = 0; i < contC; i++) {
                                                        if (cachorroBuscado.equals(animalCachorro[i].getNome())) {
                                                                JOptionPane.showMessageDialog(null, "\n Encontrado"
                                                                                + "\nNome: "
                                                                                + animalCachorro[i].getNome()
                                                                                + "\nRaça: "
                                                                                + animalCachorro[i].getRaca()
                                                                                + "\nCor Predominante: "
                                                                                + animalCachorro[i].getCorPredominante()
                                                                                + "\nProprietário: "
                                                                                + animalCachorro[i].getProprietario()
                                                                                + "\nSexo: "
                                                                                + animalCachorro[i].getSexo()
                                                                                + "\nPeso: "
                                                                                + animalCachorro[i].getPeso()
                                                                                + "\nTipo: "
                                                                                + animalCachorro[i].getTipoAnimal()
                                                                                + "\nData de Agendamento: "
                                                                                + animalCachorro[i].getData()
                                                                                + "\nObservações: "
                                                                                + animalCachorro[i].getInformaçoes());
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        } else if (acaoConsulta == 2) {
                                                String gatoBuscado = JOptionPane
                                                                .showInputDialog("Informe o nome do Gato");
                                                int i;
                                                for (i = 0; i < contC; i++) {
                                                        if (gatoBuscado.equals(animalGato[i].getNome())) {
                                                                JOptionPane.showMessageDialog(null, "\n Encontrado"
                                                                                + "\nNome: "
                                                                                + animalGato[i].getNome()
                                                                                + "\nRaça: "
                                                                                + animalGato[i].getRaca()
                                                                                + "\nCor Predominante: "
                                                                                + animalGato[i].getCorPredominante()
                                                                                + "\nProprietário: "
                                                                                + animalGato[i].getProprietario()
                                                                                + "\nSexo: "
                                                                                + animalGato[i].getSexo()
                                                                                + "\nPeso: "
                                                                                + animalCachorro[i].getPeso()
                                                                                + "\nTipo: "
                                                                                + animalCachorro[i].getTipoAnimal()
                                                                                + "\nData de Agendamento: "
                                                                                + animalCachorro[i].getData()
                                                                                + "\nObservações: "
                                                                                + animalCachorro[i].getInformaçoes());
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        } else if (acaoConsulta == 3) {
                                                String animalBuscado = JOptionPane
                                                                .showInputDialog("Informe o nome do Animal");
                                                int i;
                                                for (i = 0; i < contC; i++) {
                                                        if (animalBuscado.equals(animalOutros[i].getNome())) {
                                                                JOptionPane.showMessageDialog(null, "\n Encontrado"
                                                                                + "\nTipo: "
                                                                                + animalOutros[i].getTipoAnimal()
                                                                                + "\nNome: "
                                                                                + animalOutros[i].getNome()
                                                                                + "\nEspecie: "
                                                                                + animalOutros[i].getEspecie()
                                                                                + "\nPeso: "
                                                                                + animalOutros[i].getPeso()
                                                                                + "\nProprietário: "
                                                                                + animalOutros[i].getProprietario()
                                                                                + "\nSexo: "
                                                                                + animalOutros[i].getSexo()
                                                                                + "\nData de Agendamento: "
                                                                                + animalCachorro[i].getData()
                                                                                + "\nObservações: "
                                                                                + animalCachorro[i].getInformaçoes());
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        }
                                }
                        } else {
                                menu = false;
                                break;
                        }
                }
        }
}