package com.careerit;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the loan amount:");
        float amount = sc.nextFloat();
        System.out.println("enter the rate of interest(%):");
        float rate = sc.nextFloat();
        System.out.println("enter the duration in years:");
        float time = sc.nextFloat();


        float si=(amount*time*rate)/100;
        float totalamount= si+amount;
        System.out.println("interest is:" +si);
        System.out.println("total amount is:"+totalamount);


    }
}
