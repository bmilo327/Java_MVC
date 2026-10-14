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
public class Controller {
    private Filmek filmek;
    private KonzolNezet konzolNezet;

    public Controller(Filmek filmek, KonzolNezet konzolNezet) {
        this.filmek = filmek;
        this.konzolNezet = konzolNezet;
    
        osszesFilmKiirasa(filmek, konzolNezet);
    }

    private void osszesFilmKiirasa(Filmek filmek, KonzolNezet konzolNezet1) {
        for (Film film : filmek.getFilmek()) {
            String uzenet = "A film adatai: " + film;
            konzolNezet1.megjelenit(uzenet);
        }
    }
    
    
}
