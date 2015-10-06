
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many quarters does Martha have in the jar?");
        int quarters = scanner.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = scanner.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = scanner.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 = scanner.nextInt();
        
        System.out.println("Martha plays " + getNumPlays(quarters, machine1, machine2, machine3) + " times before going broke.");
        
    }
    
    /**
     * Computes the number of times Martha must play before she goes broke
     * @param quarters the number of quarters Martha currently has
     * @param machine1 the number of times machine1 has been played since its last payout
     * @param machine2 the number of times machine2 has been played since its last payout
     * @param machine3 the number of times machine3 has been played since its last payout
     * @return 
     */
    public static int getNumPlays (int quarters, int machine1, int machine2, int machine3)
    { 
        int plays = 0;
        while (quarters >= 3) // she can only play either all or none
        {
            quarters -= 3; // spends 1 on each machine
            
            plays += 3; // thus each machine has now been played an extra time
            
            // increment the number of plays on each machine
            machine1 ++;
            machine2 ++;
            machine3 ++;
            
            // payout each machine if it has reached its own specified limit, then reset that machine's plays
            if (machine1 == 35)
            {
                quarters += 30;
                machine1 = 0;
            }
            if (machine2 == 100)
            {
                quarters += 60;
                machine2 = 0;
            }
            if (machine3 == 10)
            {
                quarters += 9;
                machine3 = 0;
            }
        }
        return plays;
    }
}
