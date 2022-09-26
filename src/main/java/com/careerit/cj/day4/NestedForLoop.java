package com.careerit.cj.day4;
import java.util.Scanner;
public class NestedForLoop {
    public static void main(String[] args) {


        int n = 10;
        for (int i = 1; i <= 1; i++) {
            int j;
            for (j = 1; j <= n; j++) {
                if (j % 3 == 0) {
                    continue;
                }
                System.out.println(i + "  " + j);
            }
        }
    }
}
