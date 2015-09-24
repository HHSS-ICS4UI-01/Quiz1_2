
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input scanner
        Scanner input = new Scanner(System.in);
        //input variable for # of quarters
        System.out.println("How many quarters does Martha have in the jar?");
        int quart = input.nextInt();
        //input variables for each slot machine
        System.out.println("How many times has the first machine been played since paying out?");
        int slot1 = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int slot2 = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int slot3 = input.nextInt();
        //create variable for # of plays
        int plays = 0;
        
        //loop until she runs out of quarters
        while(quart >= 3 && quart < 1000)
        {
            //decrease the # of quarters
            quart = quart - 3;
            
            if(slot1 == 35)
            {   //every 35 plays on slot1 add 30 quarters
                quart = quart + 30;
                slot1 = 0;
            }
            if(slot2 == 100)
            {   //every 100 plays on slot2 add 60 quarters
                quart = quart + 60;
                slot2 = 0;
            }
            if(slot3 == 10)    
            {   //every 10 plays on slot3 add 9 quarters
                quart = quart + 9;
                slot3 = 0;
            }
            //increase the # of total plays and slot plays
            slot1 ++;
            slot2 ++;
            slot3 ++; 
            plays = plays + 3;
        }
        System.out.println("Martha plays " + plays + " times before going broke.");
    }
}
