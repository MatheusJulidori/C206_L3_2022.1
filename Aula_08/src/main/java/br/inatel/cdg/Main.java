package br.inatel.cdg;

import br.inatel.cdg.carros.Carro;
import br.inatel.cdg.carros.Hatch;
import br.inatel.cdg.carros.SUV;
import br.inatel.cdg.carros.Sedan;

public class Main {

    public static void main(String[] args) {
        Carro c1 = new Sedan();
        Carro c2 = new SUV();
        Carro c3 = new Hatch();
        Carro[] carros = new Carro[3];

        c1.setAno(2020);
        c1.setCor("Preto");
        c1.setValor(65000);

        c2.setValor(80000);
        c2.setCor("Preto");
        c2.setAno(2022);

        c3.setCor("Vermelho");
        c3.setValor(60000);
        c3.setAno(2021);

        carros[0] = c1;
        carros[1] = c2;
        carros[2] = c3;

        for(Carro carro : carros){
            if(carro instanceof SUV){
                SUV s = (SUV)carro;
                s.setTracao("4x4");
                s.mostraInfo();
            }else if(carro instanceof Sedan){
                Sedan s = (Sedan)carro;
                s.setPortaMalas(450);
                s.mostraInfo();
            }else{
                Hatch h = (Hatch)carro;
                h.setPortas(2);
                h.mostraInfo();
            }
        }


    }

}
