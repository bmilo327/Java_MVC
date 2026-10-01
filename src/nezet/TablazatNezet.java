/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import modell.Film;
import modell.Filmek;

/**
 *
 * @author bernath.milan
 */
public class TablazatNezet {
    private Filmek modell;

    public TablazatNezet(Filmek modell) {
        this.modell = modell;
    }
    
    public void megjelenit(){
        fej();
        tartalom();
    }

    private void fej() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-20s | %-20s | %-30s | %-5s |%n", "Cím", "Kategória", "Megjelenési dátum", "Rendező", "Kiadó", "Hossz");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }

    private void tartalom() {
        for (Film film : modell.getFilmek()) {
            System.out.printf("| %-15s | %-10s | %-20d | %-20s | %-30s | %-5d |%n", film.getCim(), film.getKategoria(), film.getMegjelenesiDatum(), film.getRendezo(), film.getKiado(), film.getFilmHossz());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
}
