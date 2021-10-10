package isp.lab2;
import java.util.Scanner;

public class Exercise2 {

    /**
     * This method should ask user to enter an int which represent
     * the number of points a team have
     *
     * @return the number of points entered by user
     */
    private static int readNumberOfPoints() {
        System.out.println("Insert nr of points: ");      
        Scanner scan = new Scanner(System.in);
        int points = scan.nextInt();
        return points;
    }

    /**
     * This method should return a message according with the specifications
     *
     * @param numberOfPoints the number of points entered by user
     * @return The appropriate message
     */
    public static String messageToUser(int numberOfPoints) {
        String out;
        switch(numberOfPoints)
        {
            case 49:
                out = "CFR Cluj has ";
                break;
            case 46:
                out = "Universitatea Craiova";
                break;  
            case 43:
                out = "FCSB";
                break;
            case 42:
                out = "FC Botosani";
                break;
            case 40:
                out = "Gaz Metan";
                break;
            case 39:
                out = "Astra Giurgiu";
                break;
            default:
                out = "No team from Liga 1 have " + numberOfPoints + " points";
                break;
        }

        return out;
    }

    public static void main(String[] args) {
        System.out.println("The message to show to user is:");
        System.out.println(messageToUser(readNumberOfPoints()));
    }
}
