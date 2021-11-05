package com.company;
import java.util.Scanner;
public class Ex712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[5];
        int x = 0;
        int n = 0;
        boolean d;
        int cnt=0;
        System.out.printf("Enter 5 numbers between 10 and 100: ");
        while (x < array.length) {
            n = scan.nextInt();
            if ((n >= 10 && n <= 100)) {
                d = false;
                x++;
                for (int i = 0; i < array.length; i++) {
                if (array[i]==n)
                    d=true;
                }
                if(!d) {
                    array[cnt] = n;
                    cnt++;
                }

                }
            else{
                System.out.printf("\nERROR!!! The number is not between 10 and 100.");
            }

        }
        System.out.printf("The numbers are: ");
        for (int i = 0; i < x; i++) {
            if(array[i]!=0)
            System.out.printf(" " + array[i]);
        }

    }
}