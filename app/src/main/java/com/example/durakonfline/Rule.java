package com.example.durakonfline;

public class Rule {
    private String rank;
    private int value;


    private String result;

    public Rule() {

    }

    public Rule(String rank) {
        this.rank = rank;
        this.value = value;
    }

    public String getRank() {
        return this.rank;
    }

    public int getValueFromRank(String rank) {
        switch(rank) {
            case "SIX":
                value = 6;
                break;
            case "SEVEN":
                value = 7;
                break;
            case "EIGHT":
                value = 8;
                break;
            case "NINE":
                value = 9;
                break;
            case "TEN":
                value = 10;
                break;
            case "JACK":
                value = 10;
                break;
            case "QUEEN":
                value = 10;
                break;
            case "KING":
                value = 10;
                break;
            case "ACE":
                value = 11;
                break;
        }
        return value;
    }
}
