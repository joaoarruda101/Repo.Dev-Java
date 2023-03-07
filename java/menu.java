import java.util.Scanner;

import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
        if(nota >= 70){
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if(nota < 30){
            JOptionPane.showInputDialog(nota, "testando o valor");
        } 
    }

    public static void write(String println){
        System.out.println(println);
    }
}
