package recapitulare;

import java.util.Objects;

public class Pagina {
    private String text;
    private boolean areImagini;

    public Pagina(String text, boolean areImagini) {
        this.text = text;
        this.areImagini = areImagini;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isAreImagini() {
        return areImagini;
    }

    public void setAreImagini(boolean areImagini) {
        this.areImagini = areImagini;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Pagina: {text: ")
                .append(text)
                .append(",\n\t\t ")
                .append("areImagini: ")
                .append(areImagini)
                .append("}");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o){
        Pagina p = null;
        if (o instanceof Pagina){
            p = (Pagina) o;
        }
        return text.equals(p.text) && areImagini == p.areImagini;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, areImagini);
    }
}