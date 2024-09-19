public class Deogen extends Fantasma{
    private String salaPreferida;
    private int jogadorProximo;

    public Deogen(String nome,float velocidade,float intervaloPiscada, int sanidadeAtaque,String salaPreferida,int jogadorProximo) {
        super(nome, velocidade, intervaloPiscada, sanidadeAtaque);
        this.salaPreferida = salaPreferida;
        this.jogadorProximo = jogadorProximo;
    }

    public void habilidadeEspecial() {
        System.out.printf(nome + " esta correndo em direção ao jogador mais proximo");
    }
    public float setVelocidade(){
        System.out.println(nome +" esta devagar por que está proximo ao jogador");
        float velocidade = 0.2f;
        return velocidade;
    }
}
