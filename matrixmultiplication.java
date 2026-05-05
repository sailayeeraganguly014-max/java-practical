class MatrixMultiplication {
    int rows;
    int cols;
    int[][] data;
    MatrixMultiplication(int r, int c) {
        rows = r;
        cols = c;
        data = new int[rows][cols];
    }
    void setValue(int i, int j, int value) {
        data[i][j] = value;
    }
    MatrixMultiplication multiply(MatrixMultiplication m) {
        MatrixMultiplication result = new MatrixMultiplication(this.rows, m.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < m.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * m.data[k][j];
                }
            }
        }
        return result;
    }
    void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixMultiplication m1 = new MatrixMultiplication(2, 2);
        MatrixMultiplication m2 = new MatrixMultiplication(2, 2);
        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);
        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);
        MatrixMultiplication result = m1.multiply(m2);
        System.out.println("Result of Matrix Multiplication:");
        result.display();
}
}
