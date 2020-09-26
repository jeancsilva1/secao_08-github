/*
Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

 */
package exercicios;

public class Retangulo {
    
    public double altura;
    public double largura;
    
    public double calculaArea(){
        return this.altura * this.largura;
    }
    
    public double perimetro(){
        return altura + altura + largura + largura;
    }
    public double diagonal(){
        return altura * largura /2;
    }
}
