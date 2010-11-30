

import java.util.Scanner;
public class Quiz

{

	public static void main(String [] args)
	{
          ///Declaring Variables
		int correctAnswer = 0 ;
		int incorrectAnswer = 0 ;
		int quizChoice = 0;
        final int option_one = 1;
		final int option_two = 2;
		final int option_three = 3;
		final int option_four = 4;
		   ///Creating scanner, and setting up questions
		Scanner input = new Scanner(System.in);
		System.out.println
		   ("Who was the original drummer for the Ramones?");
        System.out.print("Enter\n " + option_one + " for Joey Ramone\n " +
         option_two + " for Dee Dee Ramone\n " +  option_three + " for Tommy Ramone\n " +
         option_four + " for Marky Ramone ");
        quizChoice = input.nextInt();
        if(quizChoice != 1)
        {
	       /// All incorrect and correct answers for each question can incremented by 1
	        incorrectAnswer = incorrectAnswer + 1;
	        System.out.println("You are wrong! The answer is " + option_one + " Joey Ramone ");

        }
        else
           {
	         correctAnswer = correctAnswer + 1;
             System.out.println(" You are Correct! the answer is " + option_one + " Joey Ramone ");
           }
        System.out.println
		   ("\nWho is the elventh Doctor Who?");
        System.out.print("Enter\n " + option_one + " for Christopher Eccleston\n " +
         option_two + " for Steven Patrick Morrissey\n " +  option_three + " for Joel Hodgson\n " +
         option_four + " for Matt Smith ");
        quizChoice = input.nextInt();

        if(quizChoice != 4)
        {
	        incorrectAnswer = incorrectAnswer + 1;
	        System.out.println(" You are wrong! The answer is " + option_four + " Matt Smith\n ");

        }
        else
           {
	           correctAnswer = correctAnswer + 1;
             System.out.println(" You are Correct! the answer is " + option_four + " Matt Smith! ");
           }
         System.out.println
		   ("\nWho is the unofficial seventh member of Monty Python? ");
        System.out.print("Enter\n " + option_one + " for Dylan Moran\n " +
         option_two + " for Carol Cleveland\n " +  option_three + " for Connie Booth\n " +
         option_four + " for Terry Gilliam ");
        quizChoice = input.nextInt();
        if(quizChoice != 2)
        {
	        incorrectAnswer = incorrectAnswer + 1;
	        System.out.println("You are wrong! The answer is " + option_two + " Carol Cleveland ");
	    }
        else
           {
	         correctAnswer = correctAnswer + 1;
             System.out.println(" You are Correct! the answer is " + option_two + " Carol Cleveland! ");
           }
         System.out.println
		   ("\nWho wrote the comic series The Sandman ");
        System.out.print("Enter\n " + option_one + " for Neil Gaiman\n " +
         option_two + " for Dave McKean\n " +  option_three + " for Alan Moore\n " +
         option_four + " for Warren Ellis ");
         quizChoice = input.nextInt();
        if(quizChoice != 1)
        {
	        incorrectAnswer = incorrectAnswer + 1;
	        System.out.println("You are wrong! The answer is " + option_one + " Neil Gaiman ");
	    }
	    else
           {
	         correctAnswer = correctAnswer + 1;
             System.out.println(" You are Correct! the answer is " + option_one + " Neil Gaiman! ");
           }
           System.out.println
		   ("\nWho killed Laura Palmer?");
        System.out.print("Enter\n " + option_one + "  Bob/Leland Palmer\n " +
         option_two + " Leland Palmer\n " +  option_three + " Harry S. Truman\n " +
         option_four + " Leo Johnson ");
        quizChoice = input.nextInt();

        if(quizChoice != 1)
        {
	        incorrectAnswer = incorrectAnswer + 1;
	        System.out.println("You are wrong! The answer is " + option_one + " Bob/Leland Palmer ");

        }
        else
           {
	         correctAnswer = correctAnswer + 1;
             System.out.println(" You are Correct! the answer is " + option_one + " Bob/Leland Palmer ");
             }
              ///Prints out the correct answers, the incorrect answers, and the overall score.
           System.out.println("\n You answered " + correctAnswer + " correct ");
           System.out.println("\n You answered " + incorrectAnswer + " incorrect ");
           System.out.println(" \nYour score for this test is " +(correctAnswer * 20) + "%");

    }
}


		