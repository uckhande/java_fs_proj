package com.careerit.cj.day4;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class NaturalNNumbersInReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int N=sc.nextInt();

        for(int i=N; i>=1; i--){
        System.out.printf(i+ " ");
    }
}
}
