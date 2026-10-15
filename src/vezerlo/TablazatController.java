/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vezerlo;

import modell.Film;
import modell.Filmek;
import nezet.TablazatNezet;

/**
 *
 * @author bernath.milan
 */
public class TablazatController {
    private Filmek filmek;
    private TablazatNezet tablazatNezet;

    public TablazatController(Filmek filmek, TablazatNezet tablazatNezet) {
        this.filmek = filmek;
        this.tablazatNezet = tablazatNezet;
    }

    public void filmKiir() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-20s | %-20s | %-30s | %-5s |%n", "Cím", "Kategória", "Megjelenési dátum", "Rendező", "Kiadó", "Hossz");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for (Film film : filmek.getFilmek()) {
            String uzenet = String.format("| %-15s | %-10s | %-20d | %-20s | %-30s | %-5d |", film.getCim(), film.getKategoria(), film.getMegjelenesiDatum(), film.getRendezo(), film.getKiado(), film.getFilmHossz());
            tablazatNezet.megjelenit(uzenet);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }
}
