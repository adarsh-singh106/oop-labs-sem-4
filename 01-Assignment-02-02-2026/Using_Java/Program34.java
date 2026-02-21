/*
Program 34
Java program to check whether a generated random number is even or odd
*/

import java.util.Random;

public class Program34 {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt(100); // 0 to 99
        System.out.println("Generated random number: " + randomInt);

        if (randomInt % 2 == 0) {
            System.out.println("It is Even");
        } else {
            System.out.println("It is Odd");
        }
    }
}