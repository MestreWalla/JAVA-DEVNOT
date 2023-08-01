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

                        String[] options = { "Cadastrar Animal", "Consultar Animal", "Agendar Consulta", "Sair" };
                        // Integer[] acao = {1, 3, 5, 7, 9, 11};
                        // Double[] options = {3.141, 1.618};
                        // Character[] options = {'a', 'b', 'c', 'd'};
                        int acao = JOptionPane.showOptionDialog(null,
                                        "\n-------------Bem vindo a Clinica My Pet-------------"
                                                        + "\nClique a ação Desejada:",
                                        "Click a button",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options,
                                        options[0]);
                        System.out.println(acao);
                        if (acao == 0) { // Cadastrar Animal
                                boolean cadastro = true;
                                while (cadastro) {

                                        String[] options2 = { "Cadastrar Cachorro", "Cadastrar Gato",
                                                        "Cadastrar Outro Especime",
                                                        "Sair" };

                                        int acaoCadastro = JOptionPane.showOptionDialog(null,
                                                        "\n-------------Bem vindo a Clinica My Pet-------------"
                                                                        + "\nClique a ação Desejada:",
                                                        "Cadastro",
                                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                        null, options2,
                                                        options2[0]);
                                        System.out.println(acaoCadastro);

                                        if (acaoCadastro == 0) {
                                                if (contC < animalCachorro.length) {
                                                        animalCachorro[contC] = new Cachorro(acao, acaoCadastro, null,
                                                                        null, null,
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
                                        } else if (acaoCadastro == 1) {
                                                if (contG < animalGato.length) {
                                                        animalGato[contG] = new Gato(acao, acaoCadastro, null, null,
                                                                        null,
                                                                        acaoCadastro, null, null, null, null);
                                                        animalGato[contG].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o tipo:"));
                                                        animalGato[contG].setNome(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o Nome do animal:"));
                                                        animalGato[contG]
                                                                        .setSexo(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Gato"
                                                                                                        + "\nInforme o sexo:"));
                                                        animalGato[contG]
                                                                        .setRaca(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Gato"
                                                                                                        + "\nInforme a Raça:"));
                                                        animalGato[contG].setCorPredominante(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme a cor predominante:"));
                                                        animalGato[contG].setProprietario(
                                                                        JOptionPane.showInputDialog("\nCadatro de Gato"
                                                                                        + "\nInforme o proprietário:"));
                                                        contG++;
                                                }
                                        } else if (acaoCadastro == 2) {
                                                if (contO < animalOutros.length) {
                                                        animalOutros[contO] = new Outros(acao, acaoCadastro, null, null,
                                                                        null,
                                                                        acaoCadastro, null, null, null);
                                                        animalOutros[contO].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o tipo:"));
                                                        animalOutros[contO].setNome(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o Nome do animal:"));
                                                        animalOutros[contO]
                                                                        .setSexo(JOptionPane.showInputDialog(
                                                                                        "\nCadatro de Outro"
                                                                                                        + "\nInforme o sexo:"));
                                                        animalOutros[contO].setTipoAnimal(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme tipo de animal:"));
                                                        animalOutros[contO].setEspecie(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme a especie:"));
                                                        animalOutros[contO].setProprietario(
                                                                        JOptionPane.showInputDialog("\nCadatro de Outro"
                                                                                        + "\nInforme o proprietário:"));
                                                        contO++;
                                                }
                                        } else if (acaoCadastro == 3) {
                                                cadastro = false;
                                                break;
                                        }
                                }
                        } else if (acao == 1) { // Consultar Animal
                                boolean consulta = true;
                                while (consulta) {

                                        String[] options2 = { "Consultar Cachorro", "Consultar Gato",
                                                        "Consultar Outro Especime",
                                                        "Sair" };

                                        int acaoConsulta = JOptionPane.showOptionDialog(null,
                                                        "\n-------------Bem vindo a Clinica My Pet-------------"
                                                                        + "\nClique a ação Desejada:",
                                                        "Cadastro",
                                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                                                        null, options2,
                                                        options2[0]);
                                        System.out.println(acaoConsulta);

                                        if (acaoConsulta == 0) {
                                                String cachorroBuscado = JOptionPane
                                                                .showInputDialog("Informe o nome do Cachorro");
                                                int i;
                                                for (i = 0; i < contC; i++) {
                                                        if (cachorroBuscado.equals(animalCachorro[i].getNome())) {
                                                                String[] options3 = { "Agendar Consulta",
                                                                                "Adicionar Observações", "Fechar", };
                                                                int acaoConsultado = JOptionPane.showOptionDialog(null,
                                                                                "\n-------------Bem vindo a Clinica My Pet-------------"
                                                                                                + "\nNome: "
                                                                                                + animalCachorro[i]
                                                                                                                .getNome()
                                                                                                + "\nRaça: "
                                                                                                + animalCachorro[i]
                                                                                                                .getRaca()
                                                                                                + "\nCor Predominante: "
                                                                                                + animalCachorro[i]
                                                                                                                .getCorPredominante()
                                                                                                + "\nProprietário: "
                                                                                                + animalCachorro[i]
                                                                                                                .getProprietario()
                                                                                                + "\nSexo: "
                                                                                                + animalCachorro[i]
                                                                                                                .getSexo()
                                                                                                + "\nPeso: "
                                                                                                + animalCachorro[i]
                                                                                                                .getPeso()
                                                                                                + "\nTipo: "
                                                                                                + animalCachorro[i]
                                                                                                                .getTipoAnimal()
                                                                                                + "\nData de Agendamento: "
                                                                                                + animalCachorro[i]
                                                                                                                .getData()
                                                                                                + animalCachorro[i]
                                                                                                                .getHora()
                                                                                                + "\nObservações: "
                                                                                                + animalCachorro[i]
                                                                                                                .getInformaçoes()
                                                                                                + "\nClique a ação Desejada:",
                                                                                "Consulta / Agenda",
                                                                                JOptionPane.DEFAULT_OPTION,
                                                                                JOptionPane.INFORMATION_MESSAGE,
                                                                                null, options3,
                                                                                options3[0]);
                                                                System.out.println(acaoConsultado);
                                                                if (acaoConsultado == 0) {
                                                                        animalCachorro[contC].setData(Integer.parseInt(
                                                                                        JOptionPane.showInputDialog(
                                                                                                        "\nAgenda de Cachorro"
                                                                                                                        + "\nInforme a Data:")));
                                                                        animalCachorro[contC].setHora(Integer.parseInt(
                                                                                        JOptionPane.showInputDialog(
                                                                                                        "\nInforme o Horario:")));
                                                                } else if (acaoConsultado == 1) {
                                                                        animalCachorro[contC].setInformaçoes(
                                                                                        JOptionPane.showInputDialog(
                                                                                                        "\nAgenda de Cachorro"
                                                                                                                        + "\nAdicione Informações:"));
                                                                } else {
                                                                        menu = false;
                                                                        break;
                                                                }

                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        } else if (acaoConsulta == 1) {
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
                                                                                + animalGato[i].getPeso()
                                                                                + "\nTipo: "
                                                                                + animalGato[i].getTipoAnimal()
                                                                                + "\nData de Agendamento: "
                                                                                + animalGato[i].getData()
                                                                                + animalGato[i].getHora()
                                                                                + "\nObservações: "
                                                                                + animalGato[i].getInformaçoes());
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        } else if (acaoConsulta == 2) {
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
                                                                                + animalOutros[i].getData()
                                                                                + animalOutros[i].getHora()
                                                                                + "\nObservações: "
                                                                                + animalOutros[i].getInformaçoes());
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "\n Não Encontrado");
                                                        }
                                                }
                                        }
                                        consulta = false;
                                        break;
                                }
                        } else if (acao == 2) {
                                // AGENDAR CONSULTA
                                JOptionPane.showMessageDialog(null, "\n Menu agenda dentro de menu consulta");
                        } else {
                                menu = false;
                                break;
                        }
                }
        }
}