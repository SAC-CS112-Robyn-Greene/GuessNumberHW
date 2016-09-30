/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumberhw;

/**
 *
 * @author Robyn
 */
import java.util.Random;
import java.util.Scanner;

public class GuessNumberHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //first do guess
        Scanner input = new Scanner(System.in);
        Random num = new Random();
        int number = num.nextInt(11);
        int total = 0;
        int i = 0;
        int average = 0;
        int Guess1 = 0;
        int y =0;
        int n = 0;

        //start game
        for (int Guess = 0; Guess1 != number; Guess++) {

            //start do while
            do {
                System.out.print("Guess a number between 1 to 10: ");
                Guess1 = input.nextInt();
                //Give out errors and corrects on guess 
                if ((Guess1 > number) || (Guess1 < number) ) {                    
                    System.out.println("Your guess wrong.");                   
                   
                } else if ((Guess1 == number)|| (number != 0)) {
                    System.out.println("You have won!");
                    System.out.println(Guess + " guesses");                    
                    System.out.println("Do you wish to play again? yes/no");
                
               // Guess1 = input.nextInt(); 
               // y = input.nextInt(); 
               total = Guess1 + number;
               //number++;
               average = 100 /total ;
               System.out.println("Your average is " + average);
                }i++; //i++ per-increment; ii+1 post increment
                   
            } while (i < 0);         
            // do brackets  
        }//for brackets  
    }//end public class      
}//end main method
