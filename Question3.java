import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        //Array with the given data
        int [] array = {2, 5, 5, 9, 4, 7, 9, 6, 11, 12};

        //Calculate and print the mean
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);

        //calculate and print the median
        double median = calculateMedian(array);
        System.out.println("Median: " + median);

        //Calculate and print the standard deviation
        double stdDev =  calculateStandardDeviation(array, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    //Method to calculate the mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    //Method to calculate the median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); //Sort the array
        int n = array.length;

        //If odd, return the middle element. If even, return the aveerage
        if (n % 2 != 0) {
            return array[n / 2];
        } else {
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        }
    }

    //Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumOfSquares = 0;
        for (int num : array) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquares / array.length);
    }
}