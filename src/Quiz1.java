
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millg1278
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        // asking for amount of quarters.
        System.out.println("How many quarters does martha have in the jar?");
        // remembering amount of quarters
        int quarters = input.nextInt();
        // seeing how many plays are left till payout
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = input.nextInt();
        // seeing how many plays are left till payout
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = input.nextInt();
        // seeing how many plays are left till payout
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 = input.nextInt();
        
        // seeing how many times martha has played
        for(int i = 3; quarters >= 3; i = i + 3)
        {
           // subrtracting quarters
            quarters = quarters - 3;
            machine1 = machine1 + 1;
            machine2 = machine2 + 1;
            machine3 = machine3 + 1;
            if(machine1 == 35)
            {
                machine1 = 0;
                quarters = quarters + 30;
            }
            if(machine2 == 100)
            {
                machine1 = 0;
                quarters = quarters + 60;
            }
            if(machine1 == 10)
            {
                machine1 = 0;
                quarters = quarters + 9;
            }
            if(quarters < 3)
            {
            System.out.println("Martha plays " + i +" times before she is broke");
            }
        }
        
        
        
    }
}
