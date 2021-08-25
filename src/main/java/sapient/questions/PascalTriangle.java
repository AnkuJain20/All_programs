package sapient.questions;

public class PascalTriangle {
    public static void main(String[] args) {
        int row=5, col=3;
        int[][] pascal = new int[row+1][row+1];
        for(int i=0;i<=row;i++){
            pascal[i][0]=1;
            pascal[i][i] =1;

            for(int j = 1;j<i;j++){
                pascal[i][j] = pascal[i-1][j]+ pascal[i-1][j-1];
            }
        }

        System.out.println(pascal[row][col]);

    }
}
