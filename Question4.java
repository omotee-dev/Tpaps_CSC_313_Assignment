import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Step 1: Declare an array of length 10
        int [] array = new int[10];

        //Step 2: Use a loop to assign elements to the array with user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        //Step 3: Use a for-each loop to print out the elements entered by the user
        System.out.println("You entered the following numbers:");
        for (int value:array){
            System.out.println(value);
        }
        scanner.close(); //Close the scanner to avoid leaks
    }
}