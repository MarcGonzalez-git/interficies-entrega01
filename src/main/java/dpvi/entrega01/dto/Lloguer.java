package dpvi.entrega01.dto;

import java.util.Date;

/**
 *
 * @author Alumne
 */
public class Lloguer {
    
    private int numRegistre;
    private Usuari usuari;
    private Joc joc;
    private Date dataInici;
    private Date dataTornada;
    private Plataforma plataforma;

    public Lloguer(int numRegistre, Usuari usuari, Joc joc, Date dataInici, Date dataTornada, Plataforma plataforma) {
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

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataTornada() {
        return dataTornada;
    }

    public void setDataTornada(Date dataTornada) {
        this.dataTornada = dataTornada;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }
    
}
