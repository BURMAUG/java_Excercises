package chap13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * WRITE A PROGRAM THAT MEETS THE FOLLOWING
 *
 * 1,   Create an array of with 100 randomly selected numbers
 * 2,   prompt the user to enter the index of the array, then displays the corresponding value.
 *      if the specified index is out of bounds display the following to the user without crashing the app
 *      "out of bounds".
 *
 * */
public class ArrayOutBoundEx {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random rand = new Random();

        for ( int i =0; i < numbers.length; i++)
        {
            int randoms = rand.nextInt(1000);
            numbers[i] = randoms;
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("What do you think the number of array is: ");
        int idx = scan.nextInt();
        try {
            if(idx >= numbers.length)
                throw new ArrayIndexOutOfBoundsException("OUT OF BOUNDS");
            else
                System.out.println("Here is the number at index " + idx + " is: " + numbers[idx]);
        }catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("still running");
        }
    }
}
