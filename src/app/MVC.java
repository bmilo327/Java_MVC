/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import modell.Filmek;
import nezet.KonzolNezet;
import nezet.TablazatNezet;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       new KonzolNezet(new Filmek()).megjelenit();
       new TablazatNezet(new Filmek()).megjelenit();
    }
    
}
