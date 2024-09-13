import java.util.Scanner;

public class Ouvinte extends Pessoa{
    private boolean premium = false;
    private Integer  numeroCartao;

    public Ouvinte(String email,int telefone,String nome,String dataNasci,String senha){
        super(email,telefone,nome,dataNasci,senha);
    }

    Scanner sc = new Scanner(System.in);

    public void tornarPremium(){
        if(premium){
            System.out.println(nome+"Você já é Premium");
        }
        else
            if (numeroCartao!=null) {
                this.premium = true;
                System.out.println("Foi cobrado 30 mil reais do seu cartão, mas agora vc n ouve anuncio :)");

            }
            else
                System.out.println("Voce precisa de um Cartão Registrado!");
    }

    public void adcCartao(){
        if(numeroCartao == null){
            System.out.println("Informe o numero de seu Cartão para Cadastro");
            numeroCartao = sc.nextInt();
            System.out.println("Verificando dados...");
            System.out.println("Cartão Registrado com Sucesso");
        }

    }


}
