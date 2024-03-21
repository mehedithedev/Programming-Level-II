package org.example;

public class BigO {
    public static void main(String[] args) {
        int n = 1000000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += arr[i];
        }
        System.out.println(x);
    }
}
