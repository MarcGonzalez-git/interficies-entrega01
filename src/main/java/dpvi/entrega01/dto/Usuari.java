package dpvi.entrega01.dto;

import java.util.Date;

/**
 *
 * @author Alumne
 */
public class Usuari {
    
    private String nom;
    private String llinatge1;
    private String llintage2;
    private String dni;
    private String telefon;
    private Date data;

    public Usuari(String nom, String llinatge1, String llintage2, String dni, String telefon, Date data) {
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llintage2 = llintage2;
        this.dni = dni;
        this.telefon = telefon;
        this.data = data;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public void setLlinatge1(String llinatge1) {
        this.llinatge1 = llinatge1;
    }

    public String getLlintage2() {
        return llintage2;
    }

    public void setLlintage2(String llintage2) {
        this.llintage2 = llintage2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
