/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author thomt9963
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int machinecount1 = 0;
        int machinecount2 = 0;
        int machinecount3 = 0;
        int count = 0;
        // Variables for machines
        System.out.println("How many quarters does martha have?");
        int quarters = input.nextInt();
        // Amount of beginning quarters


        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = input.nextInt();
        machinecount1 = machinecount1 + machine1;
        // Set machine 1 counter

        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = input.nextInt();
        machinecount2 = machinecount2 + machine2;
        // Set machine 2 counter

        System.out.println("How many times has the Third machine been played since paying out?");
        int machine3 = input.nextInt();
        machinecount3 = machinecount3 + machine3;
        // Set machine 3 counter


        while (quarters > 2) {
            count = count + 3;
            // plays counter
            quarters = quarters - 3;
            // quarters minus machine costs

            machinecount1 = machinecount1 + 1;
            if (machinecount1 == 35) {
                quarters = quarters + 30;
                machinecount1 = 0;
            }
            // machine1 payout and machine counter reset

            machinecount2 = machinecount2 + 1;
            if (machinecount2 == 100) {
                quarters = quarters + 60;
                machinecount2 = 0;
            }
            // machine2 payout and machine counter reset

            machinecount3 = machinecount3 + 1;
            if (machinecount3 == 10) {
                quarters = quarters + 9;
                machinecount3 = 0;
            }
            // machine3 payout and machine counter reset
        }
        System.out.println("Martha can play " + count + " times before going broke.");
    }
}
