
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fathn1690
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //amount of quarters martha has
        System.out.println("How many quarters does Martha have in the jar?");
        
        int initial = input.nextInt();
        
        //first machine
        System.out.println("How many times has the first machine been played since paying out? ");
        
        int first = input.nextInt();
        
        //second machine
        System.out.println("How many times has the second machine been played since paying out?");
        
        int second = input.nextInt();
        
        //third machine
        System.out.println("How many times has the third machine been played since paying out?");
        
        int third = input.nextInt();
        
        //first machine pays 30 every 35
        //second pays 60 every 100
        //third pays 9 every 10
        
        int plays = 0;
        
        int payout1 = 35;
        int payout2 = 100;
        int payout3 = 10;
        
        boolean run = true;
        
        while(run)
        {
            plays = plays + 3;
            
            
                
            for(int i = first; i <= payout1; i++)
            {
                
                if (i == payout1)
                {
                    initial = initial + 30;
                }
             
            }
            
            for(int m = second; m <= payout2; m++)
            {
                
                if (m == payout2)
                {
                    initial = initial + 60;
                }
               
            }
            
            for(int n = third; n <= payout3; n++)
            {
                
                if (n == payout3)
                {
                    initial = initial + 9;
                }
                 
            }
            
            if(initial < 3)
            {
                run = false;
            }
            
        }
        
               
        
        
        System.out.println(plays);
        
        
        
        
        
        
        
        
        
        
    }
}
