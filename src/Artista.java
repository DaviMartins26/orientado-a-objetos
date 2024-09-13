import java.util.ArrayList;

public class Artista extends Pessoa {
    private String nomeArt;
    private int numeroViews = 0;
    private int numeroMusicas = 0;
    private ArrayList<Musica> musicas;

    public Artista(String email, int telefone, String nome, String dataNasci, String senha, String nomeArt) {
        super(email, telefone, nome, dataNasci, senha);
        this.nomeArt = nomeArt;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        numeroMusicas++;
    }

    public String getNomeArt() {
        return nomeArt;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }
}

