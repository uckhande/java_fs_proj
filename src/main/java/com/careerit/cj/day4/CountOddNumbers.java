package com.careerit.cj.day4;
import java.util.Scanner;
public class CountOddNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //find first n number which is divisible by 3 and 6 but not 9
        System.out.println("enter n value:");
        int n= sc.nextInt();


        int count=0;
        for(int i=1;  ; i++){
            if(i % 3 ==0  && i % 6 ==0  && i % 9 !=0){
                System.out.println(i);
                count++;

            }
            if(n==count){
                break;
            }
        }
    }
}
