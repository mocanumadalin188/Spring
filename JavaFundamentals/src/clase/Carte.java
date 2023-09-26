package clase;

public class Carte {
    // titlu, nr capitole, nr pagini, autor, tip carte
    private String titlu;
    private int numarCapitole;
    private int numarPagini;
    private Autor autor;
    private String tip;
    private static  boolean areImagini = true;


    public Carte(String titlu, Autor autor){
        this.titlu = titlu;
        this.autor = autor;
    }
    public String getTitlu(){
        return this.titlu;
    }
    public void setTitlu(String titlu){
        this.titlu = titlu;
    }
    public int getNumarCapitole(){
        return this.numarCapitole;
    }
    public void setNumarCapitole(int numarCapitole){
        this.numarCapitole =numarCapitole;
    }
    public int getNumarPagini(){
        return this.numarPagini;
    }
    public void setNumarPagini(int numarPagini){
        this.numarPagini = numarPagini;
    }
    public Autor getAutor(){
        return this.autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public String getTip(){
        return this.tip;
    }
    public void setTip(String tip){
        this.tip = tip;
    }
    public static boolean getAreImagini(){
        return areImagini;
    }
    public static void setAreImagini(boolean areImagini){
        Carte.areImagini  = areImagini;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", numarCapitole=" + numarCapitole +
                ", numarPagini=" + numarPagini +
                ", autor=" + autor +
                ", tip='" + tip + '\'' +
                '}';
    }
}