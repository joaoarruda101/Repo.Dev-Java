package Projects.Calculadora;

import java.util.ArrayList;

public class Operacoes {

    public  void Somar(ArrayList<Double> listaNumeros){
        int soma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            soma += listaNumeros.get(i);
        }
        System.out.println("SOMA = " + soma);
    }

    public void Dividir(double dividendo, double divisor){
        System.out.println("DIVISÃO = " + ( dividendo / divisor) );
    }

    public  void Multiplicar(ArrayList<Double> listaNumeros){
        double multiplo = 1;
        for (int i = 0; i < listaNumeros.size(); i++) {
            multiplo *= listaNumeros.get(i);
        }
        System.out.println("MULTIPLO = " + multiplo);
    }

    public void Subtrair(double numeroMaior, double numeroMenor){
        System.out.println("SUBTRAÇÃO = " + (numeroMaior - numeroMenor));
    }
}


