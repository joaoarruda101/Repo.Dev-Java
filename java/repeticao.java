import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class receberTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        print("Primeiro valor : ");
        var valor1 = Integer.parseInt(scan.nextLine());
        print("Segundo valor : ");
        var valor2 = Integer.parseInt(scan.nextLine());
        print("Terceiro valor : ");
        int valor3 = Integer.parseInt(scan.nextLine());
        print("Quarto valor : ");
        var valor4 = Integer.parseInt(scan.nextLine());

        int[] vetor = { valor1, valor2, valor3, valor4 };

    }

    public static void print(String write) {
        System.out.println(write);
    }

}