package javaExcercises;
import static java.lang.System.nanoTime;
import static java.lang.System.out;
import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int goalForVeggies = 50;
        out.println("Checking sales goals");
        out.println("The sales goal for veggie sandwhiches is " + goalForVeggies);
        int veggiesSold;
        out.println("How many veggie sandwiches were sold today?");
        veggiesSold = keyboard.nextInt();
        out.print("\n");

        if (veggiesSold == goalForVeggies) {
            out.print("Meets goal ");
        } else if (veggiesSold < goalForVeggies)
            out.print("Fell short ");
        if (veggiesSold > goalForVeggies)
            out.print("Meets goal ");
        out.println("\n");

        int goalForBurgers = 250;
        out.println("The sales goal for burgers is " + goalForBurgers);
        int burgersSold;
        out.println("How many burgers were sold today?");
        burgersSold = keyboard.nextInt();
        out.println("\n");

        if (burgersSold == goalForBurgers) {
            out.print("Meets goal ");
        } else if (burgersSold < goalForBurgers) {
            out.print("Fell short ");
        }
        if (burgersSold > goalForBurgers) {
            out.print("Meets goal ");
        }
        out.println("\n");

        int goalForSubs = 180;
        out.println("The sales goal for subs is " + goalForSubs);
        int subsSold;
        out.println("How many subs were sold today?");
        subsSold = keyboard.nextInt();
        out.println("\n");

        if (subsSold == goalForSubs) {
            out.print("Meets goal ");
        } else if (subsSold < goalForSubs) {
            out.print("Fell short ");
        }
        if (subsSold > goalForSubs) {
            out.print("Meets goal ");
        }
        out.println("\n}");

        int goalForSoup = 70;
        out.println("The sales goal for soup is " + goalForSoup);
        int soupsSold;
        out.println("How many soups were sold today?");
        soupsSold = keyboard.nextInt();
        out.println("\n");

        if (soupsSold == goalForSoup) {
            out.print("Meets goal ");
        } else if (soupsSold < goalForSoup) {
            out.print("Fell short ");
        }
        if (soupsSold > goalForSoup) {
            out.print("Meets goal ");
        }
        out.println("\n");
        if (veggiesSold >= 50 && burgersSold >= 250 && subsSold >= 180
                    && soupsSold >= 70)
        {
            out.println("Made goal for everything!");
        }



    }
}


