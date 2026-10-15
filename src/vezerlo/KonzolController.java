/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import java.util.List;
import modell.Film;
import modell.Filmek;
import nezet.Nezet;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class KonzolController extends Controller {
    List<Film> filmLista = filmek.getFilmek();
    public KonzolController(Filmek filmek, Nezet nezet) {
        super(filmek, nezet);
    }
    

    public void filmMegjelenit() {
        nezet.megjelenit(filmLista);  
    }    
}
