import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ouvinte ouvinte = new Ouvinte("davi@outlook.com", 984609554, "Davi", "08/08/2001", "senha");
        Artista artista = new Artista("jurson@gmail.com", 989898989, "Jurandir Adilson", "29/04/1999", "senha", "Banda do Rock");

        // Adicionando músicas ao artista
        Musica musica1 = new Musica(3.6f, "Rock", "17/05/2017", "Rock pesado Cristão", artista);
        Musica musica2 = new Musica(22.6f, "Pagode", "Ontem", "Sofrendo por Amor", artista);
        artista.adicionarMusica(musica1);
        artista.adicionarMusica(musica2);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1-Entrar como Ouvinte");
            System.out.println("2-Entrar como Artista");
            System.out.println("3-Sair");

            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.println("Logado como " + ouvinte.getNome());
                System.out.println("1-Ouvir Música");
                System.out.println("2-Tornar-se Premium");
                System.out.println("3-Cadastrar Cartão");
                System.out.println("4-Voltar");
                int escolha2 = sc.nextInt();
                sc.nextLine();

                switch (escolha2) {
                    case 1:
                        System.out.println("Artista: " + artista.getNomeArt());
                        for (Musica musica : artista.getMusicas()) {
                            System.out.println("Ouvindo " + musica.getNomeMusic() + " do Artista: " + artista.getNomeArt());
                            System.out.println("Ouvindo música... Pressione Enter para próxima");
                            sc.nextLine(); // Pausa para a próxima música
                        }
                        break;
                    case 2:
                        ouvinte.tornarPremium();
                        break;
                    case 3:
                        ouvinte.adcCartao();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Escolha Inválida");
                        break;
                }
            } else if (escolha == 2) {
                System.out.println("Logado como " + artista.getNomeArt());
                System.out.println("1-Adicionar Música");
                System.out.println("2-Ver Minhas Músicas");
                System.out.println("3-Sair");

                int escolha3 = sc.nextInt();
                sc.nextLine();

                switch (escolha3) {
                    case 1:
                        System.out.println("Cadastrando Música...");
                        System.out.println("Informe o nome");
                        String nome = sc.nextLine();
                        System.out.println("Informe o Estilo");
                        String estilo = sc.nextLine();
                        System.out.println("Informe a Data de Lançamento");
                        String dataLancamento = sc.nextLine();
                        System.out.println("Informe o tempo de duração da música");
                        float tempo = sc.nextFloat();
                        sc.nextLine();

                        Musica musica3 = new Musica(tempo, estilo, dataLancamento, nome, artista);
                        artista.adicionarMusica(musica3);
                        break;

                    case 2:
                        System.out.println("Artista: " + artista.getNomeArt());
                        for (Musica musica : artista.getMusicas()) {
                            System.out.println(musica.getNomeMusic() + " - Duração de " + musica.getTempo() + " min. Estilo: " + musica.getEstilo());
                        }
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Escolha Inválida");
                        break;
                }
            } else {
                System.out.println("Escolha Inválida");
                break;
            }
        }
    }
}
