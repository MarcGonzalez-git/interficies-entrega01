package dpvi.entrega01.dto;

/**
 *
 * @author Alumne
 */
public class Plataforma {
    
    private String nom;
    private int unitats;

    public Plataforma(String nom, int unitats) {
        this.nom = nom;
        this.unitats = unitats;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getUnitats() {
        return unitats;
    }

    public void setUnitats(int unitats) {
        this.unitats = unitats;
    }
    
}
