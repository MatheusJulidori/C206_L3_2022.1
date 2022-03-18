package br.inatel.cdg;

import br.inatel.cdg.Calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculadora usada "+Calculadora.getQtdDeVezUsada()+" vezes");

        double raio = 6.0;

        System.out.println("Valor da circunferencia de raio "+raio+": "+Calculadora.circunferencia(raio));
        System.out.println("Valor do volume de raio "+raio+": "+Calculadora.volume(raio));

        System.out.println("Calculadora usada "+Calculadora.getQtdDeVezUsada()+" vezes");

        Calculadora.setPi(3.1415);

        System.out.println("Valor da circunferencia de raio "+raio+": "+Calculadora.circunferencia(raio));
        System.out.println("Valor do volume de raio "+raio+": "+Calculadora.volume(raio));

        System.out.println("Calculadora usada "+Calculadora.getQtdDeVezUsada()+" vezes");
    }

}
