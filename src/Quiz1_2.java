
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nesrine
 */
public class Quiz1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //delcare variable counter
        int played = 0;
        int counter = 0;

        //ask user for how many quarters she has
        System.out.println("How many quarters does Martha have in the jar?");
        int quarters = input.nextInt();
        //ask user for how many times the first machine has been played
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = input.nextInt();
        //ask user for how many times the second machine has been played
        System.out.println("How many times has the first machine been played since paying out?");
        int machine2 = input.nextInt();
        //ask user for how many times the third machine has been played
        System.out.println("How many times has the first machine been played since paying out?");
        int machine3 = input.nextInt();

        while (true) {
            //subtract 3 quarters for every one time she plays all three machines
            quarters -= 3;
            //increase amount of times shes played
            counter++;
            //multiply counter by 3 for playing 3 machines at once
            played = counter * 3;
            //if she runs out of quarters exit the loop
            if (quarters == 0) {
                break;
            }
            //if she plays machine 1 35 times, get 30 quarters and reset the amount of times before payed out
            if (machine1 == 35) {
                quarters += 30;
                machine1 = 0;
            } else {
                //increase times before its payed out if it wasnt payed out yet
                machine1++;
            }
            //if she plays machine 2 100 times, get 90 quarters
            if (machine2 == 100) {
                quarters += 60;
                machine2 = 0;
            } else {
                //increase times before its payed out if it wasnt payed out yet
                machine2++;
            }
            //if she plays machine 3 10 times, get 9 quarters
            if (machine3 == 10) {
                quarters += 9;
                machine3 = 0;
            } else {
                //increase times before its payed out if it wasnt payed out yet
                machine3++;
            }
        }
        //output how many times shes played
        System.out.println("Martha plays " + played + " times before going broke.");
    }

}
