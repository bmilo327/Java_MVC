/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Film {
    private String cim;
    private String kategoria;
    private int megjelenesiDatum;
    private String rendezo;
    private String kiado;
    private int filmHossz;
    
    public Film(String cim, String kategoria, int megjelenesiDatum, String rendezo, String kiado, int filmHossz) {
        this.cim = cim;
        this.kategoria = kategoria;
        this.megjelenesiDatum = megjelenesiDatum;
        this.rendezo = rendezo;
        this.kiado = kiado;
        this.filmHossz = filmHossz;
    }

    public String getCim() {
        return cim;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getMegjelenesiDatum() {
        return megjelenesiDatum;
    }

    public String getRendezo() {
        return rendezo;
    }

    public String getKiado() {
        return kiado;
    }

    public int getFilmHossz() {
        return filmHossz;
    }  

    @Override
    public String toString() {
        return "Film{" + "cim=" + cim + ", kategoria=" + kategoria + ", megjelenesiDatum=" + megjelenesiDatum + ", rendezo=" + rendezo + ", kiado=" + kiado + ", filmHossz=" + filmHossz + '}';
    }
    
    
    
    
}
