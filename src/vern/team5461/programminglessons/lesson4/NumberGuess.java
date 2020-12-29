package vern.team5461.programminglessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        final int guessCount = 3;

        //  three guesses
        int guesses;

        int generatedRandomNumber;

        Random rand = new Random();
        Scanner input = new Scanner(System.in);


        //  guess control loop
        for( guesses = guessCount; guesses > 0; guesses--) {
        // while( guesses > 0 ) {

            //  generate random number for guess
            generatedRandomNumber =  rand.nextInt(10);
            // nextInt is 0 - 9 to make it 1 - 10 add one
            generatedRandomNumber++;

            System.out.println( "gen number:" + generatedRandomNumber );

            // get input from user for number guess

            // display number of guesses left
            System.out.println( "Guesses Left: " + guesses + " of " + guessCount + " left." );

            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println("You entered " + number);

            //  check if correct or not
            if( number == generatedRandomNumber ) {

                // display if incorrect or not
                System.out.println( "You Got It!");
            }
            else {

                // display if incorrect or not
                System.out.println( "Nope!  That is not it!");
            }


            // moving target random number

        }

        // game loop until quit

        // closing the scanner object
        input.close();

    }


}
