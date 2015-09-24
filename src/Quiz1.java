
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        //numb3er of coins in martha's bucket
        System.out.println("How many quarters does Martha have in the jar?");
        int tub = in.nextInt();
        
        //first machine
        System.out.println("How many times has the first machine been played since paying out?");
        int tpm1 = in.nextInt();
        
        //second machine
        System.out.println("How many times has the second machine been played since paying out?");
        int tpm2 = in.nextInt();
        
        //third machine
        System.out.println("How many times has the third machine been played since paying out?");
        int tpm3 = in.nextInt();
        
        //machines pay out times
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        
        //#of times played
        int plays = 0;
        
        //take away the previous plays from the machines
        m1 = m1 + tpm1;
        m2 = m2 + tpm2;
        m3 = m3 + tpm3;
        
        while (tub >= 3){
            
            //made a play
            plays++;
            //used a quarter
            tub--;
            //used the first machine
            m1++;
            //when the machine pays out
            if (m1==35){
                tub = tub+30;
                m1 = 0;
            }
            
            
            //makes a play
            plays++;
            //uses a quarter
            tub--;
            //uses a machine
            m2++;
            //if its the machines payout time
            if (m2==100){
                tub = tub+60;
                m2 = 0;
            }
            
            
            //makes a play
            plays++;
            //uses a quarter
            tub--;
            //uses a machine
            m3++;
            //when machine pays out
            if (m3==10){
                tub = tub+9;
                m3 = 0;
            }
        }
        System.out.println("Martha plays " + plays + " times before going broke.");
    }
}
