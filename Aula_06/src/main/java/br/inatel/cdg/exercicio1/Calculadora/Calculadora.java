package br.inatel.cdg.exercicio1.Calculadora;

public class Calculadora {

    private static int qtdDeVezUsada = 0;
    private static double PI = 3.14;//Final = const, ou seja PI é constante

    public static double circunferencia(double raio){
        qtdDeVezUsada++;
        return PI*(raio*raio);
    }

    public static double volume (double raio){
        qtdDeVezUsada++;
        return (4.0/3.0)*PI*(raio*raio*raio);
    }

    public static int getQtdDeVezUsada() {
        return qtdDeVezUsada;
    }

    public static void setPi(double pi){
        PI = pi;
    }
}
