import java.util.Arrays;
public class displaySortedNumbers{
    public static void main(String args[]){
        double number1 = 23;
        double number2 = 234;
        double number3 = 32;
        displaySortedNumbersMethod(number1, number2, number3);
    }
    public static void displaySortedNumbersMethod(double number1, double number2, double number3){
        double[] numbers = {number1, number2, number3} ;

        for(int i = 0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                double temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
