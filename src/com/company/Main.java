package com.company;
//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
public class Main {
    public static void main(String[] args) {
        int highScorePosition =calculateHighScorePosition(50);
        displayHighScorePosition("Rez",highScorePosition);
//        git remote set-url origin https://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@github.com/Rezthecoder/JavaProect.git
    }
    //https://github.com/Rezthecoder/JavaProect.git

    public static void displayHighScorePosition(String Player, int HighScorePosition) {
        System.out.println("Name " + Player + "Position:" + HighScorePosition);
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;Applegirl1;
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
