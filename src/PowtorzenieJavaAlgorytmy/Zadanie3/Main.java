package PowtorzenieJavaAlgorytmy.Zadanie3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-09-07.
 */
public class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me number of random numbers: ");
        int amount = sc.nextInt();
        int negative = 0;
        int positive = 0;
        int minValue = 100;
        int maxValue = -100;
        Random rand = new Random();
        int randomNumber;
        for (int i = 1; i < amount ; i++) {
            randomNumber = rand.nextInt(200)-100;
            if (randomNumber > 0) {
                positive++;
                if(randomNumber >= maxValue) {
                    maxValue = randomNumber;
                }
            }
            else if (randomNumber < 0) {
                negative++;
                if(randomNumber <= minValue){
                    minValue = randomNumber;
                }
            }
        }
        System.out.printf("Number of random numbers: %d, radio positive/negative %.3f, maxValue: %d, minValue %d ", amount, (double) positive / (double) negative, maxValue, minValue);
        
    }
}
