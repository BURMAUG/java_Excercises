//name Burmau Garba
//EXERCISE 7.1*
//INTRO TO JAVA PROGRAMMING AND DATA STRUCTURES

import java.util.Scanner;
public class Sec7_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //GET THE AMOUNT OF ARRAY SIZE
        System.out.println("Enter the number of students: ");
        int students = in.nextInt();
        double[] score = new double[students]; //the size of the array

        for(int i = 0; i < score.length; i++){
            System.out.println("Please enter your score here: ");
            double studScore = in.nextDouble();
            score[i] = studScore;
            if(score[i] >= 100-10)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
            else if(score[i] >= 100 - 20)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
            else if(score[i] >= 100 - 30)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
            else if(score[i] >= 100 - 40)
                System.out.println("Student " + i + " score is " + score[i] + " and grade is D");
            else
                System.out.println("Student " + i + " score is " + score[i] + " and grade is F");
        }

    }
}
