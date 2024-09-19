public class Banshee extends Fantasma{
    private String salaPreferida;
    private int jogadorAlvo;

    public Banshee(String nome,float velocidade,float intervaloPiscada, int sanidadeAtaque,String salaPreferida,int jogadorAlvo){
        super(nome,velocidade,intervaloPiscada,sanidadeAtaque);
        this.salaPreferida = salaPreferida;
        this.jogadorAlvo = jogadorAlvo;
    }

    public void habilidadeEspecial() {
        System.out.println(nome + " esta seguindo o jogador alvo");
    }
    public void gritar(){
        System.out.println(nome +"Gritou no Microfone");
    }
}


