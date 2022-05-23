package ch.bzz.m133_kino_noel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

/**
 * @author noel
 * @version 1.0
 */
public class Film {

    /**
     * @see Film
     */
    @JsonIgnore
    private String filmUUID;
    private String titel;
    private int laenge;
    private int preis;
    private String hauptdarsteller;
    private String regisseur;


    public Film() {

    }

    /**
     * @param titel
     * @param laenge
     * @param preis
     * @param hauptdarsteller
     * @param regisseur
     */
    public Film(String titel, int laenge, int preis, String hauptdarsteller, String regisseur) {
        this.filmUUID = UUID.randomUUID().toString();
        this.titel = titel;
        this.laenge = laenge;
        this.preis = preis;
        this.hauptdarsteller = hauptdarsteller;
        this.regisseur = regisseur;
    }

    public String getFilmUUID() {
        return filmUUID;
    }

    public void setFilmUUID(String filmUUID) {
        this.filmUUID = filmUUID;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getHauptdarsteller() {
        return hauptdarsteller;
    }

    public void setHauptdarsteller(String hauptdarsteller) {
        this.hauptdarsteller = hauptdarsteller;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }
}
