package com.careerit.cj.day3;
import java.util.Scanner;
public class BoxesRequired {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the toys count");
        int toycount=sc.nextInt();
        System.out.println("enter box capacity:");
        int boxcapacity=sc.nextInt();
        int boxcount=0;
        if(toycount > boxcapacity){
            if(toycount%boxcapacity ==0){
                boxcount =toycount/boxcapacity;

            }else {
                boxcount=toycount/boxcapacity+1;

            }
        }else {
            boxcount=1;
        }
        System.out.println("total toys" +toycount+ "box capacity"+boxcapacity+ "and req boxes" +boxcount);
    }
}
