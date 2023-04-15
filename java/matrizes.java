import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Coloque o número de Linha = x e Colunas = y da Matriz \n");

        String[] option;
        option = new String[3];
        menu(option);
        System.out.print("R:");
        var esc = read.nextLine();
        if(esc != "1"){
            insertParametersMatriz();
        }else{
            System.out.print("ERROR");
        }
        read.close();
    }

    public void _Matriz01(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menu(String[] option) {
        for (int i = 0; i < option.length; i++) {
            option[0] = "[" + i + "] - Sair \n";
            option[1] = "[" + i + "] - Adicionar paramêtro da matriz \n";
            System.out.print(option[(i)]);
        }
    }

    public static void insertParametersMatriz() {
        Scanner read = new Scanner(System.in);
        System.out.println("Coloque o número de Linha = x e Colunas = y da Matriz \n");

        String linhas; 
        String colunas;

        System.out.print("X:");
        linhas = read.nextLine();
        System.out.print("Y:");
        colunas = read.nextLine();

        int[][] matriz = new int[Integer.parseInt(linhas)][Integer.parseInt(colunas)];

        for (int i = 0; i < Integer.parseInt(linhas); i++) {
            for (int j = 0; j < Integer.parseInt(colunas); j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        read.close();
    }
/* */}
