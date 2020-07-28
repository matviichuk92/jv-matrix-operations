package core.basesyntax;

/**
 * Реалізуйте методи для знаходження головної та побічної діагоналі квадратної матриці,
 * максимального та мінімального елементів.
 */
public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int[] counterDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            counterDiagonal[i] = matrix[i][matrix.length - 1 - i];
        }
        return counterDiagonal;
    }

    public int getMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] innerArray : matrix) {
            for (int data : innerArray) {
                min = Math.min(min, data);
            }
        }
        return min;
    }

    public int getMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] innerArray : matrix) {
            for (int data : innerArray) {
                max = Math.max(max, data);
            }
        }
        return max;
    }
}
