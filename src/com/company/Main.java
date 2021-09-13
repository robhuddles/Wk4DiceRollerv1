package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Dice Roller version 1 - simple single dice

        /*
        Random rand = new Random();
        int theRoll = rand.nextInt(6) + 1; //random number between 1 and 6
        System.out.println(theRoll);
         */

        //version 2 - roll two dice
        /*
        int total = 0;
        Random rand1 = new Random();
        Random rand2 = new Random();
        int die1 = rand1.nextInt(6) + 1;
        int die2 = rand2.nextInt(6) + 1;
        total = die1 + die2;
        System.out.println("Your rolled " + die1 + " and " + die2 + " for a total of " + total + "!");
        if(die1 == die2){
            System.out.println("You got doubles!");
        }

         */

        //version 3 - lots of dice
       /*
        int total = 0;
        int[] dice = new int[5];
        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        for(int j = 0; j < dice.length; j++){
            msg += "You rolled a "  + dice[j] + "\n";
            System.out.println(msg);
            total += dice[j];
        }

        System.out.println("Your total is " +total);

        */

        //version 4 - enhanced for loop
        /*
        int total = 0;
        int[] dice = new int[6];
        for(int i = 0; i < 6; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        //for(int j = 0; j < dice.length; j++){
        for(int die: dice){
            msg += "You rolled a "  + die + "\n";
            System.out.println(msg);
            total += die;
        }

        System.out.println("Your total is " +total);

         */

        //version 5 - prompt for the number of sides
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("How many die do you want to roll");
        int numDie = input.nextInt();
        int total = 0;
        int[] dice = new int[numDie];

        for(int i = 0; i < numDie; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(6) + 1;
        }

        String msg = "";
        //for(int j = 0; j < dice.length; j++){
        for(int die: dice){
            msg += "You rolled a "  + die + "\n";
            System.out.println(msg);
            total += die;
        }

        System.out.println("Your total is " +total);

         */

        //version 6 - prompt for the number of sides
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the die you want to roll?");
        int numSides = input.nextInt();
        int total = 0;
        //go back to rolling 5 dice
        int[] dice = new int[5];

        for(int i = 0; i < 5; i++){
            Random rand = new Random();
            dice[i] = rand.nextInt(numSides) + 1;
        }

        String msg = "";
        //for(int j = 0; j < dice.length; j++){
        for(int die: dice){
            msg += "You rolled a "  + die + " on a " + numSides + " sided dice\n";
            System.out.println(msg);
            total += die;
        }

        System.out.println("Your total is " + total);

        //challenge (homework) 1: write code to let the user set both number of dice and the number of sides, using XdY syntax
        //i.e., user enters 5d8, meaning five 8-sided dice
        //hint: Google Java's split() function

        //challenge (homework) 2: write code to use a while() loop to let the user continue to roll dice until they decide to stop.
        //You *do not* need to keep track of all of the rolls

        //these can be done in one project

        //test updating in Github
        //added new comment
    }
}
