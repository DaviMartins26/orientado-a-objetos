import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ouvinte ouvinte = new Ouvinte("davi@outlook.com", 984609554, "Davi", "08/08/2001", "senha");
        Artista artista = new Artista("jurson@gmail.com", 989898989, "Jurandir Adilson", "29/04/1999", "senha", "Banda do Rock");
        // tentando aprender arrayList, muito provavelmente ta errado
        Musica musica1 = new Musica(3.6f,"Rock","17/05/2017","Rock pesado Cristão",artista);
        Musica musica2 = new Musica(22.6f,"Pagode","Ontem","Sofrendo por Amor",artista);
        // Adicionando músicas ao artista de um modo errado eu acho, mas n sei fazer certo
        artista.adicionarMusica(musica1);
        artista.adicionarMusica(musica2);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Oque deseja fazer?");
            System.out.println("1-Entrar como Ouvinte");
            System.out.println("2-Entrar como Artista?");
            System.out.println("3-Sair");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Logado como "+ ouvinte.getNome());
                    System.out.println("1-Ouvir Musica");
                    System.out.println("2-Tornarse Premium");
                    System.out.println("3- Cadastrar Cartão");
                    System.out.println("4-Voltar");
                    int escolha2 = sc.nextInt();
                    switch (escolha2) {
                        case 1:
                            // Não deveria ser feito assim, mas acho que da certo
                            System.out.println("Artista: " + artista.getNomeArt());
                            for (Musica musica : artista.getMusicas()) {
                                System.out.println("Ouvindo" + musica.getNomeMusic()+" do Artista: "+ artista.getNomeart());
                                System.out.println("Ouvindo musica... Enter para Proxima");
                                sc.nextLine(); // por algum motivo so funciona para parar no segundo print
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
                            System.out.println("Escolha Invalida");
                    }
                // por algum motivo esta entrando no case 2 mesmo escolhendo 1
                case 2:
                    System.out.println("Logado como "+ artista.getNomeArt());
                    System.out.println("1-Adicionar musica");
                    System.out.println("2-Ver minhas Musicas");
                    System.out.println("3-Sair");
                    int escolha3 = sc.nextInt();
                    switch (escolha3) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Cadastrando Musica...");
                            System.out.println("Informe o nome");
                            String nome = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Informe o Estilo");
                            String estilo = sc.nextLine();
                            sc.nextLine();
                            System.out.println("informe a Data de Lançamento");
                            String dataLancamento = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Informe o tempo de duração da musica");
                            float tempo = sc.nextFloat();
                            sc.nextLine();
                            // inverti umas ordens mas ta resolvivo, eu acho
                            // cadastrar assim ta errado pq toda vez que vc cadastrar uma musica vai ou da erro, ou vou coisar por cima da musica3
                            Musica musica3 = new Musica(tempo,estilo,dataLancamento,nome,artista);

                        case 2:
                            System.out.println("Artista: " + artista.getNomeArt());
                            for (Musica musica : artista.getMusicas()) {
                                System.out.println(musica.getNomeMusic() +"Duração de "+musica.getTempo()+" mim. Estilo :" + musica.getEstilo());
                            }
                            break; // não era pro codio parar auqi mas ta parando as vezes

                        case 3:
                            break;
                        default:
                            System.out.println("Escolha Invalida");
                    }
                case 3:
                    return;
                default:
                    System.out.println("Escolha Invalida");
            }


        }
    }
}