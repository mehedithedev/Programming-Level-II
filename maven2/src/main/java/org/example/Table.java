package org.example;

public class Table {
    public static void main(String[] args) {
        int tableno = 5;
        int increament = 10;

        while (increament > 0) {
            System.out.println(tableno+" * " + (increament) + " = "+ tableno* (increament));
            increament -=2;
        }
    }
}