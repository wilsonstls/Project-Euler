package Euler;

import java.util.Scanner;

/** 
* This application will count the total number of enclosed circles in a set of digits. 
* 0 has 1 enclosed circle; 8 has 2 circles; 2 has 0 enclosed circles
* Date:  10/15/2015
* Written by:  Kevin Wilson
*/

 
public class EnclosedCircles { 
 
 
    static int solvePuzzle(int num) {

        int numofCircles;
        int totalCircles = 0;

        while (num > 0) {
            int res = (num % 10);

            switch (res) {
                case 0:
                    numofCircles = 1;
                    break;
                case 4:
                    numofCircles = 1;
                    break;
                case 6:
                    numofCircles = 1;
                    break;
                case 9:
                    numofCircles = 1;
                    break;
                case 8:
                    numofCircles = 2;
                    break;
                default:
                    numofCircles = 0;
            }
            totalCircles = totalCircles + numofCircles;
            num = num / 10;
        }

        return totalCircles;
    }


    public static void main(String[] args) {

        System.out.println("\nEnter a whole number and this program will count the number of enclosed circles in each of the digits:  ");
        Scanner numInput = new Scanner(System.in);
        String numStr = numInput.nextLine();
        int numInt = Integer.parseInt(numStr);

        solvePuzzle(numInt);
        int res = solvePuzzle(numInt);
        System.out.println("\n total enclosed circles:  " + res);

    }

}
