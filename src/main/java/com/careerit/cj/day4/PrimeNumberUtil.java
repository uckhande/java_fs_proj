package com.careerit.cj.day4;
import java.util.Scanner;
public class PrimeNumberUtil {

   // private static int countPrimeInRange(int) {
    //}

    private static boolean isPrime(int num){
        if( num <2 || (isEven(num) && num !=2)){
            return false;
        }
        for(int i=2; i<num/2; i++){
            if(num %1==0){
                return false;
            }
        }
        return true;
    }
    private static boolean isEven(int num){
        return num %2==0;

    }
}
