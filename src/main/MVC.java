/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.List;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Filmek filmek = new Filmek();
        
        List<Film> modosithatoFilmek = filmek.getFilmek();
        for (Film film : modosithatoFilmek) {
            System.out.println("film = " + film);
        }
        
        modosithatoFilmek.add(new Film("Nem jó!"));
        
        
        System.out.println("eredeti filmek: ");
        List<Film> eredetiFilmek = filmek.getFilmek();
        for (Film film : eredetiFilmek) {
            System.out.println("film = " + film);
        }
    }
    
}
