package Projects.Calculadora;

public class Calculadora {
    private String somar;
    private String dividir;
    private String multiplicar;
    private String subtrair;


    public Calculadora(String somar, String dividir, String multiplicar, String subtrair) {
        this.somar = somar;
        this.dividir = dividir;
        this.multiplicar = multiplicar;
        this.subtrair = subtrair;
    }


    public String getSomar() {
        return somar;
    }


    public void setSomar(String somar) {
        this.somar = somar;
    }


    public String getDividir() {
        return dividir;
    }


    public void setDividir(String dividir) {
        this.dividir = dividir;
    }


    public String getMultiplicar() {
        return multiplicar;
    }


    public void setMultiplicar(String multiplicar) {
        this.multiplicar = multiplicar;
    }


    public String getSubtrair() {
        return subtrair;
    }


    public void setSubtrair(String subtrair) {
        this.subtrair = subtrair;
    }

}
