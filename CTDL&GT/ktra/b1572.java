package ktra;

public class b1572 {
    public static void main(String[] args) {
        int[][] a = {{7, 3, 1, 9}, {3, 4, 6, 9}, {6, 9, 6, 6}, {9, 5, 8, 5}}; //55
       int[][] b = {{1,2,3},{4,5,6},{7,8,9}};   //25
       int[][] c = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}}; //8
        System.out.println(diagonalSum(a));
        System.out.println(diagonalSum(b));
        System.out.println(diagonalSum(c));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int count =( mat.length)/2;
        for (int i = 0,h = mat.length-1; i < mat.length; i++,h--) {
            sum += mat[i][i]+mat[h][h];
        }
        if(mat.length % 2 !=0){
            sum -= mat[count][count];
        }
        return sum;
    }
}
