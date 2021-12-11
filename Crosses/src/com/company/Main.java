package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("please enter a positive number");
        int number = new Scanner(System.in).nextInt();
        print(number);
    }

    public static void print(int number) {
        int left = 0, right = number-1;

        for(int i = 0; i < number; i++, left++, right--) {

            for(int j = 0; j < number; j++) {
                if(i == left && j == left) {
                    System.out.print('x');
                } else if( i == left && j == right) {
                    System.out.print('x');
                } else {
                    System.out.print('o');
                }



            }
            System.out.println();
        }
    }
}
