import java.util.Scanner;

public class IMC {
    public static void main(String[] args){
        
      String h;
      char[] sexo = {'M','F'};

      Scanner scan = new Scanner(System.in);
      System.out.println("Diga-me altura");
      h = scan.nextLine();
      System.out.println("[F]eminino | [M]asculino");
      String escolhaGen = scan.nextLine();
      char gender = escolhaGen.charAt(0);
     
        if(gender == sexo[0]){
            Double altura = Double.valueOf(h); 
            var resultado = 72.7 * altura - 58;
            System.out.println(resultado);
        }
        if(gender == sexo[1]){
            Double altura = Double.valueOf(h);
            var resultado = 62.1 * altura - 44.7;
            System.out.println(resultado);
        }
    }
}