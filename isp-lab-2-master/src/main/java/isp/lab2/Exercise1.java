package isp.lab2;
import java.util.Scanner;

public class Exercise1 {

    /**
     * This method should generate an random number between 2 and 10 then
     * should ask user to enter that amount of numbers from keyboard and
     * store the numbers in an int array which should be returned
     *
     * @return the array of numbers read from keyboard
     */
    private static int[] getUserNumbers() {
        int min = 2;
        int max = 10;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Random int = " + random_int);
        
        int[] array = new int[random_int];
        
        System.out.println("Insert " + random_int + " numbers: ");     
        
        for(int i=0; i<array.length; i++)
        {
            Scanner scan = new Scanner(System.in);
            array[i] = scan.nextInt();
        }
        System.out.print("Inserted Numbers are: ");
        for(int i=0; i<array.length; i++)
        {
        System.out.print(array[i] + " ");
        }
        System.out.println("");
        
        return array;
    }

    /**
     * This method should compute the arithmetical mean of the given numbers
     *
     * @param userNumbers the numbers used to calculate the arithmetical mean
     * @return the arithmetical mean of the given numbers
     */
    protected static double computeTheArithmeticalMean(int[] userNumbers) {
        int Sum = 0;
        for(int i=0; i<userNumbers.length; i++)
        {
            Sum += userNumbers[i];
        }
        double AM = (double)Sum/(double)userNumbers.length;
        return AM;
    }

    public static void main(String[] args) {    
        int[] userNumbers = getUserNumbers();
        System.out.println("Mean number is: " + computeTheArithmeticalMean(userNumbers));
    }


}
