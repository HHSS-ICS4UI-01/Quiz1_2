
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        //sets up the information
        int machine1 = 35;
        int machine2 = 100;
        int machine3 = 10;
        
        int machine1Pay = 30;
        int machine2Pay = 60;
        int machine3Pay = 9;
        
        int i;
  
        //asks user for information
        System.out.println("How many quarters does Martha have in the jar?");
        int jar = input.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1Play = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2Play = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3Play = input.nextInt();
        
        //loop until she runs out of money
        for(i = 0; jar >= 3;i=i+3)
        {
            //removes 3 quarters each play
            jar = jar-3;    
            //check plays
            if(machine1Play == machine1)
            {
                //adds the payout to her jar
                jar = jar + machine1Pay;
                //resets machine plays
                machine1Play = 0;
            }
            if(machine2Play == machine2)
            {
                //adds the payout to her jar
                jar = jar + machine2Pay;
                //resets machine plays
                machine2Play = 0;
            }
            if(machine3Play == machine3)
            {
                //adds the payout to her jar
                jar = jar + machine3Pay;
                //resets machine plays
                machine3Play = 0;
            }
            //add 1 to the play count for each machine
            machine1Play++;
            machine2Play++;
            machine3Play++;      
        }     
        //output
        System.out.println("Martha plays " + i + " times before going broke.");
    }
}