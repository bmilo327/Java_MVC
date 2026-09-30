/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Filmek {
    private ArrayList<Film> filmek;

    public Filmek() {
        filmek = new ArrayList<>();
        
        Film film1 = new Film("Eredet", "Sci-Fi", 2010, "Christopher Nolan", "Warner Bros. Pictures", 148);
        Film film2 = new Film("A remény rabjai", "Dráma", 1994, "Frank Darabont", "Castle Rock Entertainment", 142);
        Film film3 = new Film("Csillagok közt", "Sci-Fi", 2014, "Christopher Nolan", "Paramount Pictures", 169);
        Film[] filmek = {film1, film2, film3};
        for (Film film : filmek) {
            felvesz(film);
        }
    }

    public List<Film> getFilmek() {
        /*return Collections.unmodifiableList(filmek);*/
        List<Film> masolat = new ArrayList<>(filmek);
        return masolat;
    }
    
    public void felvesz(Film film) {
        filmek.add(film);
    }
    
    
}
