public class Wraith extends Fantasma{
    private String salaPreferida;

    public Wraith(String nome,float velocidade,float intervaloPiscada, int sanidadeAtaque,String salaPreferida){
        super(nome,velocidade,intervaloPiscada,sanidadeAtaque);
        this.salaPreferida = salaPreferida;
    }

    public void habilidadeEspecial() {
        System.out.println(nome +" teleportou ao Jogador");
    }
    public void voar(){
        System.out.println(nome +" não pisou no sal por que Voa");
    }
}
