/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06{

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        int age, retire, x, answer;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("What is your current age?");
        age = input.nextInt();

        System.out.println("At what age would you like to retire?");
        retire = input.nextInt();

        x = retire - age;

        answer = year + x;

        System.out.println("It is " + year + ", so you can retire in " + answer);

    }
}