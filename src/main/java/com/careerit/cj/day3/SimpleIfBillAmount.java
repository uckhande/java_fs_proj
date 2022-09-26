package com.careerit.cj.day3;
import java.util.Scanner;
public class SimpleIfBillAmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bill amount:");
        float billamount = sc.nextFloat();

        float discount = 0;
        float netamount = 0;

        if (billamount >= 5000) ;
        {
            discount = billamount * 0.1f;
        }
        netamount = billamount - discount;
        System.out.println("bill amount:" + billamount);
        System.out.println("discount amount:" + discount);
        System.out.println("net amount:" + netamount);

    }
}
