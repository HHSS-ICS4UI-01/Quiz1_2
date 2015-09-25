
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int plays = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many quarters does Martha have in the jar?");
        int startingNum = input.nextInt();
        
        System.out.println("How many times has the first machine been played since paying out?");
        int firstStart = input.nextInt();
        
        System.out.println("How many times has the second machine been played since paying out?");
        int secoundStart = input.nextInt();
        
        System.out.println("How many times has the third machine been played since paying out?");
        int thirdStart = input.nextInt();
        
        for(int i = 0; i < startingNum; i++)
        {
            
            if(firstStart >= 35)  //is at at its point to giveing the coins back
            {
                startingNum += 30;
                firstStart = 0;
            }
            if(secoundStart >= 100) //--
            {
                startingNum += 60;
                secoundStart = 0;
            }
            if(thirdStart >= 10) //--
            {
                startingNum += 9;
                thirdStart = 0;
            }
            
            startingNum-=3;   //went through 3 times so 3 less coins
            
            plays=plays+3;   //number of plays went up by 3
            
            firstStart++;        //add the coin back count
            secoundStart++;      //--
            thirdStart++;        //--
        }
        plays-=3;  //1 too many plays
        System.out.println("Martha plays "+ plays +" times before going broke");
    }
}
