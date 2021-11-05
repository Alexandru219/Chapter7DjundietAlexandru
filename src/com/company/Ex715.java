package com.company;
import java.util.Scanner;
public class Ex715 {
    public static void main(String[] args){

      int[] arr = new int[ (args.length >=1) ? Integer.parseInt(args[0]) : 10];
        System.out.printf("%s%10s%n", "Index", "Value");
        for (int i=0; i< arr.length;i++){
            System.out.printf("%5d%10d%n", i, arr[i]);
        }
    }
}
