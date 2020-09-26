/*
Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.
 */
package exercicios;

public class Estudante {

    public String nome;
    public double notaPrimeroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double notaFinal() {
        return notaPrimeroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public boolean aprovado() {
        if (notaPrimeroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre > 60) {
            System.out.println("APROVADO");
            return true;
        } else {
            double pontosRestantes = 60 - (notaPrimeroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre);
            System.out.println("Reprovado");
            System.out.println("Faltaram " + pontosRestantes + " pontos");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Estudante:" + nome + "\n" + notaPrimeroTrimestre + "\n" + notaSegundoTrimestre + "\n" + notaTerceiroTrimestre;
    }

}
