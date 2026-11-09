package dpvi.entrega01.dto;

import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class Joc {
    
    private String nom;
    private String genere;
    private ArrayList<Plataforma> plataformes;

    public Joc(String nom, String genere, ArrayList<Plataforma> plataformes) {
        this.nom = nom;
        this.genere = genere;
        this.plataformes = plataformes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public ArrayList<Plataforma> getPlataformes() {
        return plataformes;
    }

    public void afegirPlataforma(Plataforma plataforma) {
        plataformes.add(plataforma);
    }

    public boolean tePlataforma(String nomPlataforma) {
        for (Plataforma plataforma : plataformes) {
            if (plataforma.getNom().equals(nomPlataforma)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nom;
    }
    
}
