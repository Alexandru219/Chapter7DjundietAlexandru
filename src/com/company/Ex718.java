package com.company;
import java.util.Scanner;
import java.util.Random;
public class Ex718 {
    private Random randomNumbers=new Random();
    private enum Status{Continue, Won, Lost};
    int[] Gwon;
    int[] Glost;
    int totalW;
    int totallose;

    public void play(){
        int totalD=0;
        int myP=0;
        Status gameStatus;
        int r;
        Gwon=new int[22];
        Glost=new int[22];
        for(int x=1; x<=1000000; x++){
            totalD=rollDice();
            r=1;
            switch(totalD){
                case 7:
                case 11:
                    gameStatus=Status.Won;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus=Status.Lost;
                    break;
                default:
                    gameStatus=Status.Continue;
                    myP=totalD;
                    break;
            }
            while(gameStatus==Status.Continue){
                totalD=rollDice();
                r++;
                if(totalD==myP)
                    gameStatus=Status.Won;
                else if(totalD==7)
                    gameStatus=Status.Lost;
            }
            if(r>21)
                r=21;
            if(gameStatus==Status.Won){
                Gwon[r]++;
                totalW++;
            }
            else{
                Glost[r]++;
                totallose++;
            }
        }
        printStats();
    }
    public void printStats(){
        int totalGames;
        int l=0;
        int rolWin;
        int rolLose;
        for(int x=1; x<=21; x++){
            if(x==21)
                System.out.printf("\n"+Gwon[21] +" games won and "+ Glost[21] +" games lost on rolls after the 20th roll" );
            else
            if(x<=21)
                System.out.printf("\n"+Gwon[x] +" games won and "+ Glost[x] +" games lost on roll "+ x);

            rolWin=(Gwon[x]*x);
            rolLose=(Glost[x]*x);
            System.out.printf("\nTotal Rolls to win: "+rolWin);

        }
        totalGames=totalW+totallose;
        System.out.printf("\n%s %d / %d = %.2f%%\n", "The chances of winning at craps are ", totalW, totalGames, (100.0*totalW/totalGames));
        System.out.printf("The average game length is %.2f rolls.\n", ((double)l/totalGames));
    }
    public int rollDice(){
        int die1=1+randomNumbers.nextInt(6);
        int die2=1+randomNumbers.nextInt(6);
        int sum=die1+die2;
        return sum;
    }
    public static void main(String args[]){
        Ex718 game=new Ex718();
        game.play();
    }
}
