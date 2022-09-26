package com.careerit.cj.day4;
import java.util.Scanner;
public class NaturalNNumbersInreverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int n =sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.println(j+" ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(n*3));
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.println(j+ " ");
            }
            System.out.println();
        }
    }
}
