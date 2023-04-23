package Projects.ordenandoVetor;

public class Ordenacao {
    public static void main(String[] args) {
        double[] ordenacao = { 12, 9, 3, 40, 240 };

        for (int i = 0; i < ordenacao.length; i++) {
            if (ordenacao[i] > ordenacao[i - 1]) {
                System.out.println(ordenacao[i]);
            }
        }
    }
}
