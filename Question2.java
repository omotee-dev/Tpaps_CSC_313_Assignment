public class Question2 {
    public static void main(String[] args) {
        int rowsStars = 9;
        int starsPerRow = 9;
        int totalStripes = 18;

        for (int i = 0; i < rowsStars; ++i) {
            for (int j = 0; j < starsPerRow; ++j) {
                if (j % 2 == i % 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("= = = = = = = = = = = = =");
            System.out.println();
        }

        for (int i = 0; i < totalStripes - rowsStars; ++i) {
            System.out.println("= = = = = = = = = = = = = = = = = =");
            }
        }
    }