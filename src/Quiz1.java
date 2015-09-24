
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vonhn0812
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);                                                      //scanner for input
        System.out.println("How many quarters does Martha have in the jar?");                       //asking for number of quarters
        int total = scan.nextInt();     //variable for total number of quarters
        System.out.println("How many times has the first machine been played since paying out?");   //asking for number of times first machine has been played
        int machine1 = scan.nextInt();  //variable for number of plays for machine 1
        System.out.println("How many times has the second machine been played since paying out?");  //asking for number of times second machine has been played
        int machine2 = scan.nextInt();  //variable for number of plays for machine 2
        System.out.println("How many times has the third machine been played since paying out?");   //asking for number of times third machine has been played
        int machine3 = scan.nextInt();  //variable for number of plays for machine 3
        int count = 0;                  //variable for total times played
        while (total > 2) {             //while she has more than 2 quarters she can play
            count += 3;                 //each time she plays three machines
            if (machine1 == 35) {       //when machine one reaches 35 plays it will reset and reward her 30 quarters
                machine1 = 0;           //reset machine 1
                total += 30;            //add 30 quarters to her total quarters
            }
            if (machine2 == 100) {      //when machine two reaches 100 plays it will reset and reward her 60 quarters
                machine2 = 0;           //reset machine 2
                total += 60;            //add 60 to her total
            }
            if (machine3 == 10) {       //when machine three reaches 10 plays it will reset and reward her 9 quarters
                machine3 = 0;           //reset machine 3
                total += 9;             //add 9 to her total
            }
            machine1++;                 //add one play to machine 1
            machine2++;                 //add one play to machine 2
            machine3++;                 //add one play to machine 3
            total -= 3;                 //take away three of her quarters

        }

        System.out.println("Martha plays " + count + " times before going broke.");                    //output

    }
}
