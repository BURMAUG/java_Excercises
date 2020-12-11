import java.util.Scanner;

public class business_application{
    public static void main(String args[]){
       
        mean_calculation();

    }
    public static double mean_calculation()
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
        
        return sum;
    }
    
     //standard deviation
    public static void SD( double[] numbers){
        int length = numbers.length; //length of array
        double i = mean_calculation();
        double sum = 0;     // initializing the sum
        for(int indx = 0; indx <numbers.length; indx++){
            double x = Math.pow(numbers[indx], 2);
            sum+= x; // the summations x^2 final
        };

        double standard_deviation = Math.sqrt((sum - (Math.pow(i, 2)/length))/(length-1));

        System.out.println( "mean: "+ i/length + " standard Deviation " + standard_deviation);

    }

}
