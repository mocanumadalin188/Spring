package recapitulare;

import java.util.Arrays;
import java.util.Objects;

public class Carte {
    private String titlu;
    private Pagina[] pagini;
    private String[] capitole;
    private TipCarte tipCarte;
    private String[] limbi;

    public Carte(String titlu){
        this.titlu = titlu;
    }

    public Carte(String titlu, Pagina[] pagini, String[] capitole, TipCarte tipCarte, String[] limbi) {
        this(titlu);
        this.pagini = pagini;
        this.capitole = capitole;
        this.tipCarte = tipCarte;
        this.limbi = limbi;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Pagina[] getPagini() {
        return pagini;
    }

    public void setPagini(Pagina[] pagini) {
        this.pagini = pagini;
    }

    public String[] getCapitole() {
        return capitole;
    }

    public void setCapitole(String[] capitole) {
        this.capitole = capitole;
    }

    public TipCarte getTipCarte() {
        return tipCarte;
    }

    public void setTipCarte(TipCarte tipCarte) {
        this.tipCarte = tipCarte;
    }

    public String[] getLimbi() {
        return limbi;
    }

    public void setLimbi(String[] limbi) {
        this.limbi = limbi;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nCarte: {\n\t Titlu: ")
                .append(titlu)
                .append(", \n\t Pagini: ");
        for (Pagina paginaCurenta : pagini){
            stringBuilder.append(paginaCurenta.toString())
                    .append('\n');
        }
        stringBuilder.append("\n\t Tip: ")
                .append(tipCarte);
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o){
        Carte p = null;
        if (o instanceof Carte){
            p = (Carte) o;
        }
        return titlu.equals(p.titlu) &&
                Arrays.equals(pagini, p.pagini) &&
                tipCarte == p.tipCarte &&
                Arrays.equals(capitole, p.capitole) &&
                Arrays.equals(limbi, p.limbi);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(titlu, tipCarte);
        result = 31 * result + Arrays.hashCode(pagini);
        result = 31 * result + Arrays.hashCode(capitole);
        result = 31 * result + Arrays.hashCode(limbi);
        return result;
    }

    public static Boolean verificaDouaCarti(Carte c1, Object c2){
        return c1.equals(c2);
    }

    public int numarAparitii(String cuvant){
        int numarAparitii = 0;
        for (int i = 0; i < pagini.length; i++){
            String textPaginaCurent = pagini[i].getText();
            String[] cuvintePaginaCurenta = textPaginaCurent.split("[ .;]");
            for (int j = 0; j < cuvintePaginaCurenta.length; j++) {
                if (cuvant.equals(cuvintePaginaCurenta[j])) {
                    //in stanga e de preferat sa punem ceva ce stim ca nu este null
                    numarAparitii++;
                }
            }
        }
        return numarAparitii;
    }

}