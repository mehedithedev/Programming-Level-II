package org.example;

import java.util.Scanner;

/**
 * @author kasha
 */

public class userInput {

    public static void main(String[] args) {


        int tableno = 5;

        int loop1 = 0;


        System.out.println("input the table number: ");

        Scanner sc = new Scanner(System.in);

        tableno = sc.nextInt();


        System.out.println("input the start number: ");

        sc = new Scanner(System.in);

        int start = sc.nextInt();


        System.out.println("input the stop number: ");

        sc = new Scanner(System.in);

        int stop = sc.nextInt();


        System.out.println("Please enter 'a' for acsending or 'd' for descending : ");

        char c = sc.next().charAt(0);


        if (c == 'd') {

            loop1 = start;


            do {


                System.out.println(tableno + " * " + (loop1) + " = " + tableno * (loop1));

                loop1--;

            }

            while (loop1 > stop - 1);


        } else if (c == 'a') {
            loop1 = stop;

            do {
                System.out.println(tableno + " * " + (loop1) + " = " + tableno * (loop1));

                loop1++;
            } while (loop1 < start + 1);


        }

    }

}