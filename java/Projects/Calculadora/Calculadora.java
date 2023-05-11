package Projects.Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Menu();
        while (true) {

            ArrayList<Double> listCalcSoma = new ArrayList<Double>();
            ArrayList<Double> listCalcMultiplicar = new ArrayList<Double>();
            Operacoes operacao = new Operacoes();
            Scanner read = new Scanner(System.in);

            System.out.print("Use > ");
            int esc = read.nextInt();

            if (esc == 1) {
                System.out.println("!!! Escreva os números para SOMAR - (0) para resultado !!!");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    double resultado = read.nextDouble();
                    listCalcSoma.add(resultado);
                    if (resultado == 0) {
                        System.out.flush();
                        Menu();
                        operacao.Somar(listCalcSoma);
                        break;
                    }
                }
            }
            if (esc == 2) {
                System.out.println("!!! Escreva os números para DIVIDIR !!!");
                System.out.print("Dividendo > ");
                double dividendo = read.nextInt();
                System.out.print("Divisor > ");
                double divisor = read.nextInt();
                System.out.flush();
                Menu();
                operacao.Dividir(dividendo, divisor);
            }
            if (esc == 3) {
                System.out.println("!!! Escreva os números para MULTIPLICAR - (0) para resultado !!!");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    double resultado = read.nextDouble();
                    listCalcMultiplicar.add(resultado);
                    if (listCalcMultiplicar.size() == 2) {
                        System.out.flush();
                        Menu();
                        operacao.Multiplicar(listCalcMultiplicar);
                        break;
                    }

                }
            }
            if (esc == 4) {
                System.out.println("!!! Escreva os números para SUBTRAIR !!!");
                System.out.print("Número Maior : ");
                double numeroMaior = read.nextInt();
                System.out.print("Número Menor : ");
                double numeroMenor = read.nextInt();
                System.out.flush();
                Menu();
                operacao.Subtrair(numeroMaior, numeroMenor);
            }
        }
    }

    public static void Menu() {
        System.out.println("===================** DESENVOLVEDOR João ( Victor ) F. Arruda **====================");
        String[] options = { "SOMAR", "DIVIDIR", "MULTIPLICAR", "SUBTRAIR" };

        for (int i = 1; i <= 4; i++) {
            for (String item : options) {
                System.out.println("[" + i++ + "]" + item);
            }
        }
    }
}
