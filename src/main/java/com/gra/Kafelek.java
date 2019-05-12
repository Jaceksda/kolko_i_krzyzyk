package com.gra;

public class Kafelek {

    private Stan stan;

    public Kafelek() {
        this.stan = Stan.Pusty;
    }

    public String narysuj(){

        if (stan == Stan.Pusty){
            return ".";
        } else if (stan == Stan.Kolko){
            return  "O";
        } else {
            return  "X";
        }
    }
}
