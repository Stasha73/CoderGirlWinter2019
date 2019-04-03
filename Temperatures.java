package org.launchcode;

public class Temperatures {

    public static void main(String[] args) { //start of main
        System.out.println("Temperature Calculator");
        System.out.println();
        System.out.println("The date provided are: ");
        //create a grid listing temperature in rows and columns

        int temp[][] = {  //temperature array
                {68, 70, 76, 70, 68, 71, 75},
                {76, 76, 87, 84, 82, 75, 83},
                {73, 72, 81, 78, 76, 73, 77},
                {64, 65, 69, 68, 70, 74, 72}
        };

        String hours[] = {"7 AM", "3 PM", "7 PM", "3 AM"};  //string array (hours)
        String days[] = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"}; //string array(days)
        //
        for (int row = 0; row < temp.length; row++) { //starts the row for loops
            System.out.print(hours[ row ] + ": ");
            for (int column = 0; column < temp[ row ].length; column++) {// starts the column for loop
                //sum += temp[ row ][ column ];
                System.out.print(temp[ row ][ column ] + " ");
            } //ends the column for loop
            System.out.println();
        } //ends the row for loops
        System.out.println();

        System.out.println("Based on that data, the following are the average temperatures for the week");
        //calculate the average temperatures for the week
        //column becomes the outer loop, iterates first
        int sum = 0;
        for (int column = 0; column < days.length; column++) { //starts the column for loop (outer loop)
            System.out.print(days[ column ] + ": ");

            for (int row = 0; row < hours.length; row++) {

                //calculate the sum of the elements of the columns
                sum += temp[ row ][ column ];

            }
            System.out.print(sum / hours.length);
            sum = 0;
            //sum = 0 resets the loop in order to get the average each day of the week
            System.out.println();

        }
        System.out.println("  ");
        //calculate the average of the temperature per specific time of the day
        int sum2 = 0;

        for (int row = 0; row < hours.length; row++) { //starts the row loop (outer loop)
            System.out.print(hours[ row ] + ": ");
            //sum 2 = 0 resets in order to calculate the average per specific time of the day (per row)
            sum2= 0;
            for (int column = 0; column < days.length; column++) {
                sum2 += temp[ row ][ column ];
            }
            System.out.println(sum2 / days.length);


        }
        System.out.println();
        //calculate the final average temperature for the week
        System.out.println("The final average temperature for the week was: ");
        System.out.println();
        int sum3 = 0;
        int totalAverage = 0;
        for (int row = 0; row < hours.length; row++) {
            for (int column = 0; column < days.length; column++) {
                sum3 += temp[ row ][ column ];
            }

        }

        totalAverage = hours.length * days.length;
        System.out.print("Overall: " + sum3/totalAverage);


    }
}








    
















