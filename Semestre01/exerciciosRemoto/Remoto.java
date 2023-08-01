import java.util.Scanner;

public class Remoto {
  Scanner sc = new Scanner(System.in);

  public void valorMaior() {
    System.out.println("Informe um numero que direi se é maior que 10:");
    int valor = sc.nextInt();
    if (valor >= 10) {
      System.out.println("O número " + valor + " é maior que 10.");
    } else {
      System.out.println("O número " + valor + " não é maior que 10.");
    }
  }
// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 5 semanas exatas 5x40 = 200 horas mês).
public void calculoTrabalhista(){
  System.out.println("Quantas horas voce trabalhou no mês?");
  int horas = sc.nextInt();
  System.out.println("Qual o valor da sua hora?");
  int valor = sc.nextInt();
  int salario = horas*valor;
  double salarioExtra = (horas-200)*(valor*0.50);
  double salarioTotalEx = salario + salarioExtra;
  if (horas >= 40){
    System.out.println("O valor a receber sera de R$" + salario);
  } else {System.out.println ("O valor a receber sera de R$" + salarioTotalEx);
}}
  // 3. Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 2.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.
  public void calculoTrabalhista2(){
    System.out.println("Informe o seu salário fixo:");
    int salario = sc.nextInt();
    System.out.println("Informe o valor de toda a venda do mês:");
    int vendas = sc.nextInt();
    if (vendas >= 2500) {
      System.out.println("O salário total a receber sera de: R$" + salario+(vendas*0.05));
    } else {System.out.println("O salário total a receber sera de: R$" + salario+(vendas*0.03));
    }
  }
// 4. Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'
  public void creditoBanco(){
    System.out.println("Informe o número da conta:");
    int numero = sc.nextInt();
    System.out.println("Informe o saldo da conta:");
    int saldo = sc.nextInt();
    System.out.println("Informe o débito da conta:");
    int debito = sc.nextInt();
    System.out.println("Informe o crédito da conta:");
    int credito = sc.nextInt();
    int saldoAtual = saldo - debito + credito;
    System.out.println("O saldo atual da conta é de R$" + saldoAtual);
    if (saldoAtual >= 0) {
      System.out.println("Seu saldo é negativo");
        } else { System.out.println("Seu saldo é positivo");
    }
  }
// 5. Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
public void valorMaior2(){
  System.out.println("Digite 3 valores diferentes e informarei o maior deles.");
  System.out.println("Informe o primeiro valor:");
    int valorUm = sc.nextInt();
  System.out.println("Informe o segundo valor:");
    int valorDois = sc.nextInt();
  System.out.println("Informe o terceiro valor:");
    int valorTres = sc.nextInt();
  if (valorUm >= valorDois && valorDois >= valorTres){
    System.out.println("O valor " + valorUm + "é maior.");
  } else if (valorDois >= valorUm && valorUm >= valorTres) {
    System.out.println("O valor " + valorDois + "é maior");
  } else {System.out.println("O valor " + valorTres + "é maior");
  }
}
// 6. Um posto está vendendo combustíveis com a seguinte tabela de descontos: Álcool até 20 litros desconto de 3%/l, acima de 20 litros desconto de 5%/l. Gasolina até 20 litros desconto de 4%/l, acima de 20 litros desconto de 6%/l. Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 5,30 e o preço do litro do álcool é R$ 3,90.
  public void gasolina(){
    System.out.println("Informe quantos litros foram vendidos:");
    int litros = sc.nextInt();
    System.out.println("Informe o tipo de combustível digitando (1) para álcool e (2) para gasolina:");
    double combustivel = sc.nextInt();
    double valorG = 5.30;
    double valorA = 3.9;
    double valorC;
    double desconto;
    if (combustivel  == 1) {
      valorC = valorA;
    } else {valorC = valorG;
    }
    if (combustivel == 1 && litros >= 21) {
      desconto = 0.05;
    } else if (combustivel == 1 && litros <= 20) {
      desconto = 0.03;
    } else if (combustivel == 2 && litros >= 20) {
      desconto = 0.06;
    } else if (combustivel == 2 && litros <= 20) {
      desconto = 0.04;
    }
    
  }
  // 7. Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que: - Se quantidade <= 5 o desconto será de 2% - Se quantidade > 5 e quantidade <=10 o desconto será de 3% - Se quantidade > 10 o desconto será de 5%
}