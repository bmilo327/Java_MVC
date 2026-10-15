/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import modell.Filmek;
import nezet.HtmlNezet;
import nezet.KonzolNezet;
import nezet.TablazatNezet;
import nezet.TxtNezet;
import vezerlo.KonzolController;
import vezerlo.TablazatController;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Filmek modell = new Filmek();
        TablazatNezet view = new TablazatNezet();
//        KonzolNezet view = new KonzolNezet();
//        new TablazatNezet(modell).megjelenit();
//        new TxtNezet(modell).megjelenit();
        
//        String s = new HtmlNezet(modell).megjelenit();
//        Files.writeString(Path.of("filmek.html"), s);

        /*KonzolController controller = new KonzolController(modell, view);
        System.out.println("Filmek:");
        controller.osszesFilmKiirasa();
        
        System.out.println("A leghosszabb film címe:");
        controller.leghosszabbFilmCime();*/
        
        TablazatController controller = new TablazatController(modell, view);
        controller.filmKiir();
    }
    
}
