
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kampn2687
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///setup scanner
        Scanner in = new Scanner(System.in);
        //make varriables for how many quarters and how many times each machine has been used
        int q;
        int m1;
        int m2;
        int m3;
        int p = 0;
        //collect number of quarters Martha has
        System.out.println("How mant quarters does Martha have in the jar?");
        q = in.nextInt();
        //collect number of times machine 1 has been used
        System.out.println("How many times has the first machine been played since paying out?");
        m1 = in.nextInt();
        //collect number of times machine 2 has been used
        System.out.println("How many times has the second machine been played since paying out?");
        m2 = in.nextInt();
        //collect number of times machine 3 has been used
        System.out.println("How many times has the third machine been played since paying out?");
        m3 = in.nextInt();
        // creat while loop where quarters are the i varriable 
        // when i > 3 then the loop breaks
        while(q > 2){
            q -= 3;
            m1++;
            m2++;
            m3++;
            p += 3;
            if(m1 == 35){
                m1= 0;
                q=q+30;   
            }
            if(m2 == 100){
                m2= 0;
                q=q+60;     
            }if(m3 == 10){
                m3= 0;
                q=q+9;  
            }
        }
        System.out.println("Martha plays " + p +" times before going broke." );   
    }
}
