/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class ConversaoDolar {
    public static double converterDolar(double valorDolar, double valorInvestir){
        return valorDolar * valorInvestir * (1.0 + 0.06);
    }
    

    
    
}
    


