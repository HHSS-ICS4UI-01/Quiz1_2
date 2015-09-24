
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes scanner
        Scanner input = new Scanner(System.in);
        
        //initializes Martha's total quarters as a variable
        int quarters = 0;
        
        //initializes Martha's turns on first machine since paying out as a variable
        int firstTurns = -1;
        
        //initializes Martha's turns on second machine since paying out as a variable
        int secondTurns = -1;
        
        //initializes Martha's turns on third machine since paying out as a variable
        int thirdTurns = -1;
        
        //initializes total turns Martha has taken as a variable
        int turnsTotal = 0;
        
        //if number of quarters is less than 1 or greater than 1000
        while(quarters < 1 || quarters > 999)
        {
            //asks user for the number of quarters Martha has
            System.out.println("How many quarters does Martha have in the jar?"); 
            quarters = input.nextInt();
            
            if(quarters < 1 || quarters > 999)
            {
                //inform user of mistake, allow them to reenter number
                System.out.println("ERROR: Number must be between 1 and 999.");
            }
                    
        }
        
        
        //while user has not entered a number between 0 and 34
        while(firstTurns < 0 || firstTurns > 34)
        {
            //asks user for the number of times first machine has been played since paying out
            System.out.println("How many times has the first machine been played since paying out?");
            firstTurns = input.nextInt();
        
            //if user enters a number less than 0 or greater than 34
            if(firstTurns < 0 || firstTurns > 34)
            {
                //inform user of mistake, allow them to reenter number
                System.out.println("ERROR: Number must be between 0 and 34.");
            }
        }
        
        //while user has not entered a number between 0 and 99
        while(secondTurns < 0 || secondTurns > 99)
        {
            //asks user for the number of times second machine has been played since paying out
            System.out.println("How many times has the second machine been played since paying out?");
            secondTurns = input.nextInt();
            
            //if user enters a number less than 0 or greater than 99
            if(secondTurns < 0 || secondTurns > 99)
            {
                //inform user of mistake, allow them to reenter number
                System.out.println("ERROR: Number must be between 0 and 99.");
            }
        }
        
        //while user has not entered a number between 0 and 9
        while(thirdTurns < 0 || thirdTurns > 9)
        {
            //asks user for the number of times third machine has been played since paying out
            System.out.println("How many times has the third machine been played since paying out?");
            thirdTurns = input.nextInt();
            
            //if user enters a number less than 0 or greater than 9
            if(thirdTurns < 0 || thirdTurns > 9)
            {
                //inform user of mistake, allow them to reenter number
                System.out.println("ERROR: Number must be between 0 and 9.");
            }
        }
        
        //loop until Martha has less than 3 quarters
        while (quarters > 2)
        {
            //Martha spends 3 quarters each loop over
            quarters = quarters - 3;
            
            //count each 3 quarters Martha has spent as 3 turns
            turnsTotal = turnsTotal + 3;
            
            //count the 3 quarters Martha puts in as one turn per machine 
            firstTurns++;
            secondTurns++;
            thirdTurns++;
            
            //if the first machine has been played 35 times since payout
            if(firstTurns == 35)
            {
                //Martha earns 30 more quarters
                quarters = quarters + 30;
                
                //reset first machine's turns since payout to 0
                firstTurns = 0;
            }
            //if the second machine has been played 100 times since payout
            if(secondTurns == 100)
            {
                //Martha earns 60 more quarters
                quarters = quarters + 60;
                
                //reset second machine's turns since payout to 0
                secondTurns = 0;
            }
            
            //if the third machine has been played 10 times since payout
            if(thirdTurns == 10)
            {
                //Martha earns 9 more quarters
                quarters = quarters + 9;
                
                //reset third machine's turns since payout to 0
                thirdTurns = 0;
            }
            
        }
      
        //output to the user the number of times Martha played before going broke
        System.out.println("Martha plays " + turnsTotal + " times before going broke.");
            
        }
    }

