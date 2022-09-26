package com.careerit.cj.day4;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CountOddNum    {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lb num");
        int lb=sc.nextInt();
        System.out.println("enter the ub num");
        int ub=sc.nextInt();
        int count=0;
        for(int i =lb; i<=ub; i++){
            if(i % 2 !=0){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("\nodd nums count btw " +lb+ "and" +ub+ "is" +count);


    }
}
