package POOBanco06062023;

import javax.swing.JOptionPane;

import POOBanco06062023.Conta.ContaPJ;
import POOBanco06062023.Conta.ContaPf;

public class App {
    public static void main(String[] args) {
        ContaPJ clientePJ[] = new ContaPJ[10];
        ContaPf clientePF[] = new ContaPf[10];
        boolean aberto = true;
        int contPJ = 0;
        int contPF = 0;

        while (aberto) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n-------------Bem vindo ao Banco PT*-------------"
                            + "\nAqui você não perde, mas também não ganha"
                            + "\nInforme a ação Desejada:"
                            + "\n 1-Abrir Conta PJ"
                            + "\n 2-Abrir Conta PF"
                            + "\n 3-Acessar Conta PJ"
                            + "\n 4-Acessar Conta PF"
                            + "\n 5-Sair"));

            if (acao == 1) { // ABRIR CONTA PJ
                if (contPJ < clientePJ.length) {
                    clientePJ[contPJ] = new ContaPJ();
                    clientePJ[contPJ].setNomePJ(JOptionPane.showInputDialog("Informe o Nome da Empresa:"));
                    clientePJ[contPJ].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da Empresa:"));
                    clientePJ[contPJ].setnConta(2000 + contPJ);
                    clientePJ[contPJ].setSaldo(0);
                    JOptionPane.showMessageDialog(null, "Conta PJ Criada com Sucesso");
                    contPJ++;
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de contas PJ atingido");
                }
            } else if (acao == 3) { // ACESSAR CONTA PJ
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta PJ buscada"));
                int i;
                for (i = 0; i < contPJ; i++) {
                    if (nContaBuscada == clientePJ[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                        // ACESSAR CONTA
                        boolean acesso = true;
                        while (acesso) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                                    + "\n1-Consultar Saldo"
                                    + "\n2-Realizar Saque"
                                    + "\n3-Transferir"
                                    + "\n4-Deposito"
                                    + "\n5-Emprestimo"
                                    + "\n6-Sair da conta"));
                            if (acao2 == 1) { // saldo
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                            } else if (acao2 == 2) { // Saque
                                clientePJ[i].saque();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                            } else if (acao2 == 3) { // transferir
                                clientePJ[i].transferir(clientePJ);
                                JOptionPane.showMessageDialog(null, "Seu Saldo é de R$ " + clientePJ[i].getSaldo());

                            } else if (acao2 == 4) { // deposito
                                clientePJ[i].deposito();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                            } else if (acao2 == 5) { // emprestimo
                                clientePJ[i].emprestimo();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePJ[i].getSaldo());
                            } else if (acao2 == 6) { // Sair da conta
                                JOptionPane.showMessageDialog(null,
                                        "Sessão encerrada. Obrigado por utilizar o Banco PT*");
                                acesso = false; // Define acesso como falso para sair do loop
                                break; // Sai do loop while (acesso)
                            } else {
                                break;
                            }
                        }
                        if (i == contPJ) {
                            JOptionPane.showMessageDialog(null, "Conta PJ não encontrada");
                        }
                    }
                }
            } else if (acao == 2) { // ABRIR CONTA PF
                if (contPF < clientePF.length) {
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
                    if (idade >= 18) {
                        clientePF[contPF] = new ContaPf();
                        clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o Nome:"));
                        clientePF[contPF].setCpf(JOptionPane.showInputDialog("Informe o CPF:"));
                        clientePF[contPF].setnConta(3000 + contPF);
                        clientePF[contPF].setSaldo(0);
                        clientePF[contPF].setIdade(idade);
                        JOptionPane.showMessageDialog(null, "Conta PF Criada com Sucesso");
                        contPF++;
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "\nQue pena, sua idade não é suficiente"
                                        + "\nVocê não pode criar uma conta sozinho ainda,"
                                        + "\nprocure uma agência física junto aos seus pais.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Limite de contas PF atingido");
                }
            } else if (acao == 4) { // ACESSAR CONTA PF
                int nContaBuscada = Integer.parseInt(JOptionPane.showInputDialog("Informe o nº da Conta PF buscada"));
                int i;
                for (i = 0; i < contPF; i++) {
                    if (nContaBuscada == clientePF[i].getnConta()) {
                        JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                        // ACESSAR CONTA
                        boolean acesso = true;
                        while (acesso) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação Desejada:"
                                    + "\n1-Consultar Saldo"
                                    + "\n2-Realizar Saque"
                                    + "\n3-Transferir"
                                    + "\n4-Deposito"
                                    + "\n5-Emprestimo"
                                    + "\n6-Sair da conta"));
                            if (acao2 == 1) { // saldo
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            } else if (acao2 == 2) { // Saque
                                clientePF[i].saque();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            } else if (acao2 == 3) { // transferir
                                clientePF[i].transferir(clientePJ);
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            } else if (acao2 == 4) { // deposito
                                clientePF[i].deposito();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            } else if (acao2 == 5) { // emprestimo
                                clientePF[i].emprestimo();
                                JOptionPane.showMessageDialog(null,
                                        "Seu Saldo é de R$ " + clientePF[i].getSaldo());
                            } else if (acao2 == 6) { // Sair da conta
                                JOptionPane.showMessageDialog(null,
                                        "Sessão encerrada. Obrigado por utilizar o Banco PT*");
                                acesso = false; // Define acesso como falso para sair do loop
                                break; // Sai do loop while (acesso)
                            } else {
                                break;
                            }
                        }
                        if (i == contPF) {
                            JOptionPane.showMessageDialog(null, "Conta PF não encontrada");
                        }
                    }
                }
            } else if (acao == 5) { // ENCERRAR SESSÃO
                aberto = false;
                JOptionPane.showMessageDialog(null, "Programa encerrado");
            } else {
                JOptionPane.showMessageDialog(null, "Ação inválida");
            }
        }
    }
}
