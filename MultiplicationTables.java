package org.launchcode;

import java.util.Scanner;

public class MultiplicationTables {

    public static void main(String[] args) {
	// write your code here
    // multiplication table based on print size
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Multiplication Tables" + "\n");

    System.out.print("How large would you like to see them? ");
    int size = keyboard.nextInt();
    System.out.println();
    for( int rows =0; rows <= size; rows++){
        for(int columns = 0; columns <= size; columns++)
        {
            System.out.println(rows + " * " + columns + " = " + rows * columns);
        }
    }

    }
}
