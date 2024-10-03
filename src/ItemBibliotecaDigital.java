public abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;
    protected String assunto;
    protected float tamanhaGb;

    public ItemBibliotecaDigital(String titulo,String autor,String assunto,float tamanhaGb){
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.tamanhaGb = tamanhaGb;
    }

    protected abstract void descricao();
}
