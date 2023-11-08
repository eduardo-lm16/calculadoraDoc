package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testes de soma");
        soma testeSoma = new soma();
        int teste1 = testeSoma.soma(10,10);
        System.out.println("Teste 1 - soma de dois números positivos (10+10): " + teste1);
        /*Nenhum erro encontrado.*/
        int teste2 = testeSoma.soma(-10,10);
        System.out.println("Teste 2 - soma de um número negativo e um positivo (-10+10): " + teste2);
        /*Nenhum erro encontrado.*/
        int teste3 = testeSoma.soma(-10,-10);
        System.out.println("Teste 3 - soma de dois números negativos ((-10) + (-10)): " + teste3);
        /*Nenhum erro encontrado.*/
        int teste4 = testeSoma.soma(0,0);
        System.out.println("Teste 4 - soma de dois zeros: " + teste4);
        /*Nenhum erro encontrado.*/
        int teste5 = testeSoma.soma(0,10);
        System.out.println("Teste 5 - soma de um zero e um número inteiro: " + teste5 + '\n');
        /*Nenhum erro encontrado.*/

        System.out.println("Testes de subtração");
        subtracao testeSubtracao = new subtracao();
        int teste6 = testeSubtracao.subtracao(20,10);
        System.out.println("Teste 6 - subtração de dois números positivos (20-10): " + teste6);
        /*Nenhum erro encontrado.*/
        int teste7 = testeSubtracao.subtracao(-20,10);
        System.out.println("Teste 7 - subtração de um número negativo e um positivo ((-20)-10): " + teste7);
        /*Nenhum erro encontrado.*/
        int teste8 = testeSubtracao.subtracao(-20,-20);
        System.out.println("Teste 8 - subtração de dois números negativos ((-20)-(-20)): " + teste8);
        /*Nenhum erro encontrado.*/
        int teste9 = testeSubtracao.subtracao(0,0);
        System.out.println("Teste 9 - subtração de dois zeros: " + teste9);
        /*Nenhum erro encontrado.*/
        int teste10 = testeSubtracao.subtracao(10,0);
        System.out.println("Teste 9 - subtração de número inteiro e zero (10-0): " + teste10 + '\n');
        /*Nenhum erro encontrado.*/

        System.out.println("Testes de multiplicação");
        multiplicacao testeMultiplicacao = new multiplicacao();
        int teste11 = testeMultiplicacao.multiplicacao(10,10);
        System.out.println("Teste 11 - multiplicação de dois números positivos (10x10): " + teste11);
        /*Nenhum erro encontrado.*/
        int teste12 = testeMultiplicacao.multiplicacao(-10,10);
        System.out.println("Teste 12 - multiplicação de um número negativo e um positivo ((10)x10): " + teste12);
        /*Nenhum erro encontrado.*/
        int teste13 = testeMultiplicacao.multiplicacao(-10,-10);
        System.out.println("Teste 13 - multiplicação de dois números negativos ((-10) x(-10)): " + teste13);
        /*Nenhum erro encontrado.*/
        int teste14 = testeMultiplicacao.multiplicacao(0,0);
        System.out.println("Teste 14 - multiplicação de dois zeros: " + teste14);
        /*Nenhum erro encontrado.*/
        int teste15 = testeMultiplicacao.multiplicacao(0,10);
        System.out.println("Teste 15 - multiplicação de um zero e um número inteiro: " + teste15 + '\n');
        /*Nenhum erro encontrado. */

        System.out.println("Testes de divisão");
        divisao testeDivisao = new divisao();
        int teste16 = testeDivisao.divisao(10,2);
        System.out.println("Teste 16 - divisão de dois números positivos (10/2): " + teste16);
        /*Nenhum erro encontrado.*/
        int teste17 = testeDivisao.divisao(-10,2);
        System.out.println("Teste 17 - divisão de um número negativo e um positivo ((-10)/2): " + teste17);
        /*Nenhum erro encontrado.*/
        int teste18 = testeDivisao.divisao(-10,-2);
        System.out.println("Teste 18 - divisão de dois números negativos ((-10) / (-2)): " + teste18);
        /*Nenhum erro encontrado.*/
        int teste19 = testeDivisao.divisao(0,0);
        System.out.println("Teste 19 - divisão de dois zeros: " + teste19);
        /*Como não é possível dividir um número por zero, esta operação retorna erro no código*/
        int teste20 = testeDivisao.divisao(0,10);
        System.out.println("Teste 20 - divisão e um zero e um número inteiro: " + teste20 + '\n');
        /*Como não é possível dividir um número por zero, esta operação retorna erro no código*/
    }
}