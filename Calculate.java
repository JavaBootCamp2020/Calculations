import java.util.Scanner;
import java.lang.String;

/*Author: Gil Silva
1. Calculate the sum of two
2. Calculate the product of two.
3. Print the sum and product of both obtained results.
4. Find the square of a number.
5. Concatenate 2 strings
 */

public class Calculate {
    public static void main(String[] args){
        //Create two int variables
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);


        //Ask user for input
        System.out.println("Please enter a whole number: ");
        num1 = sc.nextInt();
        System.out.println("Now, enter another whole number: ");
        num2 = sc.nextInt();

        //Create a variable that adds the numbers
        int sum = num1 + num2;
        //Creates a variable that multiplies the numbers
        int product = num1 * num2;

        System.out.println("The sum of the two integers is: " + sum +
                "\nThe product of the two integers is: " + product);

        System.out.println("... and now this: \nLet's find the square of a new number (integers only please):");
        int num3 = sc.nextInt();

        //Calculate the square of a given number
        int squareNum = num3*num3;
        System.out.println(num3 + " to the power of 2 is " + squareNum);

        //Solvers the scanner buffer issue
        sc.nextLine();


        System.out.println("Enter two words or short sentences below:  ");
        String input1  = sc.nextLine();
        //System.out.println("Input 2: ");
        String input2 = sc.nextLine();

        System.out.println(input1 + " " + input2);

        System.out.println("Goodbye.");


    }
}
