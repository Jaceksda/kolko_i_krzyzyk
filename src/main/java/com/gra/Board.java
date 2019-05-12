package com.gra;

import java.util.List;

public class Board {

    private Kafelek[][] board;
    private List<>
    // kontruktor
    public Board() {

        board = new Kafelek[3][3];

        for (Kafelek[] wiersz : board) {
            for (int i=0; i<3; i++) {
//                kafelek = new Kafelek();
                wiersz[i] = new Kafelek();
            }
        }
    }

    public void wyświetlTablice() {

        for (Kafelek[] wiersz : board) {
            System.out.println(" - - - ");
            System.out.print("|");
            for (Kafelek kafelek : wiersz) {
                System.out.print(kafelek.narysuj() + "|");
            }
            System.out.println();
        }
    }

}
