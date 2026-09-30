/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import modell.Film;
import modell.Filmek;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class KonzolNezet {
    private Filmek modell;

    public KonzolNezet(Filmek filmek) {
        this.modell = modell;
    }
    
    
    
    public void megjelenit(){
        for (Film film : modell.getFilmek()) {
            System.out.println(film);
        }
    }
    
}
