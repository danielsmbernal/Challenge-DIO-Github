public class App {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 9);
            }
        }

        for (int[] line : matrix) {
            for (int column : line) {
                System.out.print(column + " ");
            }

            System.out.println();

        }
        
    }
}
