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
 * @author bernath.milan
 */
public class TablazatController extends Controller {

    public TablazatController(Filmek filmek, Nezet nezet) {
        super(filmek, nezet);
    }

    public void filmMegjelenit() {
        List<Film> filmLista = filmek.getFilmek();
        nezet.megjelenit(filmLista);
    }
}
