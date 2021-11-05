package com.company;
import java.util.Scanner;
import java.util.Random;
public class Ex717 {
    static Random randomNumbers = new Random();
    static int rolld1(){

        int dice1 = 1+randomNumbers.nextInt(6);

        return dice1;
    }

    static int rolld2(){
        int dice2 = 1+randomNumbers.nextInt(6);

        return dice2;
    }

    static int sum(int dice1,int dice2){
        int sum = dice1+ dice2;
        return sum;
    }

    public static void main(String[] args) {
        int total=0;
        int d;
        int [] a = new int[36000000];
        int [] freq = new int[36];
        for(int i=0;i<36000000;i++){
            ++freq[sum(rolld1(),rolld2())];
            total++;
        }
        System.out.printf("%10s%10s\n", "Sum", "   Frequency");
        for(int j=2;j<13;j++){

            System.out.printf("%10d%10d\n",j,freq[j]);
            //System.out.printf("Sum\n"+j);
            //System.out.printf("Frequency\n"+freq[j]);
        }

        System.out.println("\nThe total number of throws: "+ total);
    }
}
