
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author haidj9901
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //initializing scanner

        //Prompting user for input on important variables
        System.out.println("How many quarters does Martha have in the jar?");
        int quarters = input.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int firstMachine = input.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int secondMachine = input.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int thirdMachine = input.nextInt();

        int plays = 0; //represents how many times shes played (3 machine = 3 plays)\
        
        for (int x = quarters; x >= 3; x -= 3) { //as long as there are at least 3 quarters for her to spend
            plays += 3; //add three to the number of plays (one per machine)
            
            //increment the amount of plays per machine
            firstMachine++;       
            secondMachine++;
            thirdMachine++;
            
            //check the number of plays on each machine to see if it pays out
            if (firstMachine % 35 == 0) {
                x += 30; //add 30 to the collection of quarters
            }
            if (secondMachine % 100 == 0) {
                x += 60; //add 60 to the collection of quarters
            }
            if (thirdMachine % 10 == 0) {
                x += 9; //add 9 to the collection of quarters
            }
        }
        System.out.println("Martha plays " + plays + " times before going broke.");
    }
}
