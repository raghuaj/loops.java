package com.raghu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter your choice 1:pizza 2:burger 3:fries 4:pasta");
        Scanner input=new Scanner(System.in);
       int  choice=input.nextInt();
       switch (choice) {


           case 1:
               System.out.println(" your choice 1:pizza ");
               break;
           case 2:System.out.println(" your choice  2:burger ");
           break;
           case 3:System.out.println("your choice  3:fries ");
           break;
           case 4:System.out.println(" your choice  4:pasta");
           break;
           default:System.out.println("invalid choice");

       }
    }
}
