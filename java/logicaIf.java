import java.util.Scanner;

public class logicaIf {
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);

        write("Qual sua idade ? : ");
        var idade = read.nextLine();

        if(Integer.parseInt(idade) >= 18){
            write("Você já pode frequentar um buteco! \n");
        }else{
            write("Já trocou a fralda hoje ? \n");
        }
    }
    
    public static void write(String println) {
        System.out.print(println); 
    }
    
}
