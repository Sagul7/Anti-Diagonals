import java.util.Arrays;
import java.util.Scanner;

public class AntiDiagonals2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        int res[][] = antiDiagonal(array,n);
        for(int[] element : res)
        {
            for(int x : element) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static int[][] antiDiagonal(int array[][],int n)
    {
        int res[][] = new int[n * 2 - 1][n];
        int r = 0;
        for(int x=0;x<n;x++)
        {
            int c = 0;
            int i=0,j=x;
            while(j>=0 && i<n)
            {
                res[r][c] = array[i][j];
                i++;
                j--;
                c++;
            }
            r++;
        }

        for (int x = 1; x < n; x++) {
            int i = x, j = n - 1;
            int c = 0;
            while (i < n && j >= 0) {
                res[r][c] = array[i][j];
                i++;
                j--;
                c++;
            }
            r++;
        }
        return res;

    }
}

