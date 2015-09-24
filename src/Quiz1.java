
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valet8115
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); //the scanner 
        System.out.println("How many quarters does Martha have in the jar?"); //person will enter the ammount of coins martha has
        int total = scan.nextInt();
        System.out.println("How many times has the first machine been played since paying out?"); // person will enter how many times machine 1 has been played and will set it in an int
        int mach1 = scan.nextInt();
        System.out.println("How many times has the second machine been played since paying out?"); // person will enter how many times machine 2 has been played and will set it in an int
        int mach2 = scan.nextInt();
        System.out.println("How many times has the third machine been played since paying out?"); // person will enter how many times machine 3 has been played and will set it in an int
        int mach3 = scan.nextInt();
        int count = 0;              // int for counting how many times Martha played the slot machines
        
        while (total >= 2){         //this loop will only run if martha has more than 2 coins
            if (mach1 == 35){       //if the first machine has 35 plays, martha will get 30 coins back
                total = total + 30; //total ammount of coins will add 30
                mach1 = 0;
            }
            else if (mach2 == 100){ //if the second machine has 100 plays, martha will get 60 coins back
                total = total + 60; //total ammount of coins will add 60
                mach2 = 0;
            }
            else if (mach3 == 10){ //if the third machine has 10 plays, martha will get 9 coins back
                total = total + 9; //total ammount of coins will add 9
                mach3 = 0;
            }
            count = count + 3;     //add 3 to count because Martha played 3 machines
            total = total - 3;     //Martha's will lose 3 coins becase she played 3 machines
            mach1++;               //machine 1 will add 1 because Martha played that machine
            mach2++;               //machine 2 will add 1 because Martha played that machine
            mach3++;               //machine 2 will add 1 because Martha played that machine
        }
        
        System.out.println("Martha will play " + count + " times then she will go broke"); // will output that ammount of times Martha played the slot machines
        
        
        
    }
}
