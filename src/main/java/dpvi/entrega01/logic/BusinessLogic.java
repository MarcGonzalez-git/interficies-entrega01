package dpvi.entrega01.logic;

import dpvi.entrega01.dto.Joc;
import dpvi.entrega01.dto.Lloguer;
import dpvi.entrega01.dto.Plataforma;
import dpvi.entrega01.dto.Usuari;
import java.time.LocalDate;
import java.util.ArrayList;

public class BusinessLogic {
    
    public static ArrayList<Usuari> usuaris = new ArrayList<>();
    public static ArrayList<Joc> jocs = new ArrayList<>();
    public static ArrayList<Lloguer> lloguers = new ArrayList<>();
    
    public BusinessLogic() {
        usuaris = new ArrayList<>();
        jocs = new ArrayList<>();
        lloguers = new ArrayList<>();

        carregarDadesInicials();
    }
    
    public ArrayList<Usuari> getUsuaris() {
        return usuaris;
    }

    public ArrayList<Joc> getJocs() {
        return jocs;
    }

    public ArrayList<Lloguer> getLloguers() {
        return lloguers;
    }
    
    public void afegirUsuari(Usuari usuari) {
        usuaris.add(usuari);
    }
    
    public void afegirJoc(Joc joc) {
        jocs.add(joc);
    }
    
    public void registrarLloguer(Usuari usuari, Joc joc, Plataforma plataforma) {

        if (usuari == null || joc == null || plataforma == null) {
            throw new IllegalArgumentException("Has de seleccionar un usuari, un joc i una plataforma.");
        }

        if (!usuaris.contains(usuari) || !jocs.contains(joc) || !joc.getPlataformes().contains(plataforma)) {
            throw new IllegalArgumentException("Les dades seleccionades no són vàlides.");
        }

        if (plataforma.getUnitats() <= 0) {
            throw new IllegalArgumentException("No queden unitats disponibles d'aquesta plataforma.");
        }

        for (Lloguer lloguer : lloguers) {
            if (!lloguer.isRetornat() && lloguer.getUsuari() == usuari && lloguer.getJoc() == joc && lloguer.getPlataforma() == plataforma) {
                throw new IllegalArgumentException("Aquest usuari ja té un lloguer actiu del mateix joc i plataforma.");
            }
        }

        int numRegistre = 1;

        for (Lloguer lloguer : lloguers) {
            if (lloguer.getNumRegistre() >= numRegistre) {
                numRegistre = lloguer.getNumRegistre() + 1;
            }
        }

        LocalDate dataInici = LocalDate.now();
        LocalDate dataTornada = dataInici.plusDays(7);

        Lloguer nouLloguer = new Lloguer(numRegistre, usuari, joc, dataInici, dataTornada, plataforma);

        plataforma.reduirUnitat();
        lloguers.add(nouLloguer);
    }
    
    public void tornarLloguer(Lloguer lloguer) {

        if (lloguer == null || !lloguers.contains(lloguer)) {
            throw new IllegalArgumentException("El lloguer seleccionat no és vàlid.");
        }

        if (lloguer.isRetornat()) {
            throw new IllegalArgumentException("Aquest lloguer ja s'ha retornat.");
        }

        lloguer.setRetornat(true);
        lloguer.getPlataforma().augmentarUnitat();
    }
    
    private void carregarDadesInicials() {
        
        //Usuaris
        Usuari usuari1 = new Usuari("Laura", "García", "", "12345678A", "111222333", LocalDate.of(2026, 4, 1));

        Usuari usuari2 = new Usuari("Marc", "López", "", "87654321B", "444555666", LocalDate.of(2026, 4, 2));
        
        usuaris.add(usuari1);
        usuaris.add(usuari2);
        
        //Jocs
        ArrayList<Plataforma> plataformesJoc1 = new ArrayList<>();
        
        plataformesJoc1.add(new Plataforma("PS5", 5));
        plataformesJoc1.add(new Plataforma("Switch 2", 3));
        Joc joc1 = new Joc("Cyberpunk 2077", "Acció", plataformesJoc1);

        ArrayList<Plataforma> plataformesJoc2 = new ArrayList<>();

        plataformesJoc2.add(new Plataforma("Xbox", 4));
        plataformesJoc2.add(new Plataforma("PC", 3));
        Joc joc2 = new Joc("FIFA 25", "Esports", plataformesJoc2);

        jocs.add(joc1);
        jocs.add(joc2);
        
        //Lloguers
        Lloguer lloguer1 = new Lloguer(1, usuari1, joc1, LocalDate.of(2026, 10, 23), LocalDate.of(2026, 10, 30), joc1.getPlataformes().get(0));

        Lloguer lloguer2 = new Lloguer(2, usuari2, joc2, LocalDate.of(2026, 10, 20), LocalDate.of(2026, 10, 27), joc2.getPlataformes().get(0));

        lloguers.add(lloguer1);
        lloguers.add(lloguer2);
        
        joc1.getPlataformes().get(0).reduirUnitat();
        joc2.getPlataformes().get(0).reduirUnitat();
        
    }
    
}
