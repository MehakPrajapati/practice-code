package cbpractice;

import java.util.*;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // 11 kth root
        // int t = sc.nextInt();
        // while (t-- > 0) {
        // long n = sc.nextInt();
        // long k = sc.nextInt();
        // System.out.print(kthroot(n, k));
        // }
        // }

        // public static long kthroot(long n, long k) {
        // long low = 1;
        // long high = n;
        // long ans = 0;
        // while (low <= high) {
        // long mid = (low + high) / 2;
        // if (Math.pow(mid, k) <= n) {
        // ans = mid;
        // low = mid + 1;
        // } else {
        // high = mid - 1;
        // }

        // }

        // return ans;
        // ------------------------------------------------------------------
        // 14 agressive cow

        // int n = sc.nextInt(); // stall
        // int c = sc.nextInt(); // coww
        // int[] stall = new int[n];
        // for (int i = 0; i < stall.length; i++) {
        // stall[i] = sc.nextInt();
        // }

        // Arrays.sort(stall);
        // System.out.print(arraysort(stall, c));

        // }

        // public static int arraysort(int[] stall, int c) {
        // int low = 0;
        // int high = stall[stall.length - 1] - stall[0];
        // int ans = 0;
        // while (low <= high) {
        // int mid = (low + high) / 2;
        // if (ispossible(stall, c, mid) == true) {
        // ans = mid;
        // low = mid + 1;

        // } else {
        // high = mid - 1;
        // }
        // }
        // return ans;

        // }

        // public static boolean ispossible(int[] stall, int c, int mid) {
        // int cow = 1;
        // int pos = stall[0];
        // for (int i = 1; i < stall.length; i++) {
        // if (stall[i] - pos >= mid) {
        // cow++;
        // pos = stall[i];
        // }
        // if (cow == c) {
        // return true;
        // }
        // }
        // return false;

        // ------------------------------------------------------------------------
        // 1 Arrays-Wave Print Row Wise
        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);

        // }

        // public static void display(int[][] arr) {
        // for (int row = 0; row < arr.length; row++) {
        // if (row % 2 == 0) {
        // for (int col = 0; col < arr[0].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // } else {
        // for (int col = arr[0].length - 1; col >= 0; col--) {
        // System.out.print(arr[row][col] + " ");

        // }
        // }
        // }
        // System.out.print("END");
        // -----------------------------------------
        // ----Arrays-Spiral Print Anticlockwise
        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);

        // }

        // public static void display(int[][] arr) {
        // int minrow = 0;
        // int minicol = 0;
        // int maxrow = arr.length - 1;
        // int maxcol = arr[0].length - 1;
        // int count = 0;
        // int total = arr.length * arr[0].length;
        // while (count < total) {
        // for (int i = minrow; i <= maxrow && count < total; i++) {
        // System.err.print(arr[i][minicol] + ",");
        // count++;
        // }
        // minicol++;
        // for (int i = minicol; i <= maxcol && count < total; i++) {
        // System.err.print(arr[maxrow][i] + ",");
        // count++;
        // }
        // maxrow--;
        // for (int i = maxrow; i >= minrow && count < total; i--) {
        // System.err.print(arr[i][maxcol] + ", ");
        // count++;
        // }
        // maxcol--;
        // for (int i = maxcol; i >= minicol && count < total; i--) {
        // System.err.print(arr[minrow][i] + ", ");
        // count++;
        // }
        // minrow++;
        // }
        // System.out.print("END");
        // -------------------------------------------------------------------
        // 3Arrays-Wave print Column Wise

        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);

        // }

        // public static void display(int[][] arr) {
        // for (int col = 0; col < arr[0].length; col++) {
        // if (col % 2 == 0) {
        // for (int row = 0; row < arr.length; row++) {
        // System.out.print(arr[row][col] + ", ");
        // }
        // } else {
        // for (int row = arr.length - 1; row >= 0; row--) {
        // System.out.print(arr[row][col] + ", ");

        // }
        // }
        // }
        // --------------------------------------------------------------
        // 4 matrix search

        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns
        // int x = sc.nextInt();
        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr, x);

        // }

        // public static void display(int[][] arr, int x) {

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (arr[i][j] == x) {
        // System.out.println(1);
        // }
        // }

        // }
        // System.out.println(0);
        // ------------------------------------------------
        // 5 Arrays-Spiral Print Clockwise
        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);
        // }

        // public static void display(int[][] arr) {
        // int minrow = 0;
        // int mincol = 0;
        // int maxrow = arr.length - 1;
        // int maxcol = arr[0].length - 1;
        // int count = 0;
        // int total = arr.length * arr[0].length;
        // while (count < total) {
        // for (int i = mincol; i <= maxcol && count < total; i++) {
        // System.err.print(arr[minrow][i] + ", ");
        // count++;
        // }
        // minrow++;
        // for (int i = minrow; i <= maxrow && count < total; i++) {
        // System.err.print(arr[i][maxcol] + ", ");
        // count++;
        // }
        // maxcol--;
        // for (int i = maxcol; i >= mincol && count < total; i--) {
        // System.err.print(arr[maxrow][i] + ", ");
        // count++;
        // }
        // maxrow--;
        // for (int i = maxrow; i >= minrow && count < total; i--) {
        // System.err.print(arr[i][mincol] + ", ");
        // count++;
        // }
        // mincol++;

        // }
        // System.out.print("END");
        // ------------------------------------------------------------------------------
        // 6 rotate image
        // int n = sc.nextInt(); // rows
        // // columns

        // int[][] arr = new int[n][n];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.err.print(arr[i][j] + " ");
        // }
        // System.err.println();
        // }
        // }

        // public static void display(int[][] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr[0].length; j++) {
        // int temp = arr[i][j];
        // arr[i][j] = arr[j][i];
        // arr[j][i] = temp;
        // }

        // }
        // int top = 0;
        // int bottom = arr.length - 1;
        // while (top < bottom) {
        // int[] temp = arr[top];
        // arr[top] = arr[bottom];
        // arr[bottom] = temp;
        // top++;
        // bottom--;
        // }
        // -------------------------------------------------------
        // 7 piyus and megical park
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int k = sc.nextInt();
        // int s = sc.nextInt();
        // char[][] arr = new char[n][m];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // arr[i][j] = sc.next().charAt(0);
        // }
        // }
        // pyush(arr, k, s);
        // }

        // public static void pyush(char[][] arr, int k, int s) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // if (s < k) {
        // break;
        // }
        // if (arr[i][j] == '.') {
        // s = s - 2;
        // }
        // if (arr[i][j] == '*') {
        // s = s + 5;
        // }
        // if (arr[i][j] == '#') {
        // break;
        // }
        // if (j < arr[0].length -1) {
        // s--;
        // }

        // }
        // }
        // if (s >= k) {
        // System.err.println("Yes");
        // System.err.println(s);
        // } else {
        // System.err.println("No");
        // }
        // ---------------------------------------------------------------------------
        // 8 Transpose of a square matrix
        // int n = sc.nextInt();
        // int[][] arr = new int[n][n];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // System.err.print(arr[i][j] + " ");
        // }
        // System.err.println();
        // }
        // }

        // public static void display(int[][] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr[0].length; j++) {
        // int temp = arr[i][j];
        // arr[i][j] = arr[j][i];
        // arr[j][i] = temp;
        // }
        // }
        // ----------------------------------------------------
        /// Rowwise sort matrix
        // int n = sc.nextInt(); // rows
        // int m = sc.nextInt(); // columns

        // int[][] arr = new int[n][m];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // display(arr);
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        // }

        // public static void display(int[][] arr) {

        // for (int i = 0; i < arr.length; i++) {
        // Arrays.sort(arr[i]); // sort each row
        // }
        // -------------------------------------------------------------------------
        // 10 Mummy's motivational speech
        // int n = sc.nextInt();
        // int[][] arr = new int[n][n];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // arr[i][j] = sc.nextInt();
        // }
        // }
        // System.err.println(display(arr));
        // }

        // public static boolean display(int[][] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (arr[i][j] != 0) {
        // return true;
        // }
        // }
        // }
        // return false;
        // ---------------------------------------------------------------
        // 13 Find Square Root
        // long A = sc.nextLong();
        // System.out.println(sqrt(A));
        // }

        // public static long sqrt(long x) {
        // long start = 0;
        // long end = x;
        // long ans = 0;

        // while (start <= end) {
        // long mid = start + (end - start) / 2;
        // long square = mid * mid;
        // if (square == x) {
        // return mid;
        // } else if (square < x) {
        // ans = mid;
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // return ans;
        // ----------------------------------------------------------

        // // Book Allocation Problem
        // int t = sc.nextInt();
        // while (t-- > 0) {
        // int n = sc.nextInt(); // number of books
        // int m = sc.nextInt(); // number of students
        // int[] page = new int[n];
        // for (int i = 0; i < n; i++) {
        // page[i] = sc.nextInt();
        // }

        // System.out.println(minpage(page, n, m));
        // }
        // }

        // public static int minpage(int[] page, int n, int m) {
        // int low = 0;
        // int high = 0;
        // for (int i = 0; i < page.length; i++) {
        // high += page[i];
        // }
        // int ans = 0;
        // while (low <= high) {
        // int mid = (high + low) / 2;
        // if (ispossible(page, n, m, mid) == true) {
        // ans = mid;
        // high = mid - 1;

        // } else {
        // low = mid + 1;
        // }

        // }
        // return ans;
        // }

        // public static boolean ispossible(int[] page, int n, int m, int mid) {
        // int student = 1;
        // int readpage = 0;
        // for (int i = 0; i < page.length;) {
        // if (readpage + page[i] <= mid) {
        // readpage += page[i];
        // i++;
        // } else {
        // readpage = 0;
        // student++;
        // }
        // if (student > m) {
        // return false;
        // }
        // }
        // return true;
        // -----------------------------------------------------
        // a boolean matrix

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        matrix(mat, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrix(int[][] mat, int m, int n) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }
}