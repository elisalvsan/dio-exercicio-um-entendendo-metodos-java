package br.com.dio;

// Exercicio da aula 1 de Métodos.

import br.com.dio.calculadora.Calculadora;
import br.com.dio.emprestimo.Emprestimo;
import br.com.dio.mensagem.Mensagem;

public class Main {
    public static void main(String[] args) {

        //Resultado de Calculadora
        System.out.println("Exercício de Calculdaora");
        Calculadora.soma(7, 16);
        Calculadora.subtracao(154, 35);
        Calculadora.multiplicacao(15.5, 47);
        Calculadora.divisao(45, 15);

        //Resultado de Mensagem
        System.out.println("\nExercício de Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(14);

        //Resultado de Emprestimo
        System.out.println("\nExercício de Empréstimo");
        Emprestimo.calcular(4500,3);
        Emprestimo.calcular(4550, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(3500, 4);
    }
}
