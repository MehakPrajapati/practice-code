package cbpractice;

import java.util.*;

public class assignent3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ques 2 Arrays-Target Sum Triplets
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // int target = sc.nextInt();

        // findTriplets(arr, n, target);
        // }

        // public static void findTriplets(int[] arr, int n, int target) {
        // // Sort the array first
        // Arrays.sort(arr);

        // // Find all triplets
        // for (int i = 0; i < n - 2; i++) {
        // for (int j = i + 1; j < n - 1; j++) {
        // for (int k = j + 1; k < n; k++) {
        // if (arr[i] + arr[j] + arr[k] == target) {
        // System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
        // }
        // }
        // }
        // }
        // ---------------------------------------------------------------------------------------------
        // ques 3 Arrays-Linear Search
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // int result = linearsearch(arr, target);
        // System.out.println(result);
        // }

        // public static int linearsearch(int[] arr, int target) {

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == target) {
        // return i;
        // }
        // }
        // return -1;
        // ---------------------------------------------------------------------------------------------------
        // ques 4 Arrays-Target Sum Pairs
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();
        // targetsumpair(arr, target);

        // }

        // public static void targetsumpair(int[] arr, int target) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // int a = arr[i];
        // int b = arr[j];
        // if (a > b) {
        // int temp = a;
        // a = b;
        // b = temp;
        // }
        // System.out.println(a + " and " + b);
        // }
        // }
        // }

        // --------------------------------------------------------------------------------------
        // ques 5 Arrays-Max Value In Array
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // findMax(arr);

        // }

        // public static void findMax(int[] arr) {
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // System.out.println(max); // directly print
        // }
        // -----------------------------------------------------------------------------------------------------
        // ques 6 Pair of Roses

        // int t = sc.nextInt(); // test cases

        // while (t-- > 0) {
        // int n = sc.nextInt(); // number of roses
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // int m = sc.nextInt(); // Deepak's money
        // roessss(arr, m);
        // }
        // }

        // public static void roessss(int[] arr, int m) {
        // int x = 0, y = 0;
        // int minDiff = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == m) {
        // int a = Math.min(arr[i], arr[j]);
        // int b = Math.max(arr[i], arr[j]);

        // if (b - a < minDiff) {
        // minDiff = b - a;
        // x = a;
        // y = b;
        // }
        // }
        // }
        // }

        // System.out.println("Deepak should buy roses whose prices are " + x + " and "
        // + y + ".");

        // -------------------------------------------------------------------------------------------------
        // // ques 7 help ramu
        // int T = sc.nextInt(); // number of test cases

        // while (T-- > 0) {
        // /*
        // * c1 - per ride
        // *
        // * c2 - unlimited rides on one vehicle (rickshaw or cab)
        // *
        // * c3 - unlimited rides on all rickshaws or all cabs
        // *
        // * c4 - unlimited rides on all transport
        // */
        // int c1 = sc.nextInt();
        // int c2 = sc.nextInt();
        // int c3 = sc.nextInt();
        // int c4 = sc.nextInt();

        // int n = sc.nextInt(); // number of rickshaws
        // int m = sc.nextInt(); // number of cabs

        // int[] rickshaw = new int[n];
        // int[] cab = new int[m];

        // for (int i = 0; i < n; i++) {
        // rickshaw[i] = sc.nextInt();
        // }
        // for (int i = 0; i < m; i++) {
        // cab[i] = sc.nextInt();
        // }

        // // Calculate rickshaw cost
        // int rickshawCost = 0;
        // for (int i = 0; i < n; i++) {
        // rickshawCost += Math.min(rickshaw[i] * c1, c2);
        // }
        // rickshawCost = Math.min(rickshawCost, c3);
        // // Calculate cab cost
        // int cabCost = 0;
        // for (int i = 0; i < m; i++) {
        // cabCost += Math.min(cab[i] * c1, c2);
        // }
        // cabCost = Math.min(cabCost, c3);

        // int totalCost = Math.min(c4, rickshawCost + cabCost);
        // System.out.println(totalCost);
        // }
        // input ---->
        // 2
        // 1 3 7 19 ← Ticket costs: c1=1, c2=3, c3=7, c4=19
        // 2 3 ← n=2 rickshaws, m=3 cabs

        // 2 5 ← Ramu takes 2 rides on rickshaw 1, and 5 rides on rickshaw 2
        // 4 4 4 ← Ramu takes 4 rides on cab 1, 4 rides on cab 2, 4 rides on cab 3

        // --- second test case ---
        // 4 3 2 1 ← c1=4, c2=3, c3=2, c4=1
        // 1 3
        // 798
        // 1 2 3
        // ------------------------------------------------------------------------------------------
        // ques 8 Alex Goes Shopping
        // int n = sc.nextInt(); // number of items
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // int q = sc.nextInt(); // number of queries
        // for (int i = 0; i < q; i++) {
        // int a = sc.nextInt(); // total money
        // int k = sc.nextInt(); // required number of items

        // if (isPossible(arr, a, k)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }
        // }
        // }

        // public static boolean isPossible(int[] arr, int a, int k) {
        // int count = 0;
        // for (int price : arr) {
        // if (a % price == 0) {
        // count++;
        // }
        // }
        // return count >= k;
        // ------------------------------------------------------------------------------------------
        // ques 10Squares of a Sorted Array
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();

        // }
        // sort(arr);
        // }

        // public static void sort(int[] nums) {
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i] + " ");
        // }

        // -----------------------------------------------------------------------------------
        // ques 11 Sort just Zeroes and Ones
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // sort(arr);

        // }

        // public static void sort(int[] arr) {
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
        // count++;
        // }
        // }
        // for (int i = 0; i < count; i++) {
        // System.out.print("0 ");
        // }
        // for (int i = count; i < arr.length; i++) {
        // System.out.print("1 ");
        // }
        // -----------------------------------------------------------------
        // ques 13 bublloe sort
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }
        // sort(arr);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // }

        // public static void sort(int[] arr) {
        // for (int turn = 1; turn < arr.length; turn++) {
        // for (int i = 0; i < arr.length - turn; i++) {
        // if (arr[i] > arr[i + 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }
        // }
        // }
        // -----------------------------------------------------------------------
        // ques 14 Maximum Sum Path in Two Arrays
       int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            System.out.println(sumpath(arr1, arr2));
        }
    }   // }

        // public static int sumpath(int[] arr1, int[] arr2) {
        // int i = 0, j = 0;
        // int sum1 = 0, sum2 = 0, result = 0;

        // for (; i < arr1.length && j < arr2.length;) {
        // if (arr1[i] < arr2[j]) {
        // sum1 += arr1[i++];
        // } else if (arr1[i] > arr2[j]) {
        // sum2 += arr2[j++];
        // } else {
        // result += Math.max(sum1, sum2) + arr1[i];
        // i++;
        // j++;
        // sum1 = 0;
        // sum2 = 0;
        // }
        // }

        // // remaining elements
       // for (; i < arr1.length; i++)
        // sum1 += arr1[i];
        // for (; j < arr2.length; j++)
        // sum2 += arr2[j];

        // result += Math.max(sum1, sum2);
        // return result;
        // ----------------------------------------------------------
        // qeus 14 selection sort
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        
    }
    public static void sort(int [] arr){
for()
    }

    public static int mini(int[] arr, int i) {
        int minimum = 1;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minimum])
                minimum = j;
        }
        return minimum;
    }

}