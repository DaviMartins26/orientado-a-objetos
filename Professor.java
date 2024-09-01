public class Professor {
    private int registro;
    private String nome;

    public Professor(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", Registro: " + registro;
    }
}
