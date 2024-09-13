public class Musica {
    private float tempo;
    private String estilo;
    private String dataLancamento;
    private String nomeMusic;
    private Artista artista;

    public Musica(float tempo, String estilo,String dataLancamento,String nomeMusic,Artista artista){
        this.tempo = tempo;
        this.estilo = estilo;
        this.dataLancamento = dataLancamento;
        this.nomeMusic = nomeMusic;
        this.artista = artista;
    }

}
