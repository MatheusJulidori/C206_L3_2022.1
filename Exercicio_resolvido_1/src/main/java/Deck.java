public class Deck {

    String dono;
    Carta[] cartas;

    public Deck(){
        cartas = new Carta[15];
    }

    void adicionarCarta(Carta carta){
        boolean flag = true;
        for (int i = 0;i< cartas.length;i++){
            if(cartas[i] == null && flag) {
                cartas[i] = carta;
                flag = false;
                System.out.println("Carta adicionada");
            }
        }
        if(flag)
            System.out.println("Sem espaço no deck");
    }

    void mostraInfo(){
        System.out.println("Dono do deck: "+dono);
        for(Carta carta:cartas){
            if(carta != null){
                carta.mostraInfo();
            }
        }
    }

    void calcularPoderMedio(){
        int poder = 0;
        int totalCartas = 0;
        float media = 0;
        for(Carta carta:cartas){
            if(carta != null){
                poder += carta.poder;
                totalCartas++;
            }
        }
        System.out.println("Poder total: "+poder);
        media = (float)poder/totalCartas;
        System.out.println("Poder médio: "+media);
    }

    void calcularClassificacao(){
        int arqueiros =0;
        int pesados =0;
        int soldados =0;
        for(Carta carta:cartas){
            if(carta != null){
                if(carta.classificacao.equals("Soldado")){
                    soldados++;
                }else if(carta.classificacao.equals("Arqueiro")){
                    arqueiros++;
                }else{
                    pesados++;
                }
            }
        }
    }


}
