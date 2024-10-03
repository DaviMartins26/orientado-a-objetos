public class VideoDigital extends ItemBibliotecaDigital implements Visualizavel, Baixavel{
    private float tempo;

    public VideoDigital(String titulo,String autor,String assunto,float tamanhaGb,float tempo){
        super(titulo,autor,assunto,tamanhaGb);
        this.tempo = tempo;
    }

    @Override
    public void visualizar() {
        float tempV = 0f;
        for (; tempV <= tempo; tempV += 0.5f) {  // pq precisa daquele ; ?
            System.out.println("Minutos assistido: " + tempV);
        }
        System.out.println("Video "+titulo+" Finalizado");
    }

    @Override
    public void baixar() {
        System.out.println("Inicando download...");
        float totalBaixada = 0f;
        for (; totalBaixada <= tamanhaGb; totalBaixada += 0.3f) {  // pq precisa daquele ; ?
            System.out.println("Baixando total de: " + totalBaixada+"de "+ tamanhaGb);
        }
        System.out.println("Video "+titulo+" Baixado com Sucesso");
    }

    protected void descricao(){
        System.out.println("Video "+titulo+" do autor "+autor+" de duracção de "+tempo +" minutos sobre: "+assunto);
    }
}
