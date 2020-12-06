package leetcode;

public class Backpack {
    public static void main(String[] args) {

    }

    public int backPackII(int m, int[] A, int[] V) {
        // write your code here
        int n = A.length;
        int[][] cell = new int[n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (j - A[i - 1] < 0) {
                    cell[i][j] = cell[i - 1][j];
                } else {
                    cell[i][j] = Math.max(cell[i - 1][j], cell[i - 1][j - A[i - 1]] + V[i - 1]);
                }

            }
        }

        return cell[n][m];
    }
}
