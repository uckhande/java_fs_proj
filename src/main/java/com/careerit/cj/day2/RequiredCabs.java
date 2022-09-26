package com.careerit.cj.day2;

import java.util.Scanner;

public class RequiredCabs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the count:");
        int count=scanner.nextInt();
        System.out.println("enter the capacity:");
                int capacity=scanner.nextInt();
                int requiredCount=0;
                if(count%capacity==0) {
                    requiredCount = count / capacity;
                }
                else {
                    requiredCount = (count / capacity) + 1;
                }
        System.out.println("total count:"+count+"capacity:"+capacity+" and required cab count:" +requiredCount);

                }
    }
