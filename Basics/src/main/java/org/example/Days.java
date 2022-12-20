package org.example;

public enum Days {
    LUNI("Monday",1), MARTI("aa",2), MIERCURI("bb",3),
    JOI("cc",4), VINERI("dd",5), SAMBATA("ee",6), DUMINICA("ff",7);

    private final String value;
    private final int order;


    private Days(String value, int order){
        this.value = value;
        this.order = order;
    }

    public String getValue() {
        return value;
    }

    public int getOrder() {
        return order;
    }
}
