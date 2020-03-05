package com.Madlib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	testOddness();

    }
    public static void testOddness() {
        //todo even or odd
        //todo keep number contained
        //todo get the last digit


        //We want to find if a number is even or odd
        int number;


        Scanner keyboard;
        keyboard= new Scanner((System.in));

        System.out.println("Give me a positive number ");
        number=keyboard.nextInt();
        System.out.println("Number us even: " + (number % 2 == 0));
        System.out.println("Number is odd: " + (number % 2 != 0));

    }

}

