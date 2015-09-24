
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Quiz1
{

    public static void main(String[] args)
    {
        //Create the scanner called stuff
        Scanner stuff=new Scanner(System.in);
        //create the intiger named marthaQuaters
        int marthaQuaters;
        //create the intiger named slotOne
        int slotOne;
        //create the intiger named slotTwo
        int slotTwo;
        //create the intiger named slotThree
        int slotThree;
        //create the intiger named plays, and make it equal to zero
        int plays=0;
        
        //output to the console in a line: "How many quarters does Martha have in the jar?"
        System.out.println("How many quarters does Martha have in the jar?");
        //take the intiger marthaQuaters and make it equale to a inputed number
        marthaQuaters=stuff.nextInt();
        
        //output to the console in a line: "How many times has the first machine been played since paying out?"
        System.out.println("How many times has the first machine been played since paying out?");
         //take the intiger slotOne and make it equale to a inputed number
        slotOne=stuff.nextInt();
        
        //output to the console in a line: "How many times has the second machine been played since paying out?"
        System.out.println("How many times has the second machine been played since paying out?");
         //take the intiger slotTwo and make it equale to a inputed number
        slotTwo=stuff.nextInt();
        
        //output to the console in a line: "How many times has the third machine been played since paying out?"
        System.out.println("How many times has the third machine been played since paying out?");
         //take the intiger aslotThree and make it equale to a inputed number
        slotThree=stuff.nextInt();
        
        //while the intiger martgaQuaters is equal-or-greater to three then loop:
        while(marthaQuaters>=3)
        {
            //the intiger marthaQuaters is equal to itself minus three
            marthaQuaters= marthaQuaters-3;
            //the intiger plays is equal to itself plus one
            plays++;
            //the intiger slotOne is equal to itself plus one
            slotOne++;
            //the intiger slotTwo is equal to itself plus one
            slotTwo++;
            //the intiger slotThree is equal to itself plus one
            slotThree++;
            
            
            //if the iniger slotOne is greater-or-equal to 35 then:
            //-the intiger marthaQuaters is equal to itself plus thirty
            //-the intiger slotOne is equal to zero
            if (slotOne>=35) 
            {
                //
                marthaQuaters=marthaQuaters+30;
                slotOne=0;
            }
            
            
            //if the iniger slotTwo is greater-or-equal to 100 then: 
            //-the intiger marthaQuaters is equal to itself plus sixty
            //-the intiger slotTwo is equal to zero
            if (slotTwo>=100) 
            {
                marthaQuaters=marthaQuaters+60;
                slotTwo=0;
            }
            
            
            //if the iniger slotThree is greater-or-equal to 10 then:
            //-the intiger marthaQuaters is equal to itself plus nine
            //-the intiger slotThree is equal to zero
            if (slotThree>=10)
            {
                marthaQuaters=marthaQuaters+9;
                slotThree=0;
            }

        }
        
        //output to the console: "
        System.out.println("Martha plays " +(3*plays) +" times before going broke.");
    }
}
