
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author muirw5809
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        //ask the user how many quarters martha has
        System.out.println("How many quarters does Martha have in the jar?");
        //int n is the amount of quarters the user said martha has
        int n = input.nextInt();
        //ask the user how many times the first machine has been played
        System.out.println("How many times has the first machine been played since paying out?");
        //int f is the amount of times the user has said the first machine has been used
        int f = input.nextInt();
        //ask the user how many times the second machine has been played
        System.out.println("How many times has the second machine been played since paying out?");
        //int s is the amount of times the user has said the second machine has been used
        int s = input.nextInt();
        //ask the user how many times the third machine has been played
        System.out.println("How many times has the third machine been played since paying out?");
        //int t is the amount of times the user has said the third machine has been used
        int t = input.nextInt();

        //int count is counting the total amount of times she plays before she goes broke
        int count = 0;
        //while martha has 3 or more quarters
        while (n > 2) {
            //martha looses 3 quarters
            n -= 3;
            //the first slot machine adds 1 to the amount of times its been used
            f += 1;
            //the second slot machine adds 1 to the amount of times its been used
            s += 1;
            //the third slot machine adds 1 to the amount of times its been used
            t += 1;
            //the amount of times martha has played increases by 3
            count += 3;

            //if the first slot machine has been played 35 times
            if (f == 35) {
                //martha gaines 30 extra coins   
                n = n + 30;
                //the first slot machine resets to being played 0 times
                f = 0;
            }

            //if the second slot machine has been played 100 times
            if (s == 100) {
                //martha gaines 60 extra coins
                n = n + 60;
                //the second slot machine resets to being played 0 times
                s = 0;
            }

            //if the third slot machine has been played 10 times
            if (t == 10) {
                //martha gaines 9 extra coins
                n = n + 9;
                //the third slot machine resets to being played 0 times
                t = 0;
            }
        }

        //output the amount of times martha can play before only having 2 coins left
        System.out.println("Martha plays " + count + " times before going broke.");

    }
}
