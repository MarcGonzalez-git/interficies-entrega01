package dpvi.entrega01.dto;

import java.time.LocalDate;

/**
 *
 * @author Alumne
 */
public class Lloguer {
    
    private int numRegistre;
    private Usuari usuari;
    private Joc joc;
    private LocalDate dataInici;
    private LocalDate dataTornada;
    private Plataforma plataforma;

    public Lloguer(int numRegistre, Usuari usuari, Joc joc, LocalDate dataInici, LocalDate dataTornada, Plataforma plataforma) {
        this.numRegistre = numRegistre;
        this.usuari = usuari;
        this.joc = joc;
        this.dataInici = dataInici;
        this.dataTornada = dataTornada;
        this.plataforma = plataforma;
    }

    public int getNumRegistre() {
        return numRegistre;
    }

    public void setNumRegistre(int numRegistre) {
        this.numRegistre = numRegistre;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    public Joc getJoc() {
        return joc;
    }

    public void setJoc(Joc joc) {
        this.joc = joc;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public LocalDate getDataTornada() {
        return dataTornada;
    }

    public void setDataTornada(LocalDate dataTornada) {
        this.dataTornada = dataTornada;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
    
}
