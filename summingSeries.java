// import java.util.Scanner;

public class summingSeries {
    public static void main(String[] args) {
       int m = 1;
       sum(m);
//        Scanner scan = new Scanner(System.in);
//
//        //make the first
//        System.out.println("Enter double: ");
//        double nam= scan.nextDouble();
//        double n = 1/(2*(nam)-1);
//        System.out.println(n);

        int i = 1;
        //double j =m(i);
        System.out.println("m -> " +m(i));

    }
    //sum of series
    public static void sum(int i){
        //declaring all variables
        double m, value=0.0;
        double[] array = new double[20];
        double counter  = i;

        //looping through the desired constant
        while (counter <=20){
            m  = counter/(counter+1); //calculating the series
            //System.out.println(counter + " -> " + m);
            array[(int)(counter-1)] = m;//storing the current m in an array
            counter++;
        }
        for (int j = 0; j<array.length; j++){
            value += array[j];
            System.out.println(j+1 + " -> " + value);
        }

    }

    public static double m(double i){
        // double firstFormula = 1 /(2*i - 1);
        double secondFormula = 1/(2*i + 1);

        //i wanna recursively get i down to 0 and the and them together
        //incase when i = 0 return 0 || i = 1 return 1
        if (i == 0 )
            return 0;
        else if (i == 1)
            return 1;
        else
            return secondFormula + m(i-1);

    }
}
