
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //getting the input from the user.
        System.out.println("How many quarters does Martha have in the jar?");
        int coins = input.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 = input.nextInt();
        //A boolean to end the program once Martha has less than 3 coins
        boolean broke = false;
        //A counter to keep track of how many times she has played and each machine 
        int counter = 0;
        
        
        while(broke == false)//While Martha has 3 or more coins 
        {
            counter = counter + 3;//the counter adds 3 time for each machine played
            coins = coins - 3;//Marha loses 3 coins, 1 for each machine
            machine1++;//machine 1 gets played
            machine2++;//machine 2 gets played
            machine3++;//machine 3 gets played
            
           if(machine1 == 35)//once machine 1 has 35 plays the machine pays and resets to 0 plays
            { 
                coins = coins + 30;
                machine1 = 0;
            }
           if(machine2 == 100)//once machine 2 has 100 plays the machine pays and resets to 0 plays
            {
              coins = coins + 60;
              machine2 = 0;
            }
           if(machine3 == 10)//once machine 3 has 10 plays the machine pays and resets to 0 plays
            {
                coins = coins +9;
                machine3 = 0;
            }
            
            
            if(coins < 3)//Once Martha has under 3 quarters she doesn't play anymore, so the counter
        {                //is output to the screen to show how many times she had played
            broke = true;
            System.out.println("Martha plays " + counter + " times before going broke.");
        }
     }
        
        
        
        
        
        
    }
}
