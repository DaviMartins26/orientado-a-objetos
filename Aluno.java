public class Aluno {
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) { // Set n faz sendido pra mim
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula;
    }
}
