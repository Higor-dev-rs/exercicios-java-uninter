package br.com.uninter.exercicios.adm.ContaCorrente;

public class Conta {

    String correntista;
    float saldo;
    float limiteSaque;

    void sacar(float valor){
        //Fazendo assim pois deessa forma não poderá fazer saque caso não tenha saldo
        //ou que o valor seja maior que o saldo e também que o valor não seja maior que
        //o limite de saque
        if (valor <= saldo && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saque Negado! verifique seu saldo ou limite.");
        }
    }

    void depositar(float valor){
        saldo += valor;
        System.out.println(valor + " Depositado com sucesso!");
    }
    void info(){
        System.out.println("Saldo: " + saldo);
        System.out.println("limite para saque: " + limiteSaque);
    }

    void transferir(Conta destino, float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;

            destino.depositar(valor);
            System.out.println("Tranferência de R$: " + valor + " realizada com sucesso!");

        } else {
            System.out.println("Saldo insuficiente para transferir.");
        }
    }
}
