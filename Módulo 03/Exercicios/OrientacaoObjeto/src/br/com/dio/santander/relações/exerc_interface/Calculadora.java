package br.com.dio.santander.relações.exerc_interface;

public class Calculadora implements OperacaoMatematica {
//É obrigado a implementar os métodos que chamou na interface

    @Override
    public void soma (double operando1, double operando2){
        System.out.println("Soma: " + (operando1 + operando2));
    }

    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Divisão: " + (operando1 / operando2));
    }





}
