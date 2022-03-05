package com.company;

public class Main {
    public static void main(String[] args) {
        int highScorePosition =calculateHighScorePosition(50);
        displayHighScorePosition("Rez",highScorePosition);

    }


    public static void displayHighScorePosition(String Player, int HighScorePosition) {
        System.out.println("Name " + Player + "Position:" + HighScorePosition);
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)){
            return 3;
        }
        else{
            return 4;
    }
}


}
