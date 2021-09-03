import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ricardo Barrios
 */

public class Solution03
{
    //prompt the user for a quote
    //read in the quote using standard input
    //prompt the user for who said the quote
    //read in the quote using standard input
    //combine the two to output who said the quote followed by the quote

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String speaker = input.nextLine();

        System.out.printf("%s says, \"%s\"", speaker, quote);
    }

}
