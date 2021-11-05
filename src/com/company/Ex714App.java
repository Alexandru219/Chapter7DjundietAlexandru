package com.company;
import java.util.Scanner;
public class Ex714App {
    public static void main(String[] arg){
        Scanner scan =new Scanner(System.in);
        int num=0;
        System.out.printf("Enter the size of array: ");
        num = scan.nextInt();
        int a[]=new int[num];
        int total = 1;
        System.out.printf("Enter the "+ num +" numbers: ");
        for(int i=0;i<a.length;i++){
             a[i] = scan.nextInt();
            total *=a[i];
        }

        System.out.printf("The product of a series of integer: "+ total );
    }
}
