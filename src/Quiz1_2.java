
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Quiz1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //quarters holds num of quarters
        //first holds num of times since 1st machine payed out
        //second holds num of times since 2nd machine payed out
        //third holds num of times since 3rd machine payed out
        //played holds num of times she gave a quarter to a machine
        int quarters, first, second, third, played = 0;
        //sets all variables to specified nums
        System.out.println("How many quarters does Martha have in the jar?");
        quarters = in.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        first = in.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        second = in.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        third = in.nextInt();
        while (quarters >= 3) { //if Martha has enough quarters to play all machines, keep playing
            quarters -= 3; //she used three quarters in the three machines
            played += 3; //she played three machines one time each, add three to num of plays
            first++; //add one to num of times since 1st payed out
            second++; //add one to num of times since 2nd payed out
            third++; //add one to num of times since 3rd payed out
            if (first == 35) { //if it has been 35 times since 1st payed out
                first = 0; //set first to zero
                quarters += 30; //add 30 quarters
            }
            if (second == 100) { //if it has been 100 times since 2nd payed out
                second = 0; //set second to zero
                quarters += 60; //add 60 quarters
            }
            if (third == 10) { //if it has been 10 times since 3rd payed out
                third = 0; //set third to zero
                quarters += 9; //add 9 quarters
            }
        }
        //tell user how many times Martha played in total
        System.out.println("Martha plays " + played + " times before going broke.");
    }
}