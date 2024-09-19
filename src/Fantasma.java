import java.util.SortedMap;

public class Fantasma {
    protected String nome;
    protected float velocidade;
    protected float intervaloPiscada;
    protected int sanidadeAtaque;

    public Fantasma(){}

    public Fantasma(String nome,float velocidade,float intervaloPiscada, int sanidadeAtaque){
        this.nome =nome;
        this.velocidade = velocidade;
        this.intervaloPiscada = intervaloPiscada;
        this.sanidadeAtaque = sanidadeAtaque;
    }

    public void fazerAparicao(){
        System.out.println(nome +" fez uma aparição");
    }
    public void habilidadeEspecial(){
        System.out.println("Nenhuma Habilidade Especial");
    }
    // poderia criar a class jogador e fazer if se ele esta vendo, mas o exercicio é polimorfimo
    public float setVelocidade(){
        System.out.println(nome +"esta vendo o jogador");
        float velocidade =+ 0.1f;
        return velocidade;
    }
}
