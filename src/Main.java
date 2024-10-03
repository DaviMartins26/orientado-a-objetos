import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Ebook> ebooks = new ArrayList<Ebook>();
        ArrayList<VideoDigital> videos = new ArrayList<VideoDigital>();

        Ebook book1 = new Ebook("O Principe","Maquiavel","Politica",0.4f);
        Ebook book2 = new Ebook("Alimentos"," Loro José","Culinaria",50.5f);
        VideoDigital video1 = new VideoDigital("Tutorial Redstone","Vncs13","Minecraft",2.3f,10.4f);
        VideoDigital video2 = new VideoDigital("Tutorial Java","Tinhoso","Programacao",666f,777f);
        // possue o jeito compacto de fazer isso, porem isso esta sendo feito para testes
        // jeito compacto é ebooks.add(new .....)
        ebooks.add(book1);
        ebooks.add(book2);
        videos.add(video1);
        videos.add(video2);

        while (true) {
            System.out.println("Oque deseja");
            System.out.println("1-Ver Itens");
            System.out.println("2-Ver Descrição");
            System.out.println("3-Visualizar");
            System.out.println("4-Baixar");

            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:
                    for(VideoDigital v: videos){

                    }

            }
        }
    }
}