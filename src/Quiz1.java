
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many quarters does Martha have in the jar?");
        int jar = input.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int first = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int second = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int third = input.nextInt();
        
        int times = 0; //The amount of time she plays
        
       boolean exit = false;
       
       while (exit == false)
       {
           //1 is added to the count of how much its been played since paying out.
           first++;
           second++;
           third++;
           
           times = times + 3; //She plays 3 machines at once
           jar = jar - 3; //She uses 3 quarters
           
           if (first == 35)
           {
               jar = jar+30; //She gains 30 quarters
               first = 0; //The machine resets back to zero
           }
           
           if (second == 100)
           {
               jar = jar+60; //She gains 60 quarters
               second = 0; //The machine resets back to zero
           }
           
           if (third == 10)
           {
               jar = jar+9; //She gains 9 quarters
               third = 0; //The machine resets back to zero
           }
           
           if (jar < 3)
           {
               exit = true; //When she has less than 3 quarters, the loop ends
           }
           
           
           
       }
     System.out.println("Martha plays " + times + " times before going broke.");
        
    
    }
}
