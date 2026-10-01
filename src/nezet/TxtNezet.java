package nezet;

import modell.Film;
import modell.Filmek;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author bernath.milan
 */
public class TxtNezet {
    private Filmek modell;
    private String fajlNev;

    public TxtNezet(Filmek modell) {
        this.modell = modell;
        this.fajlNev = "filmek.txt";
    }
    
    public void megjelenit(){
        try (PrintWriter pw = new PrintWriter(new FileWriter(fajlNev))) {
            fej(pw);
            tartalom(pw);
            System.out.println("A fájl sikeresen mentve ide: " + fajlNev);
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl írása közben: " + e.getMessage());
        }
    }

    private void fej(PrintWriter pw) {
        pw.println("-----------------------------------------------------------------------------------------------------------------------");
        pw.printf("| %-15s | %-10s | %-20s | %-20s | %-30s | %-5s |%n", "Cím", "Kategória", "Megjelenési dátum", "Rendező", "Kiadó", "Hossz");
        pw.println("-----------------------------------------------------------------------------------------------------------------------");
    }

    private void tartalom(PrintWriter pw) {
        for (Film film : modell.getFilmek()) {
            pw.printf("| %-15s | %-10s | %-20d | %-20s | %-30s | %-5d |%n", 
                    film.getCim(), 
                    film.getKategoria(), 
                    film.getMegjelenesiDatum(), 
                    film.getRendezo(), 
                    film.getKiado(), 
                    film.getFilmHossz());
        }
        pw.println("-----------------------------------------------------------------------------------------------------------------------");
    }
}