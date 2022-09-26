package com.careerit.cj.day3;
import java.util.Scanner;
public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1:");
        int num1=sc.nextInt();
        System.out.println("enter num2:");
        int num2=sc.nextInt();
        System.out.println("enter num3:");
        int num3=sc.nextInt();
        int biggest=0;


        if(num1>num2 && num1>num3){
            biggest=num1;
        } else if (num2>num3) {
            biggest = num2;
        }
        else {
            biggest = num3;
        }
        System.out.println("biggest of"+num1+ "," +num2+ "," +num3+ "is" +biggest );

        }
    }
