public class Operadores {
    public static void main(String[] args) {
        // // classe Operadores.java
        // int numero = 5;

        // // Imprimindo o numero negativo
        // System.out.println(-numero);

        // // incrementando numero em mais 1 numero, imprime 6
        // numero++;
        // System.out.println(numero);

        // // incrementando numero em mais 1 numero, imprime 7
        // System.out.println(numero++);// ops algo de errado não está certo

        // System.out.println(numero);// agora sim, numero virou 7

        // // ordem de precedencia conta aqui
        // System.out.println(++numero);

        // boolean verdadeiro = true;

        // System.out.println("Inverteu " + !verdadeiro);

        // int numero1 = 130;
        // int numero2 = 130;
        // System.out.println(numero1 == numero2); // true

        // Integer numero3 = 130;
        // Integer numero4 = 130;

        // System.out.println(numero3 == numero4); // false

        // // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // // Como objetos a partir de agora.
        // // Qual a solução ?
        // // Quando queremos comparar objetos, usamos o método equals

        // System.out.println(numero3.equals(numero4));

        // ComparacaoAvancada.java
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 1 || numero2++ == 2)
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2
        // )
    }
}
