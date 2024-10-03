public class Ebook extends ItemBibliotecaDigital implements Baixavel{

    public Ebook(String titulo,String autor,String assunto,float tamanhaGb){
        super(titulo,autor,assunto,tamanhaGb);
    }

    protected void descricao(){
        System.out.println("Livro "+titulo+" do autor "+autor+" sobre: "+assunto);
    }

    public void baixar() {
        System.out.println("Inicando download...");
        float totalBaixada = 0f;
        for (; totalBaixada <= tamanhaGb; totalBaixada += 0.3f) {  // pq precisa daquele ; ?
            System.out.println("Baixando total de: " + totalBaixada+"de "+ tamanhaGb);
        }
        System.out.println("Ebook "+titulo+" Baixado com Sucesso");
    }
}
