package ints;

public class deQuy {
    public static void main(String[] args) {
        int[] a = {1, 6, 4, 9, 8, 7, 10};
        int[][] b = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("b1 : " + b1(a, 6, 1));
        System.out.println("b1 : " + b1(a, 6, 14));
        System.out.println("b2 : " + b2(a, 6));
        System.out.println("b3 : " + b3(a, 0, 3));
        b4(b, 2, 1);

    }

    //b1 : tìm kiếm tuần tự
    public static int b1(int[] arr, int n, int number) {
        if (arr[n] == number) {
            return n;
        } else if (n <= 0) {
            return -1;
        }
        return b1(arr, n - 1, number);
    }

    //b2 : tính tổng
    public static int b2(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        return arr[n] + b2(arr, n - 1);
    }

    //b3 : tổng từ a -> b
    public static int b3(int[] arr, int a, int b) {
        if (b == a) {
            return arr[a];
        }
        return arr[b] + b3(arr, a, b - 1);
    }

    //b4 : duyệt mảng 2 chiều
    public static Object b4(int[][] arr, int m, int n) {
        if (m == 0 && n == 0) {
            System.out.println("[" + m + "," + n + "]  : " + arr[0][0]);
            return null;
        }
        if (n == 0) {
            System.out.println("[" + m + "," + n + "]  : " + arr[m][n]);
            return b4(arr, m - 1, n + 1);
        }
        System.out.println("[" + m + "," + n + "]  : " + arr[m][n]);
        return b4(arr, m, n - 1);
    }
}
