package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Input {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(2);
        System.out.println(c);
        System.out.println("The data type of value c is: "+ ((Object)c).getClass().getSimpleName());
    }

}
