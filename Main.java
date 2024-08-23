import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null; // Variável para armazenar a instância de Pessoa
        Banco banco = null; // esta pra armazenar a instância de Banco

        while (true) {
            System.out.println("Bem vindo ao Sistema, escolha uma opção:");
            System.out.println("1 - Cadastrar novo Cliente");
            System.out.println("2 - Depositar na conta");
            System.out.println("3 - Sacar da conta");
            System.out.println("4 - Ver Extrato");
            System.out.println("5 - Alterar informacao");
            System.out.println("6 - Sair");

            int escolha = sc.nextInt();
            sc.nextLine(); // Limpa o buffer após a leitura do int pq tava dando problema

            switch (escolha) {
                case 1:
                    System.out.println("Novo Cadastro:");
                    System.out.print("Nome: ");
                    String novoNome = sc.nextLine(); // nextline pra não quebrar o codigo quando tiver espaço no Nome

                    System.out.print("CPF: ");
                    int novoCPF = sc.nextInt();
                    sc.nextLine(); // Limpar buffer

                    System.out.print("Data de Nascimento: ");
                    String novaDataNasci = sc.nextLine();

                    System.out.print("Renda Mensal: ");
                    float novaRenda = sc.nextFloat();
                    sc.nextLine(); // Limpar buffer

                    System.out.print("Telefone: ");
                    int novoTelefone = sc.nextInt();
                    sc.nextLine(); // Limpar buffer
                    // registra a pessoa
                    pessoa = new Pessoa(novoNome, novoCPF, novaDataNasci, novaRenda, novoTelefone);

                    System.out.print("Número da Conta: ");
                    int novaConta = sc.nextInt();
                    sc.nextLine(); // Limpar buffer

                    System.out.print("Saldo Inicial: ");
                    float novoSaldo = sc.nextFloat();
                    sc.nextLine(); // Limpar buffer
                    //registra a conta no Banco
                    banco = new Banco(novaConta, novoSaldo);
                    System.out.println("Cadastro concluído com Sucesso");
                    break;

                case 2:
                    if (banco != null) {  // tratamento pra evitar erros fazer isso em todos
                        System.out.println("Depositar na conta:");
                        System.out.print("Informe o valor do depósito: ");
                        float valorDeposito = sc.nextFloat();
                        sc.nextLine(); // Limpa o bufer
                        // se isso funcionar significa que eu n sei programar
                        float novoSaldo1 = banco.getSaldo() + valorDeposito;
                        banco.setSaldo(novoSaldo1);
                        System.out.println("Depósito realizado com sucesso! Novo saldo: " + banco.getSaldo());
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;

                case 3:
                    if (banco != null) { // tratamento
                        System.out.println("Sacar da conta:");
                        System.out.print("Informe o valor do saque: ");
                        float valorSaque = sc.nextFloat();
                        sc.nextLine(); // Limpa o buffet (to com fome)
                        // se o de cima funcionou por algum milagre esse deve funcionar
                        float novoSaldo2 = banco.getSaldo() - valorSaque;
                        banco.setSaldo(novoSaldo2);
                        System.out.println("Saque realizado com sucesso! Novo saldo: " + banco.getSaldo());
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;

                case 4: // tratamento psicilogico necessario
                    if (pessoa != null && banco != null) {
                        System.out.println("Ver Extrato:");
                        pessoa.extratoPessoa();
                        banco.extratoCliente();
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;
                    // por incrivel que pareça acertei isso o extrato de primeira
                case 5:
                    if (pessoa != null) {
                        System.out.println("1 - Alterar Telefone:");
                        System.out.println("2 - Alterar Renda:");
                        int escolha2 = sc.nextInt();
                        sc.nextLine(); // o buffer

                        switch (escolha2) {
                            case 1:
                                System.out.print("Informe novo Telefone: ");
                                int novoTelefone2 = sc.nextInt();
                                sc.nextLine();

                                pessoa.setTelefone(novoTelefone2);
                                System.out.println("Telefone alterado para: " + pessoa.getTelefone());
                                break;
                            case 2:
                                System.out.print("Informe nova Renda: ");
                                float novaRenda2 = sc.nextFloat();
                                sc.nextLine();

                                pessoa.setRenda(novaRenda2);
                                System.out.println("Renda alterada para: " + pessoa.getRenda()); // nunca vou entender pq o renda tem que ser com R maiusculo
                                break;
                            default:
                                System.out.println("Opção inválida, por favor escolha uma opção válida.");
                        }
                    } else {
                        System.out.println("Nenhum cliente cadastrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo do sistema...");
                    System.exit(0); // na teoria isso vai tira ro while eterno

                default:
                    System.out.println("Opção inválida, por favor escolha uma opção válida.");
                    break;
            }
        }
    }
}
