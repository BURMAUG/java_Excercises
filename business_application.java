import java.util.Scanner;

public class business_application{
    public static void main(String args[]){
       
        mean_calculation();

    }
    public static void mean_calculation()
    {
         Scanner input = new Scanner(System.in);
        //double[] numbers;
        double x; 
        System.out.print("Please enter a digit: ");//demand the user to enter at least 10 digits
        x = input.nextDouble();
        double n = 0, sum = 0;
        
        while (n<10){
            System.out.print("Enter another digit: ");
            x = input.nextDouble();
            sum += x;
            n++;
        };
        System.out.println("n is " + n);
        System.out.println("The mean of the entire digits you've entered is: " + sum/n);
    }

    public static void standard_deviation(){
        
    }

}
