package com.careerit.cj.day2;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N value:");
        int N=sc.nextInt();

        int sum=(N*(N+1)/2);
        System.out.println("sum of first"+N+"natural num is" +sum);
    }
}
