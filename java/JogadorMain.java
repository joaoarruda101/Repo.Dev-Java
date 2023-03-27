public class JogadorMain {
public static void main(String[] args){

        Jogador jogador = new Jogador(null, null, null, null, null);
        jogador.setNome("João");
        String nomeDoJogador = jogador.getNome();
        System.out.println(nomeDoJogador);
        
    }
}
