package br.com.uninter.exercicios.calculoNotas;

public class Principal {
    public static void main(String[] args) {

        //Aqui crio o objeto higor que está ligado a classe nota, para dar a nota para
        //dar nota a algo ou alguem especifico
        Nota higor = new Nota();

        //Aqui estou fazendo atribuição de valores aos atributos do objeto
        higor.nota1 = 9f;
        higor.nota2 = 7f;
        higor.nota3 = 8f;

        //Aqui é criado a variável que irá receber o resultado e puxa dizendo de quem é
        //e informando que será calculado pela media aritmetica nesse momento
        float resultado = higor.aritmetica();

        //Aqui imprime o resultado da mesma
        System.out.println("Média aritmetica é: " + resultado);

        //nesse caso aqui usa a mesma variável já usada antes para resultado,
        //mas não preciso mais do float, pois já foi declarada anteriormente
        //e agora está chamando o metodo da ponderada, e informando de quem é
        resultado = higor.ponderada();
        //imprimindo o resultado da ponderada
        System.out.println("Média ponderada é: " + resultado);

    }
}
