//Kenneth Smith
//7-27-2024
//11.2

public class MyArrays {
        // Method to locate the largest element in a 2D double array
        public static int[] locateLargest(double[][] arrayParam) {
            int[] location = new int[2]; 
            double max = Double.NEGATIVE_INFINITY; 
    
            for (int i = 0; i < arrayParam.length; i++) {
                for (int j = 0; j < arrayParam[i].length; j++) {
                    if (arrayParam[i][j] > max) {
                        max = arrayParam[i][j];
                        location[0] = i; // Row index
                        location[1] = j; // Column index
                    }
                }
            }
            return location;
        }
    
        //Method for locating the largest element in a 2D int array
        public static int[] locateLargest(int[][] arrayParam) {
            int[] location = new int[2]; 
            int max = Integer.MIN_VALUE; 
    
            for (int i = 0; i < arrayParam.length; i++) {
                for (int j = 0; j < arrayParam[i].length; j++) {
                    if (arrayParam[i][j] > max) {
                        max = arrayParam[i][j];
                        location[0] = i; // Row index
                        location[1] = j; // Column index
                    }
                }
            }
            return location;
        }
    
        // Method for locatating the smallest element in a 2D double array
        public static int[] locateSmallest(double[][] arrayParam) {
            int[] location = new int[2];
            double min = Double.POSITIVE_INFINITY; 
    
            for (int i = 0; i < arrayParam.length; i++) {
                for (int j = 0; j < arrayParam[i].length; j++) {
                    if (arrayParam[i][j] < min) {
                        min = arrayParam[i][j];
                        location[0] = i; // Row index
                        location[1] = j; // Column index
                    }
                }
            }
            return location;
        }
    
        // Method for locating the smallest element in a 2D int array
        public static int[] locateSmallest(int[][] arrayParam) {
            int[] location = new int[2]; 
            int min = Integer.MAX_VALUE; 

            for (int i = 0; i < arrayParam.length; i++) {
                for (int j = 0; j < arrayParam[i].length; j++) {
                    if (arrayParam[i][j] < min) {
                        min = arrayParam[i][j];
                        location[0] = i; // Row index
                        location[1] = j; // Column index
                    }
                }
            }
            return location;
        }
    
        // Main method for testing displaying results
        public static void main(String[] args) {
            double[][] doubleArray = {
                {4.6, 5.7, 6.6},
                {5.3, 2.1, 7.5},
                {8.9, 3.5, 1.6}
                };
    
            int[] largestDouble = MyArrays.locateLargest(doubleArray);
            System.out.println("Largest element in double array is at: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
    
            int[] smallestDouble = MyArrays.locateSmallest(doubleArray);
            System.out.println("Smallest element in double array is at: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
    
            int[][] intArray = {
                {5, 3, 2},
                {6, 7, 9},
                {4, 3, 3}
            };
    
            int[] largestInt = MyArrays.locateLargest(intArray);
            System.out.println("Largest element in int array is at: (" + largestInt[0] + ", " + largestInt[1] + ")");
    
            int[] smallestInt = MyArrays.locateSmallest(intArray);
            System.out.println("Smallest element in int array is at: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
        
        }
    }

