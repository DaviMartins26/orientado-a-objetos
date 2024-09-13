public class Pessoa {
    protected String email;
    protected int telefone;
    protected String nome;
    protected String dataNasci;
    protected String senha;

    public Pessoa(String email,int telefone,String nome,String dataNasci,String senha){
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.dataNasci = dataNasci;
        this.senha =senha;
    };

    public String getNome(){
        return nome;
    }
}
