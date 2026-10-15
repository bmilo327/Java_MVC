/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.Filmek;
import nezet.Nezet;

/**
 *
 * @author bernath.milan
 */
public abstract class Controller {
    protected Filmek filmek;
    protected Nezet nezet;

    public Controller(Filmek filmek, Nezet nezet) {
        this.filmek = filmek;
        this.nezet = nezet;
    }
}
