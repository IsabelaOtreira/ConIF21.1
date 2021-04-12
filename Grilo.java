	import java.util.Random;
public class Grilo {
    public Grilo(String Nome) {
        this.nome = Nome;
    }

    String nome;
    int cms;
    Random rand = new Random();
    int atposicao = 0;
    int pulinhos = 0;
    boolean acabou = false;

    public void Jump() {
        cms = rand.nextInt(40);
        atposicao += cms;
        pulinhos += 1;
        System.out.println("O " + nome + " pulou " + cms + "cm e já percorreu : " + atposicao + "cm");
    }
}

