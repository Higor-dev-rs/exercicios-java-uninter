package calculoNotas;

public class Nota {
    //criando a classe nota, e que a mesma tenha atributos nota1, nota2 e nota 3
    float nota1, nota2, nota3;

    //criei o metodo para fazer a conta aritmetica e retorna esse calculo quando for chamada
    float aritmetica() {
        return (nota1 + nota2 + nota3) / 3;
    }

    //criei o metodo para ponderada, onde irá fazer o mesmo que o metodo anterior,
    //mas agora calculando de acordo com o que pede para ter sua media
    float ponderada() {
        return (nota1 * 2 + nota2 * 3 + nota3 * 4) / 9;
    }


}
