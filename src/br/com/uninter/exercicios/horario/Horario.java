package br.com.uninter.exercicios.horario;

public class Horario {

    int hora;
    int minuto;
    int segundo;

    Horario (int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0;
            System.out.println("Erro: Horário inválido! ");
        }

        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            this.minuto = 0;
            System.out.println("Erro: Minuto inválido! ");
        }

        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;

        } else {
            this.segundo = 0;
            System.out.println("Erro: Segundo inválido! ");
        }
    }

    Horario(int hora) {
        if (hora >= 0 && hora <= 59) {
            this.hora = hora;
        } else {
            System.out.println("Erro: Hora inválida! ");
        }

        this.minuto = 0;
        this.segundo = 0;
    }

    Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }


}
