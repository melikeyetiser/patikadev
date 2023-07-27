public class Main {
    public static void main(String[] args) {
        // finding matrix transpose

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
        // dimensions of the matrix are interchanged
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        System.out.println("The original matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Its transpose matrix is: ");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}