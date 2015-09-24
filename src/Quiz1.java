
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0; // to count the number of plays

        System.out.println("How many quarters does Martha have in the jar?");
        int quarters = input.nextInt(); // number of quarters use wants to play

        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = input.nextInt(); // amount of times the first machine has been played since it last payed out

        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = input.nextInt();// amount of times the second machine has been played since it last payed out

        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 = input.nextInt();// amount of times the third machine has been played since it last payed out

        while (quarters >= 3) { // while the amount of quarters is higher than or equal to 3 (for the 3 plays)

            quarters -= 3; // -3 quarters for every time she plays 3 machines
            machine1++; //+1 to plays
            machine2++; //+1 to plays
            machine3++; //+1 to plays
            count += 3; //+3 count to number of plays 

            if (machine1 == 35) { //if machine one reaches 35 plays
                quarters += 30; // add 30 quarters to user's amount
                machine1 = 0; //reset amount of machine plays
            }
            if (machine2 == 100) { //if machine two reaches 100 plays
                quarters += 60; // add 60 quarters to user's amount
                machine2 = 0; //reset amount of machine plays
            }
            if (machine3 == 10) { //if machine 3 reaches 10 plays
                quarters += 9; // add 9 quarters to user's amount
                machine3 = 0; //reset amount of machine plays
            }
        }
        System.out.println("Martha plays " + count + " times before going broke."); // print number of plays
    }
}
