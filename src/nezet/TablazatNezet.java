/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.List;
import modell.Film;

/**
 *
 * @author bernath.milan
 */
public class TablazatNezet extends Nezet {
    @Override
    public void megjelenit(List<Film> filmLista) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-20s | %-20s | %-30s | %-5s |%n", "Cím", "Kategória", "Megjelenési dátum", "Rendező", "Kiadó", "Hossz");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for (Film film : filmLista) {
            System.out.printf("| %-15s | %-10s | %-20d | %-20s | %-30s | %-5d |%n", 
                film.getCim(), film.getKategoria(), film.getMegjelenesiDatum(), film.getRendezo(), film.getKiado(), film.getFilmHossz());
            
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    }    
}
