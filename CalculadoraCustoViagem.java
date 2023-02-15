package JAVA.CalculadoraCustoViagem;

/**
 * CalculadoraCustoViagem
 */
public class CalculadoraCustoViagem {

    public static void main(String[] args) {

        //CODIGO
        // 1- Obter a distancia percorrida na viagem em km
        // 2- Obter o consumo do veiculo em km/l
        // 3- Obter o preço do combustivel
        // 4- Calcular quantos litros foram gastos - Distancia/Consumo
        // 5- Calcular custo total Qtd. litros * Valor do combustivel

        //PSEUDOCODIGO
        // 1- distanciaPercorrida = obter do usuário(km);
        // 2- consumoTransporte = obter do usuário(km/l);
        // 3- precoCombustivel = obter do usuario(R$);
        // 4- quantidadeLitrosCombustivel = distanciaPercorrida/consumoTransporte;
        // 5- custoTotal=quantidadeLitrosCombustivel*precoCombustivel;
        // 6- MostrarParaUsuario(R$)

        int distancia = 19; //km
        double consumo = 10; //km/l
        double valorCombustivel = 5;
        double consumoCombustivel = distancia / consumo;
        double custoViagem = consumoCombustivel * valorCombustivel;
        System.out.println("O combustivel gasto é de " + consumoCombustivel + " Litros");
        System.out.println("O custo total da viagem é de R$ " + custoViagem + ".");
    }
}