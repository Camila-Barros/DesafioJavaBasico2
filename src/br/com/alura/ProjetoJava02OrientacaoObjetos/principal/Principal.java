package br.com.alura.ProjetoJava02OrientacaoObjetos.principal;

import br.com.alura.ProjetoJava02OrientacaoObjetos.modelos.MinhasPreferidas;
import br.com.alura.ProjetoJava02OrientacaoObjetos.modelos.Musica;
import br.com.alura.ProjetoJava02OrientacaoObjetos.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("The Kill");
        minhaMusica.setArtista("Thirty Seconds To Mars");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Inglês Nu e Cru");
        meuPodcast.setApresentador("Bob");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);



    }
}