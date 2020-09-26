package exercicios;

import java.util.Scanner;

public class Estudante_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante est = new Estudante();
        est.nome = sc.nextLine();
        est.notaPrimeroTrimestre = sc.nextDouble();
        est.notaSegundoTrimestre = sc.nextDouble();
        est.notaTerceiroTrimestre = sc.nextDouble();
        System.out.println(est);
        System.out.println(est.notaFinal());
        System.out.println(est.aprovado());

    }

}
