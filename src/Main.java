import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Fantasma> fantasmas = new ArrayList<Fantasma>();

        fantasmas.add(new Wraith("Wraith",1.7f,1.5f,50,"cozinha"));
        fantasmas.add(new Banshee("Banshee",1.7f,1.5f,50,"Banheiro",1));
        fantasmas.add(new Deogen("Deogen",4.0f,1.2f,40,"Porão",2));

        for (Fantasma m: fantasmas) {
            m.habilidadeEspecial();
            m.fazerAparicao();
            m.setVelocidade();
        }

    }
}