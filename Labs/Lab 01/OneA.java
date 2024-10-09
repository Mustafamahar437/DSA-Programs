import java.util.Arrays;

public class OneA {
   
    public static void noDup(int[][] twoDArray) {
       

        int numRows = twoDArray.length;
        int numCols = twoDArray[0].length;
        int[] tempArray = new int[numRows * numCols];
        int index = 0;

        // Flatten the 2D array into a temporary 1D array
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                tempArray[index] = twoDArray[i][j];
                index++;
            }
        }

        // Print unique elements
        System.out.print("Unique elements: ");
       for (int i = 0; i < tempArray.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int j = 0; j < i; j++) {
                if (tempArray[i] == tempArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If it's not a duplicate, print it
            if (!isDuplicate) {
                System.out.print(tempArray[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
       
        int[][] twoDArrayWithDuplicates = {
            {1, 2, 3, 1, 5},
            {2, 7, 8, 9, 10},
            {11, 2, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        noDup(twoDArrayWithDuplicates);
    }
}