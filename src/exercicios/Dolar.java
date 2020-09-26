/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */
package exercicios;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor do Dolar?");
        double precoDolar = sc.nextDouble();

        System.out.print("Quantos reais vc vai investir?");
        double valorAComprar = sc.nextDouble();
        double valorFinal = ConversaoDolar.converterDolar(precoDolar, valorAComprar);
        System.out.println("Valor final em reais: " + valorFinal);
        
        
    }

}
