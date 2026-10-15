/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;


import java.util.List;
import modell.Film;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class KonzolNezet extends Nezet { 
    @Override
    public void megjelenit(List<Film> filmLista) {
        osszesFilmMegjelenit(filmLista);
        leghosszabbFilmCimeMegjelenit(filmLista);
    }

    private void leghosszabbFilmCimeMegjelenit(List<Film> filmLista) {
        Film leghosszabbFilm = filmLista.get(0);
        String adat = "";
        for (int i = 1; i < filmLista.size(); i++) {
            if (filmLista.get(i).getFilmHossz() > leghosszabbFilm.getFilmHossz()) {
                leghosszabbFilm = filmLista.get(i);
                
            }
        }
        adat = leghosszabbFilm.getCim();
        System.out.println("A leghosszabb film címe: " + adat);
    }

    private void osszesFilmMegjelenit(List<Film> filmLista) {
        for (Film film : filmLista) {
            System.out.println("A film adatai: " + film);
        }
    }
}
