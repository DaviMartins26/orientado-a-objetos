import java.util.ArrayList;

public class Disciplina {
    private int codigo;
    private String materia;
    private String turma;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Disciplina(int codigo, String materia, String turma) {
        this.codigo = codigo;
        this.materia = materia;
        this.turma = turma;
        this.alunos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override // \n pula linha
    public String toString() {
        String info = "Disciplina: " + materia + ", Código: " + codigo + ", Turma: " + turma;
        info += "\nProfessor: " + (professor != null ? professor.getNome() : "Nenhum professor atribuído"); // esse ? deveria ser or || mas n sei se vai da certo
        for (Aluno a : alunos) {
            info += a.getNome() + " (Matrícula: " + a.getMatricula() + ")\n";
        }
        return info;
    }
}
