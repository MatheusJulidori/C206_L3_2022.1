public class Main {

    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.dono = "Matheus";

        Carta c1 = new Carta();
        c1.nome = "Mago Negro";
        c1.poder = 12;
        c1.classificacao = "Soldado";

        Carta c2 = new Carta();
        c2.nome = "Legolas";
        c2.poder = 10;
        c2.classificacao = "Arqueiro";

        Carta c3 = new Carta();
        c3.nome = "Gimli";
        c3.poder = 15;
        c3.classificacao = "Pesado";

        Carta c4 = new Carta();
        c4.nome = "Aragorn";
        c4.poder = 21;
        c4.classificacao = "Soldado";

        d1.adicionarCarta(c1);
        d1.adicionarCarta(c2);
        d1.adicionarCarta(c3);
        d1.adicionarCarta(c4);

        d1.mostraInfo();

        d1.calcularPoderMedio();

        d1.calcularClassificacao();

    }

}
