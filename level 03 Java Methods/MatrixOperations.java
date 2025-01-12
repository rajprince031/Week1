import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        int rows1 = 3, cols1 = 3; // Dimensions of matrix 1
        int rows2 = 3, cols2 = 3; // Dimensions of matrix 2

        // Create random matrices
        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);

        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform matrix operations
        int[][] sum = addMatrices(matrix1, matrix2);
        int[][] difference = subtractMatrices(matrix1, matrix2);
        int[][] product = multiplyMatrices(matrix1, matrix2);

        // Display results
        System.out.println("Sum of matrices:");
        displayMatrix(sum);
        System.out.println("Difference of matrices:");
        displayMatrix(difference);
        System.out.println("Product of matrices:");
        displayMatrix(product);

        // Transpose of matrix 1
        int[][] transpose1 = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transpose1);

        // Determinant of matrix 1 (assuming it's a 3x3 matrix)
        if (matrix1.length == 3 && matrix1[0].length == 3) {
            int determinant1 = determinant3x3(matrix1);
            System.out.println("Determinant of Matrix 1: " + determinant1);
        } else {
            System.out.println("Determinant calculation is not supported for non-3x3 matrices.");
        }

        // Inverse of matrix 1 (assuming it's a 3x3 matrix and invertible)
        if (matrix1.length == 3 && matrix1[0].length == 3 && determinant3x3(matrix1) != 0) {
            double[][] inverse1 = inverse3x3(matrix1);
            System.out.println("Inverse of Matrix 1:");
            displayMatrix(inverse1);
        } else {
            System.out.println("Matrix 1 is not invertible.");
        }
    }

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Generate random numbers between 0 and 9
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] difference = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Ensure the matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of Matrix 1 must equal number of rows of Matrix 2.");
            return null;
        }

        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return product;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to calculate the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3 for determinant calculation.");
        }

        // Determinant formula for a 3x3 matrix:
        // |A| = a(ei - fh) - b(di - fg) + c(dh - eg)
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    // Method to calculate the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            throw new IllegalArgumentException("Matrix is not invertible because determinant is 0.");
        }

        double[][] inverse = new double[3][3];

        // Calculating the inverse using the adjugate matrix formula
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];

        inverse[0][0] = (e * i - f * h) / (double) det;
        inverse[0][1] = (c * h - b * i) / (double) det;
        inverse[0][2] = (b * f - c * e) / (double) det;
        inverse[1][0] = (f * g - d * i) / (double) det;
        inverse[1][1] = (a * i - c * g) / (double) det;
        inverse[1][2] = (c * d - a * f) / (double) det;
        inverse[2][0] = (d * h - e * g) / (double) det;
        inverse[2][1] = (b * g - a * h) / (double) det;
        inverse[2][2] = (a * e - b * d) / (double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // Overloaded method to display a matrix with double values (for inverse matrix)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(String.format("%.2f", value) + "\t");
            }
            System.out.println();
        }
    }
}
