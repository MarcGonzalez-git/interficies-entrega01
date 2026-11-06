package dpvi.entrega01.dto;

import java.util.ArrayList;

/**
 *
 * @author Alumne
 */
public class Joc {
    
    private String nom;
    private String genere;
    private ArrayList<Plataforma> plataforma;

    public Joc(String nom, String genere, ArrayList<Plataforma> plataforma) {
        this.nom = nom;
        this.genere = genere;
        this.plataforma = plataforma;
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

    public ArrayList<Plataforma> getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(ArrayList<Plataforma> plataforma) {
        this.plataforma = plataforma;
    }
    
}
