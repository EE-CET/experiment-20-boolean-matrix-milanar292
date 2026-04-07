import java.util.*;

public class BooleanMatrix {
    
    public static void BooleanMatrixProblem(int[][] mat, int m, int n) {
        boolean[] rowHasOne = new boolean[m];
        
        // Step 1: Identify rows with at least one 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    rowHasOne[i] = true;
                    break;
                }
            }
        }
        
        // Step 2: Fill those rows with 1
        for (int i = 0; i < m; i++) {
            if (rowHasOne[i]) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] mat = new int[m][n];
        
        // Input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        // Apply logic
        BooleanMatrixProblem(mat, m, n);
        
        // Output (NO TRAILING SPACES 👀)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
                if (j != n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
