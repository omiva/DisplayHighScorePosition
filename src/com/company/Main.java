package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int Highscore=CalculateHighScorePosition(1000);
        DisplayHighScorePosition("Jeff Bezos",Highscore);

        Highscore=CalculateHighScorePosition(780);
        DisplayHighScorePosition("Moss Kaily",Highscore);

        Highscore=CalculateHighScorePosition(234);
        DisplayHighScorePosition("Smog Jane",Highscore);

        Highscore=CalculateHighScorePosition(20);
        DisplayHighScorePosition("Aurthor Morgen",Highscore);

    }

    public static void DisplayHighScorePosition(String player, int pos)
    {
        System.out.println(player+" MANAGED TO GET INTO POSITION "+pos+" ON THE HIGH SCORE TABLE");
    }
    public static int CalculateHighScorePosition(int playerSc)
    {
        if(playerSc>=1000)
        {
            return 1;
        }
        else if(playerSc>=500 && playerSc<1000)
        {
            return 2;
        }
        else if(playerSc>=100 && playerSc<500)
        {
            return 3;
        }
        else return 4;
    }
}
