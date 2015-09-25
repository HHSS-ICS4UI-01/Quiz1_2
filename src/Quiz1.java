
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("How many quarters does Martha have in the jar? ");
        
        int max = input.nextInt();
        
        System.out.println("How many times has the first machine been played since paying out? ");
        
        int first = input.nextInt();
        
        System.out.println("How many times has the second machine been played since paying out? ");
        
        int second = input.nextInt();
        
        System.out.println("How many times has the third machine been played since paying out?");
        
        int third = input.nextInt();
        
        int timesPlayed = 0;
        
        while (max > 0) 
        {
            max -= 3;
            first += 1;
            second += 1;
            third += 1;
            
            if(first == 35) 
            {
                first = 0;
                max += 30;
            }
            
            if(second == 100) 
            {
                second = 0;
                max += 60;
            }
            
            if(third == 10) 
            {
                third = 0;
                max += 9;
            }
            timesPlayed += 3;
        }
        
        System.out.println("Martha plays " + timesPlayed + " times before going broke.");
        
    }
}
