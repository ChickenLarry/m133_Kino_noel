package ch.bzz.m133_kino_noel;

import ch.bzz.m133_kino_noel.model.Film;
import ch.bzz.m133_kino_noel.model.Kino;
import ch.bzz.m133_kino_noel.model.Saal;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;

public class createJSON {


    public static void main(String[] args) {


        Film[] filme = {
                new Film("film1", 1, 1,"Harry","Potter"),
                new Film("film1", 1, 1,"Harry","Potter")
        };

        Kino[] kinos = {
                new Kino( "Kino", "Zürich"),
                new Kino("Kino 2", "Basel")
        };

        Saal[] saele= {
                new Saal(1,150,10, 20),
                new Saal(1,120,10, 15)
        };

        ObjectMapper om = new ObjectMapper();
        try {
            om.writeValue(Paths.get("C:/github/M133_Kino/testing/film.json").toFile(), filme);
            om.writeValue(Paths.get("C:/github/M133_Kino/testing/kino.json").toFile(), kinos);
            om.writeValue(Paths.get("C:/github/M133_Kino/testing/saal.json").toFile(), saele);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
