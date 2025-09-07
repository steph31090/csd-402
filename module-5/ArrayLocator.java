/*Stephanie Ramos
 * September 7, 2025
 * Module 5 Assignment
 */

 // The purpose of this program is to locate the largest and smallest values in a 2D array of both integers and doubles.

public class ArrayLocator {
    //Locate Largest (double)
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate Largest (int)
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate Smallest (double)
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate Smallest (int)
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        double[][] doubleArray = {
                {1.5, 2.3, 3.1},
                {4.0, 5.6, 0.9},
                {7.8, 8.2, 6.4}
        };

        int[][] intArray = {
                {1, 2, 3},
                {4, 5, 0},
                {7, 8, 6}
        };

        int[] largestDoubleLocation = locateLargest(doubleArray);
        System.out.println("Largest double located at: (" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + ")");

        int[] largestIntLocation = locateLargest(intArray);
        System.out.println("Largest int located at: (" + largestIntLocation[0] + ", " + largestIntLocation[1] + ")");

        int[] smallestDoubleLocation = locateSmallest(doubleArray);
        System.out.println("Smallest double located at: (" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + ")");

        int[] smallestIntLocation = locateSmallest(intArray);
        System.out.println("Smallest int located at: (" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + ")");
    }
}
