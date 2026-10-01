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
        new KonzolNezet(modell).megjelenit();
        new TablazatNezet(modell).megjelenit();
        new TxtNezet(modell).megjelenit();
        
//        String s = new HtmlNezet(modell).megjelenit();
//        Files.writeString(Path.of("filmek.html"), s);
    }
    
}
