/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.Film;
import modell.Filmek;
import nezet.KonzolNezet;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class KonzolController {
    private Filmek filmek;
    private KonzolNezet konzolNezet;

    public KonzolController(Filmek filmek, KonzolNezet konzolNezet) {
        this.filmek = filmek;
        this.konzolNezet = konzolNezet;
    }

    public void osszesFilmKiirasa() {
        for (Film film : filmek.getFilmek()) {
            String uzenet = "A film adatai: " + film;
            konzolNezet.megjelenit(uzenet);
        }
    }
    
    public void leghosszabbFilmCime() {
        konzolNezet.megjelenit("még meg kell keresni");
    }
    
    
}
