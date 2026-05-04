package br.com.uninter.exercicios.horario;

public class Principal {
    public static void main(String[] args) {


        Horario h1 = new Horario(22, 57, 15);
        System.out.printf("Horário completo: %02d:%02d:%02d%n",h1.hora, h1.minuto, h1.segundo);

        Horario h2 = new Horario(22);
        System.out.printf("Somente horário: %02d:%02d:%02d%n", h2.hora, h2.minuto, h2.segundo);

        Horario h3 = new Horario();
        System.out.printf("Horário inicial: %02d:%02d:%02d%n", h3.hora, h3.minuto, h3.segundo);
    }
}
