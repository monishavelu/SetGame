/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A0136582b
 */
public class UserSelection {
   
    public static void select()
    {
       ArrayList<Cards> twelve = SetCheck.CardsOnTableMethod();
        
        System.out.println(twelve);
       
       Scanner sc = new Scanner(System.in);
       
       Cards s1 = new Cards();
       Cards s2 = new Cards();
       Cards s3 = new Cards();
       
       System.out.print("Enter First selection");
       int input1;
       if (sc.hasNextInt()) {
       input1 = sc.nextInt();
       System.out.println("input = " + input1);
       s1 = twelve.get(input1);
       System.out.println(twelve.get(input1).toString());}
       
       System.out.print("Enter second selection");
       int input2;
       if (sc.hasNextInt()) {
       input2 = sc.nextInt();
       System.out.println("input = " + input2);
       s2= twelve.get(input2);
       System.out.println(twelve.get(input2).toString());}
       
       System.out.print("Enter second selection");
       int input3;
       if (sc.hasNextInt()) {
       input3 = sc.nextInt();
       System.out.println("input = " + input3);
       s3 = twelve.get(input3);
       System.out.println(twelve.get(input3).toString());}
       
         if(GameEngine.Compare(s1,s2,s3) == true)
     {  
         System.out.println("It is a set");
     }                   
     else
     {
         System.out.println("It is not a set");
     }
    }
    }

