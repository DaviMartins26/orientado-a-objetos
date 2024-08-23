public class Pessoa {
    private String nome;
    private int cpf;
    private String dataNasci;
    private float renda;
    private int telefone;

    public Pessoa(String nome, int cpf, String dataNasci, float renda, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasci = dataNasci;
        this.renda = renda;
        this.telefone = telefone;
    }
    // unica coisa que fiz correto de primeira
    public void extratoPessoa() {
        System.out.println("Nome = " + nome);
        System.out.println("CPF = " + cpf);
        System.out.println("Nascimento = " + dataNasci);
        System.out.println("Telefone = " + telefone);
        System.out.println("Renda Mensal = " + renda);
    }

    // pq eu tive q fazer esse tipo de coisa pra funcionar oque tava na minha cabeça eu n sei
    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
