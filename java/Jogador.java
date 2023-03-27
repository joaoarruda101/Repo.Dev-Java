public class Jogador {
    String posicao;
    String nome;
    String numero;
    String contrato;
    String nacionalidasde;

    public Jogador(String posicao, String nome, String numero, String contrato, String nacionalidasde) {
        this.posicao = posicao;
        this.nome = nome;
        this.numero = numero;
        this.contrato = contrato;
        this.nacionalidasde = nacionalidasde;
    }
    
    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getNacionalidasde() {
        return nacionalidasde;
    }

    public void setNacionalidasde(String nacionalidasde) {
        this.nacionalidasde = nacionalidasde;
    }

    
}





