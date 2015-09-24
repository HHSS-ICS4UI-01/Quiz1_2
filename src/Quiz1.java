
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
        int martha = scanner.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = scanner.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = scanner.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 = scanner.nextInt();
        
        System.out.println("Martha plays " + getNumPlays(martha, machine1, machine2, machine3) + " times before going broke.");
        
    }
    
    //return number of times that Martha plays before she goes broke!
    public static int getNumPlays (int martha, int machine1, int machine2, int machine3)
    { 
        int plays = 0;
        while (martha >= 3) // she can only play either all or none
        {
            martha -= 3; // spends 1 on each machine
            
            plays += 3; // thus each machine has now been played an extra time
            
            machine1 ++;
            machine2 ++;
            machine3 ++;
            
            if (machine1 == 35)
            {
                martha += 30;
                machine1 = 0;
            }
            if (machine2 == 100)
            {
                martha += 60;
                machine2 = 0;
            }
            if (machine3 == 10)
            {
                martha += 9;
                machine3 = 0;
            }
        }
        return plays;
    }
}
