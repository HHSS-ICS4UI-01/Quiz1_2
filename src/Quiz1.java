
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rayan4858
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        Scanner input = new Scanner(System.in);

        System.out.println("How many quarters does Martha have in the jar?");
        int q = input.nextInt();//quarters
        System.out.println("How many times has the first machine been played since paying out?");
        int fm = input.nextInt();//first machine
        System.out.println("How many times has the second machine been played since paying out?");
        int sm = input.nextInt();//second machine 
        System.out.println("How many times has the third machine been played since paying out?");
        int tm = input.nextInt();//third machine
        int counter = 0;//starts counter at 0 
        
        
        for (; q >= 3;) { //if  she has 3 or more quarters then run the loop
            
            fm++; //adds 1 to first machine counter 
            sm++; //adds 1 to second machine counter 
            tm++; //adds 1 to third machine counter 
            q -= 3; //takes away 3 from quarters 
            
            counter += 3; // add 3 to counter of how many  times she has played
            //if first  machine gets to 35th roll them add 30 to quarters and reset the machine counter
            if (fm == 35) {
                q += 30;
                fm = 0;
            }
            //if second machine gets to 100th roll them add 60 to quarters and reset the machine counter
            if (sm == 100) {
                q += 60;
                sm = 0;
            }
            //if third machine gets to 10th roll them add 9 to quarters and reset the machine counter
            if (tm == 10) {
                q += 9;
                tm = 0;
            }
            
        }

        System.out.println("Martha plays " + counter + " times before going broke.");

    }
}
