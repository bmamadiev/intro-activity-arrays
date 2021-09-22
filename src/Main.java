public class Main {
    public static void main(String[] args) {

        /*************************/
        /* Variables and Numbers */
        /*************************/

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Print the number 16 to the console.
        //
        // Write your code here 
        System.out.println(16);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");
        // - Print the result of the expression six divided by three to the console.
        //
        // Write your code here 
        System.out.println(6 / 3);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        // - Add parenthesis to the expression below so that it prints 16 to the console (instead of 13)
        //
        // Write your code here 

        System.out.println((1 + 3) * 4);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // - Un-comment the following variable, and then on the next line use System.out.println() to print it to the console.
        // Write your code here 

        int myFavoriteNumber = 6;
        System.out.println(myFavoriteNumber);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Five");
        // - create an double variable called "otherNumber", assign the number 4.25 it, and then print it to the console on the next line.
        //
        // Write your code here 
        double otherNumber = 4.25; // I did not add D at the end of the number because I read it is optional. :)
        System.out.println(otherNumber);


        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Six");
        // - Now multiply myFavoriteNumber by otherNumber and assign that to a new double variable called "result".
        // - Then log it to the console
        // Hint: You can multiply with the * operator: For example, 3 * 5 would be 15
        //
        // Write your code here
        double result = myFavoriteNumber * otherNumber;
        System.out.println(result);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Seven");
        // - Create two int Variables, called "a" and "b".  Assign the number 5 to "a" and the number 8 to "b".
        // - Then create a third int variable, "difference".  Subtract b from a and assign the result to the "difference" variable
        // Hint: subtraction uses the - operator
        // Then Print the difference to the console.  (This should print a negative number!)
        //
        // Write your code here 
        int a = 5;
        int b = 8;
        int difference = a - b;
        System.out.println(difference);

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Eight");
        // - For each of the following four things, create a variable with a meaningful name to represent that idea and then assign it a number.
        // - * The number of pets you have
        // - * The number of pairs of sunglasses you own
        // - * The rating from 1-10 you would give to the last meal you ate.
        // - * How many days it has been since you last went to the grocery store.
        // - Remember to use camelCase to name your variables!
        // - Print the value of each of your variables using System.out.println()
        // Hint: One popular way to name a variable representing a number of something is to name it like "numHats" or "numEggsInFridge"
        //
        // Write your code here 
        int numPets = 3;
        int numSunglasses = 2;
        int mealRating = 8;
        int myLastGrocery = 3;
        System.out.println(numPets);
        System.out.println(numSunglasses);
        System.out.println(mealRating);
        System.out.println(myLastGrocery);

        // When you are done, your console output should match the following: (Except your Exercise 9 will be different.)
        /*
        Exercise One
        16
        Exercise Two
        2
        Exercise Three
        16
        Exercise Four
        6
        Exercise Five
        4.25
        Exercise Six
        25.5
        Exercise Seven
        -3
        Exercise Eight
        2
        3
        9
        12
        */


    }
}
