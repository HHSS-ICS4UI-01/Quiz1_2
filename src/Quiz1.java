
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaol9270
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many quarters does Martha have in the jar? ");          //asking for how many quarters she started with
        
        int quarters = input.nextInt();                                                 //how many quarters she has
        int time = 0;                                                                   //how many times she plays
        System.out.println("How many times has the first machine been played since paying out? ");      //ask for how many times machines have been used
        int machine1 = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out? ");
        int machine2 = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out? ");
        int machine3 = input.nextInt();
        
        while(quarters>=3){                                 //while she still has enough quarters to play
            time+=3;                                        //play 3 times
            quarters -=3;                                   //lose 3 quarters
            
            machine1++;                                     //machines add 1 count
            machine2++;
            machine3++;
            if(machine1==35){                               //cashout for machine 1 at 35 times for 30 quarters, reset to 0 times played
                quarters += 30;
                machine1=0;
            }
            if(machine2==100){                              //cashout for machine 2 at 100 times for 60 quarters, reset to 0 times played
                quarters += 60;
                machine2=0;
            }
            if(machine3==10){                               //cashout for machine 3 at 10 times for 9 quarters, reset to 0 times played
                quarters += 9;
                machine3=0;
            }
        }
        
        
        System.out.println("Martha plays " + time +" times before going broke.");       //output message
        
    }
}
