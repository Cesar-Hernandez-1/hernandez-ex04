/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*  Pseudocode:
 *  Declare Scanner object "input" to receive input from user
 *  Ask user to enter a noun and store input in "noun" string variable
 *  Ask user to enter a verb and store input in "verb" string variable
 *  Ask user to enter an adjective and store input in "adjective" string variable
 *  Ask user to enter an adverb and store input in "adverb" string variable
 *  Use printf() function to display and form a silly sentence using the variables stored with the user input
 *
 */

package exercise04;
import java.util.Scanner;
public class Solution04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = input.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = input.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
