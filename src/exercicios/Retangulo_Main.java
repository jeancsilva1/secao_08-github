package exercicios;

import java.util.Scanner;


public class Retangulo_Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a largura do Retangulo: ");
        ret.largura = sc.nextDouble();
        System.out.println("Entre com a altura do Retangulo:");
        ret.altura = sc.nextDouble();
        
        System.out.print("AREA: ");
        System.out.print(ret.calculaArea());
        System.out.println("");
        System.out.print("PERIMETRO: ");
        System.out.print(ret.perimetro());
        System.out.println("");
        System.out.print("DIAGONAL: ");
        System.out.print(ret.diagonal());
        
    }
    
}
