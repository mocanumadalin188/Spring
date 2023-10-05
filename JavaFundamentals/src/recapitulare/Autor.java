package recapitulare;

import java.util.Arrays;
import java.util.Objects;

public class Autor {
    private String nume;
    private int varsta;
    private Carte[] carti;

    public Autor(String nume, int varsta, Carte[] carti) {
        this.nume = nume;
        this.varsta = varsta;
        this.carti = carti;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Carte[] getCarti() {
        return carti;
    }

    public void setCarti(Carte[] carti) {
        this.carti = carti;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", carti=" + Arrays.toString(carti) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Autor autor = (Autor) object;
        return varsta == autor.varsta && Objects.equals(nume, autor.nume) && Arrays.equals(carti, autor.carti);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nume, varsta);
        result = 31 * result + Arrays.hashCode(carti);
        return result;
    }

    public int[] numaraPagini() {
        int[] nrPagini = new int[this.carti.length];
        for (int i = 0; i < carti.length; i++) {
            int nrPaginiCarteCurenta = carti[i].getPagini().length;
            nrPagini[i] = nrPaginiCarteCurenta;
        }
        return nrPagini;
    }

    public Carte[] verificaTitlulCartilor(String string) {
        Carte[] cartileVerificate = new Carte[carti.length];
        for (int i = 0; i < carti.length; i++) {
            if (carti[i].getTitlu().startsWith(string) && carti[i].getTitlu().endsWith(string)) {
                cartileVerificate[i] = carti[i];
            }
        }
        // verificam in array-ul nostru cate elemente non nulle sunt (in cazul nostru 1 din 2), apoi
        //retinem intr-o variabila "k" -> construim un array[k elemente]
        //for -> verificat elementele non null
        //for -> daca e non null adaug in noul array [k elemente]
        return cartileVerificate;
    }

    public static String[] stringAutori(Autor[] autori) {
        String[] rezultat = new String[autori.length];
        StringBuilder stringAutorCurent = new StringBuilder();
        for (int i = 0; i < autori.length; i++) {
            stringAutorCurent = new StringBuilder();
            String numeAutorCurent = autori[i].getNume();
            int varstaAutorCurent = autori[i].getVarsta();
            stringAutorCurent.append(numeAutorCurent).append(", ").append(varstaAutorCurent);
            for (int j = 0; j < autori[i].carti.length; j++) {
                String titluCarteCurentaAutorCurent = autori[i].carti[j].getTitlu();
                stringAutorCurent.append(", ").append(titluCarteCurentaAutorCurent);
            }
            stringAutorCurent.append(" || ");
            rezultat[i] = stringAutorCurent.toString();
        }
        return rezultat;
    }

    public String titluriCart(int numarCapitole) {
        StringBuilder stringRezultat = new StringBuilder();
        for (int i = 0; i < carti.length; i++) {
            if (carti[i].getCapitole().length > numarCapitole && carti[i].getLimbi().length == 1) {
                stringRezultat.append(carti[i].getTitlu()).append(" ");
            }
        }
        return stringRezultat.toString();
    }

    public Pagina[] printPagina(String titlu, String content) {
        Carte carteGasita = null;
        for (Carte c : carti) {
            if (titlu.equals(c.getTitlu())) {
                carteGasita = c;
            }
        }
        Pagina[] rezultat = new Pagina[carteGasita.getPagini().length];
        int i = 0;
        while (!carteGasita.getPagini()[i].getText().contains(content)) {
            rezultat[i] = carteGasita.getPagini()[i];
            i++;
        }
        return rezultat;
    }
}