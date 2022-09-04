package com.cwhjava.course;
import java.util.Scanner;
import java.util.Random;

public class rpsgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num;
        String yourchoice = "";
        String computerchoice = "";
        System.out.println("welcome to game of rock paper scissor");
        System.out.println("please enter your choice \n r for rock \n s for scissor \n p for paper");

        yourchoice = sc.nextLine();
        num = rand.nextInt(3);
        //this will give randam no upto 3 i.e 0,1,2
        if (num==0) {
            computerchoice = "r";
        }
        else if (num==1) {
            computerchoice = "s";
        }
        else if (num==2) {
            computerchoice = "p";
        }
        if (computerchoice.equals("s")) {
            System.out.println("The Computer Choose scissor");

        }
        else if (computerchoice.equals("r")) {
            System.out.println("The Computer Choose Rock");

        }
        else if (computerchoice.equals("p")) {
            System.out.println("The Computer Choose Paper");

        }
        // to declare a winner
        if (yourchoice.equals("r") && computerchoice.equals("s")) {
            System.out.println("congo you won");
        }
        else if (yourchoice.equals("s") && computerchoice.equals("r")) {
            System.out.println("oops! you lost");
        }
        else if (yourchoice.equals("p") && computerchoice.equals("s")) {
            System.out.println("oops! you lost");
        }
        else if (yourchoice.equals("s") && computerchoice.equals("p")) {
            System.out.println("congo you won");
        }
        else if (yourchoice.equals("r") && computerchoice.equals("p")) {
            System.out.println("oops! you lost");
        }
        else if (yourchoice.equals("p") && computerchoice.equals("p")) {
            System.out.println("This is a tie!");
        }
        else if (yourchoice.equals("r") && computerchoice.equals("r")) {
            System.out.println("This is a tie!");

        }
        else if (yourchoice.equals("s") && computerchoice.equals("s")) {
            System.out.println("This is a tie!");
        }
        else if (yourchoice.equals("p") && computerchoice.equals("r")) {
            System.out.println("congo you won");
        }


    }
}


