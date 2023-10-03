package conditionals;

public enum Days {
    LUNI(1, "luni"),
    MARTI(2, "tuesday"),
    MIERCURI(3, "wed"),
    JOI(4, "thur"),
    VINERI(5, "friday"),
    SAMBATA(6, "abc"),
    DUMINICA(7, "bcd");

    private final int value;
    private final String eng;

    //default private

    private Days(int value, String eng) {
        this.value = value;
        this.eng = eng;
    }

    public int getValue() {
        return value;
    }

    public String getEng() {
        return eng;
    }

    public boolean egalitate(Days d1) {
        boolean rezultat = true;
        switch (d1) {
            case LUNI:
                System.out.println("abcccccc");
                break;
            case MARTI:
                rezultat = false;
                System.out.println("nu");
                break;
            default:
                rezultat = false;
                System.out.println("DDDD");
        }
        return rezultat;
    }

}
