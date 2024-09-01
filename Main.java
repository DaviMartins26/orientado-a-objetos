import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int escolha;

        // Listas para armazenar disciplinas, alunos e professores
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        System.out.println("Bem vindo");
        System.out.println("Escolha o que deseja ver sobre");

        while (true) {
            System.out.println("1- Disciplina");
            System.out.println("2- Aluno");
            System.out.println("3- Professor");
            System.out.println("4- Sair");
            System.out.println("Digite sua escolha:");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("1- Cadastrar Disciplina");
                    System.out.println("2- Ver Disciplinas");
                    System.out.println("3- Adicionar pessoa a Disciplina");
                    System.out.println("4- Buscar Disciplina por Nome");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.println("Cadastrando Disciplina...");
                            System.out.println("Informe o codigo");
                            int codigo = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Informe a materia");
                            String materia = sc.nextLine();
                            System.out.println("Nome da Turma:");
                            String turma = sc.nextLine();

                            Disciplina disciplina = new Disciplina(codigo, materia, turma); // criando disciplina, talvez tinha que see em arrayList
                            disciplinas.add(disciplina);
                            break;

                        case 2:
                            System.out.println("Disciplinas:"); // é pra printar corretamnete
                            for (Disciplina d : disciplinas) {
                                System.out.println(d);
                            }
                            break;

                        case 3:
                            System.out.println("Adicionar o que?");
                            System.out.println("1- Aluno");
                            System.out.println("2- Professor");
                            System.out.println("3- Voltar");
                            int escolha2 = sc.nextInt();
                            sc.nextLine();

                            switch (escolha2) {
                                case 1:
                                    System.out.println("Informe a matrícula do aluno");
                                    int matri = sc.nextInt();
                                    sc.nextLine();
                                    Aluno aluno = buscarAlunoPorMatricula(alunos, matri); // metodo grande
                                    if (aluno != null) { // se n for nulo, ta correto isso?
                                        System.out.println("Informe o código da Disciplina para adicionar o aluno");
                                        int disci = sc.nextInt();
                                        sc.nextLine();
                                        Disciplina addAluno = desobrirDisciplina(disciplinas, disci);
                                        if (addAluno != null) {
                                            addAluno.adicionarAluno(aluno);
                                            System.out.println("Aluno adicionado à disciplina.");
                                        } else {
                                            System.out.println("Disciplina não encontrada.");
                                        }
                                    } else {
                                        System.out.println("Aluno não encontrado.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Informe o registro do professor");
                                    int regis = sc.nextInt();
                                    sc.nextLine();
                                    Professor professor = buscarProfessorPorRegistro(professores, regis); // não aguento mais escrever
                                    if (professor != null) {
                                        System.out.println("Informe o código da Disciplina para adicionar o professor");
                                        int disci2 = sc.nextInt();
                                        sc.nextLine();
                                        Disciplina addProf = desobrirDisciplina(disciplinas, disci2);
                                        if (addProf != null) {
                                            addProf.setProfessor(professor);
                                            System.out.println("Professor adicionado à disciplina.");
                                        } else {
                                            System.out.println("Disciplina não encontrada.");
                                        }
                                    } else {
                                        System.out.println("Professor não encontrado.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Voltando");
                                    break;
                                default:
                                    System.out.println("Opção Inválida! Digite uma opção válida.");
                            }
                            break;

                        case 4:
                            System.out.println("Informe o nome da disciplina para buscar:");
                            String nomeDisciplina = sc.nextLine();
                            Disciplina disciplinaBuscada = buscarDisciplinaPorNome(disciplinas, nomeDisciplina); // como que isso aqui ta funcionando, Deus é mais
                            if (disciplinaBuscada != null) {
                                System.out.println(disciplinaBuscada);
                            } else {
                                System.out.println("Disciplina não encontrada.");
                            }
                            break;

                        default:
                            System.out.println("Opção Inválida! Digite uma opção válida.");
                    }
                    break;

                case 2:
                    System.out.println("1- Cadastrar Aluno");
                    System.out.println("2- Editar Informações");
                    System.out.println("3- Ver Alunos matriculados");
                    System.out.println("4- Buscar Aluno por Nome");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.println("Cadastrando Aluno...");
                            System.out.println("Informe o número da Matrícula");
                            int matricula = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nome do Aluno:");
                            String nome = sc.nextLine();
                            Aluno novoAluno = new Aluno(matricula, nome);
                            alunos.add(novoAluno);
                            break;

                        case 2:
                            System.out.println("Informe a matrícula do aluno para editar:");
                            int matriculaEdicao = sc.nextInt();
                            sc.nextLine();
                            Aluno alunoEditar = buscarAlunoPorMatricula(alunos, matriculaEdicao);
                            if (alunoEditar != null) {
                                System.out.println("Nome atual: " + alunoEditar.getNome());
                                System.out.println("Digite o novo nome:");
                                String novoNome = sc.nextLine();
                                alunoEditar.setNome(novoNome);
                                System.out.println("Informações do aluno atualizadas.");
                            } else {
                                System.out.println("Aluno não encontrado.");
                            }
                            break;

                        case 3:
                            System.out.println("Alunos cadastrados:");
                            for (Aluno a : alunos) {
                                System.out.println("Matrícula: " + a.getMatricula() + ", Nome: " + a.getNome());
                            }
                            break;

                        case 4:
                            // aqui eu ja desisti por completo
                            System.out.println("Informe o nome do aluno para buscar:");
                            String nomeAluno = sc.nextLine();
                            Aluno alunoBuscado = buscarAlunoPorNome(alunos, nomeAluno);
                            if (alunoBuscado != null) {
                                System.out.println("Matrícula: " + alunoBuscado.getMatricula() + ", Nome: " + alunoBuscado.getNome());
                            } else {
                                System.out.println("Aluno não encontrado.");
                            }
                            break;

                        default:
                            System.out.println("Opção Inválida! Digite uma opção válida.");
                    }
                    break;

                case 3:
                    System.out.println("1- Cadastrar Professor");
                    System.out.println("2- Editar Informações");
                    System.out.println("3- Ver Professores");
                    escolha = sc.nextInt();
                    sc.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.println("Cadastrando Professor...");
                            System.out.println("Informe o número do Registro");
                            int registro = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nome do Professor:");
                            String nomeProf = sc.nextLine();
                            Professor novoProfessor = new Professor(registro, nomeProf);
                            professores.add(novoProfessor);
                            break;

                        case 2:
                            System.out.println("Informe o registro do professor para editar:");
                            int registroEdicao = sc.nextInt();
                            sc.nextLine();
                            Professor professorEditar = buscarProfessorPorRegistro(professores, registroEdicao);
                            if (professorEditar != null) {
                                System.out.println("Nome atual: " + professorEditar.getNome());
                                System.out.println("Digite o novo nome:");
                                String novoNome = sc.nextLine();
                                professorEditar.setNome(novoNome);
                                System.out.println("Informações do professor atualizadas.");
                            } else {
                                System.out.println("Professor não encontrado.");
                            }
                            break;

                        case 3:
                            System.out.println("Professores cadastrados:");
                            for (Professor p : professores) {
                                System.out.println("Registro: " + p.getRegistro() + ", Nome: " + p.getNome());
                            }
                            break;

                        default:
                            System.out.println("Opção Inválida! Digite uma opção válida.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção Inválida! Digite uma opção válida.");
            }
        }
    }

    // Método para encontrar uma disciplina por código
    // acho que o nome destes metodos tão grandes, e não sei se  usar Static ta correto, talvez deveria fazer isso na classe
    private static Disciplina desobrirDisciplina(ArrayList<Disciplina> disciplinas, int codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo() == codigo) {
                return d;
            }
        }
        return null;
    }

    // Método para encontrar uma disciplina por nome
    private static Disciplina buscarDisciplinaPorNome(ArrayList<Disciplina> disciplinas, String nome) {
        for (Disciplina d : disciplinas) {
            if (d.getMateria().equalsIgnoreCase(nome)) {
                return d;
            }
        }
        return null;
    }

    // Método para buscar um aluno por matrícula
    private static Aluno buscarAlunoPorMatricula(ArrayList<Aluno> alunos, int matricula) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }

    // Método para buscar um aluno por nome
    private static Aluno buscarAlunoPorNome(ArrayList<Aluno> alunos, String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    // Método para buscar um professor por registro
    private static Professor buscarProfessorPorRegistro(ArrayList<Professor> professores, int registro) {
        for (Professor p : professores) {
            if (p.getRegistro() == registro) {
                return p;
            }
        }
        return null;
    }
}
