package recapitulare;

public enum TipCarte {
    PROZA(0),
    POEZIE(1),
    COMEDIE(2),
    CRITICA(3);

    private final int index;

    private TipCarte(int index){
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}