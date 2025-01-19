import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        //Step 1: Declare a 2D array of size 10x10
        int [][] array = new int[10][10];

        //Step 2: Use nested loops to assign elements to the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers for a 10x10 array:");

        for (int i = 0; i < array.length; i++) {//Loop through rows
                for (int j = 0; j < array[i].length; j++) {//Loop through columns
                    array[i][j] = scanner.nextInt();
                }
        }

        //Step 3: Use a for each loop to print out the elements
        System.out.println("You enetered the following 10x10 array:");
        for(int[] row : array) {//Loop through each row
            for (int value : row){//Loop through each value in the row
                System.out.print(value + " ");
            }
            System.out.println(); //New line after each row
        }
        scanner.close();//Close the scanner to avoid resource leaks
    }
}