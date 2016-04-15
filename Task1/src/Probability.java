/**
 * Created by alejandropuente on 4/5/16.
 */

import java.util.Random;
// import java.util.*;
import java.util.Scanner;

//public class Probability {
//    public static void main(String[] args) {
//        int nRolls = 100, nDice = 6; // default values
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Number of throws: ");
//        nRolls = in.nextInt();
//        System.out.print("Number of sides on the dices: ");
//        nDice = in.nextInt();
//
//        int minSum = 2, maxSum = 2 * nDice;
//        int[] hist = new int[maxSum - minSum + 1];
//
//        Random rand = new Random();
//        for (int iter = 1; iter <= nRolls; iter++) {
//            int throw1 = 1 + rand.nextInt(nDice), throw2 = 1 + rand.nextInt(nDice);
//            int sum = throw1 + throw2;
//            hist[sum - minSum]++;
//        }
//
//        System.out.println("Number of rolls: " + nRolls);
//        System.out.println("Number of sides of the dice: " + nDice);
//        System.out.println("Sum of Dice         Percentage");
//        for (int i = 0; i < hist.length; i++) {
//            System.out.println(String.format("   %2d                 %5.2f%%", i + minSum, hist[i] * 100.0 / nRolls));
//            // System.out.println("   " + (i+minSum) + "             " + (hist[i]*100.0/nRolls);
//        }
//
//        in.close();
//    }
//}

public class Probability{
    public static void main(String[] args) {
        double event = 0, event2 = 0, outcome = 0, outcome2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of events for A");
        event = in.nextInt();
        System.out.print("Enter number of outcomes for A ");
        outcome = in.nextInt();
        System.out.print("Enter number of events for B ");
        event2 = in.nextInt();
        System.out.print("Enter number of outcomes for B ");
        outcome2 = in.nextInt();


        double probA = (event / outcome) * 100;
        probA = Math.floor(probA);
        System.out.println("P(A): " + probA);
        double probB = (event2 / outcome2 ) * 100;
        probB = Math.floor(probB);
        System.out.println("P(B): " + probB);

        double probAB = (((probA/100) * (probB/100))*100);
        System.out.println("P(AB): " + probAB);

        double probAorB = (((probA/100) + (probB/100))*100);
        System.out.println("P(A|B): " + probAorB);


    }
}






//        int[] total = new int[sides];
//
//        Random rand = new Random();
//        for(int iteration = 0; iteration < rolls; iteration++){
//            int dice = 1 + rand.nextInt(sides); // This gives me the number rolled
//
//
//            total[iteration] = dice;
//
//        }
//
//        System.out.println("Number of rolls: " + rolls);
//        System.out.println("Number of sides of the dice: " + sides);
//        System.out.println("Sum of Dice         Percentage");
//        for (int i = 0; i < total.length; i++) {
//            System.out.println(String.format("   %2d                 %5.2f%%", i + 1, total[i] * 100.0 / rolls));
            // System.out.println("   " + (i+minSum) + "             " + (hist[i]*100.0/nRolls);
//        }
//    }
//}
