
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author giebj5373
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to input information
    Scanner input = new Scanner(System.in);
    //start off with her playing 0 times
    int plays = 0;
        System.out.println("How many quarters does Martha have in the jar?");
        //user imputs the number of coins she starts with
    int coins = input.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        //user imputs the number of times the first machine has been used since it won last
    int playout1 = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
                //user imputs the number of times the second machine has been used since it won last
    int playout2 = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
                //user imputs the number of times the third machine has been used since it won last
    int playout3 = input.nextInt();
   //keeps playing until she has less than 3 quarters left
    while (coins >= 3)
    {
       //plays 3 times at once 
        plays = plays +3;
        //insert 3 quarters at once
        coins = coins - 3;
        //each play of the machine makes it closer to winning play
        playout1++;
        playout2++;
        playout3++;
        //every 35 times the machine is played on the lady wins 30 coins
        if (playout1%35 == 0)
        {
            coins = coins + 30;
        }
        //every 100 times the machine is played on the lady wins 60 coins
        if (playout2%100 == 0)
        {
            coins = coins + 60;
        }
        //every 10 times the machine is played on the lady wins 9 coins
        if (playout3%10 == 0)
        {
            coins = coins + 9;
        }
    }
    //prints out the number of times the lady was able to play the machines before running out of coins
    System.out.println("Martha plays " + plays + " times before going broke.");
    }
}
