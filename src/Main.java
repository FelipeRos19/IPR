public class Main {
    /*
    IF é uma estrutura condicional ou um laço de controle.
    Estrutura básica:
    if (condição lógica) {
        Bloco de código caso sua condição lógica seja atendida.
    } else {
        Bloco de código caso sua condição lógica não seja atendida.
    }

    O que é uma condição lógica?
    - É uma expressão cujo objetivo é definir se algo é VERDADEIRO ou FALSO, dentro do código cria um controle para seu algoritmo.
    Caso sua condição lógica seja atendida o algoritmo seguirá por um caminho ou se a condição não for atendida seguirá por outro.
    */

    //Exemplos:
    /*
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        if (a < b) {
            System.out.println("B é maior que A!");
        } else {
            System.out.println("A é maior que B!");
        }
        //No exemplo apresentado podemos verificar que a condição lógica não foi atendida então o bloco executado foi o IF

        a = 2;
        b = 1;

        if (a < b) {
            System.out.println("B é maior que A!");
        } else {
            System.out.println("A é maior que B!");
        }

        //No segundo exemplo apresentado alteramos o valor das variáveis e a condição lógica não foi atendida então o bloco executado foi o ELSE
    }
     */

    /*
    Nos exemplos anteriores foram apresentadas condições lógicas simples, mas ainda existem outras formas de serem escritas e assim expressar casos mais complexos.
    Existem diferentes OPERADORES LÓGICOS que podem ser utilizados.
    Lista de Operadores:
    - Igualdade (==): Utilizado para verificar se alguma coisa é igual a outra.
    - Desigualdade (!=): Utilizado para verificar se alguma coisa é diferente de outra.
    - Maior (>): Utilizado para verificar se alguma coisa é maior que outra.
    - Menor (<): Utilizado para verificar se alguma coisa é menor que outra.
    - Maior ou igual (>=): Utilizado para verificar se alguma coisa é maior ou igual outra.
    - Menor ou igual (<=): Utilizado para verificar se alguma coisa é menor ou igual outra.
    - E (&&): Utilizado para definir que ambas as condições lógicas precisam ser atendidas.
    - Ou (||): Utilizado para definir que apenas uma das condições lógicas precisa ser atendida. (Também permite que as duas condições lógicas sejam atendidas!)

    Todos esses operadores podem ser utilizados dentro do IF/Else para escrever condições lógicas.
     */

    //Exemplos:
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 1;

        if (a > b && c < d) {
            System.out.println("A é maior que B e D é maior que C");
        } else {
            System.out.println("Uma das condições não foram atendidas!");
        }
        //No exemplo apresentado anteriormente ambas as condições precisavam ser atendidas para o bloco IF ser executado.

        if (a < b || c > d) {
            System.out.println("A é menor que B ou C é maior que D");
        } else {
            System.out.println("Nenhuma das condições foram atendidas!");
        }
        //No exemplo apresentado anteriormente apenas uma das condições precisava ser atendida para o bloco IF ser executado.
    }
}