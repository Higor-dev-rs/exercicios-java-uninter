package br.com.uninter.exercicios.adm.ContaCorrente;

public class Principal {
    public static void main(String[] args) {

        Conta contaHigor = new Conta();
        contaHigor.correntista = "Higor";
        contaHigor.saldo = 500f;
        contaHigor.limiteSaque = 300f;

        contaHigor.depositar(100f);
        contaHigor.sacar(50f);

        System.out.println("-- Status da conta antes da transferência --");
        contaHigor.info();

        Conta contaDestino = new Conta();
        contaDestino.correntista = "Sabrina";
        contaDestino.saldo = 0f;

        contaHigor.transferir(contaDestino, 200f);

        System.out.println("-- Após a tranferência --");
        contaHigor.info();
        contaDestino.info();
    }
}
