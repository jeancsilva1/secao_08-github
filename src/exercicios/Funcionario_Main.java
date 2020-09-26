package exercicios;

import java.util.Scanner;


public class Funcionario_Main {
    
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salario Bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();
        System.out.println(func);
        System.out.print("Qual a porcentagem do aumento salarial?");
        func.aumentarSalario(sc.nextInt());
        System.out.print("Atualizando Dados: ");
        System.out.println(func);
    }
    
}
