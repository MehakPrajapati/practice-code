
public class assignment1 {
    public static void main(String[] args) {
        // int n = 4; // patern traingle ques 2
        // int row = 1;
        // int star = 1;
        // int val = 1;
        // int space = n - 1;
        // while (row <= n) {
        // int j = 1;
        // while (j <= space) {
        // System.out.print(" ");
        // j++;
        // }
        // val = row;
        // int i = 1;
        // while (i <= star) {
        // System.out.print(val + " ");
        // if (i < star / 2 + 1) {
        // val++;
        // } else {
        // val--;
        // }
        // i++;
        // }

        // star += 2;
        // System.out.println();
        // row++;
        // space--;

        // }

        // ----------------------------------------------------------------------------------
        // int n = 5; // ques 1 hoollow diamonf
        // int row = 1;
        // int star = n / 2 + 1;
        // int space = -1;
        // while (row <= n) {
        // int j = 1;
        // while (j <= star) {
        // System.out.print("* ");
        // j++;
        // }
        // int i = 1;
        // while (i <= space) {
        // System.out.print(" ");

        // i++;
        // }
        // int k = 1;
        // if (row == 1 || row == n) {
        // k = 2;
        // }
        // while (k <= star) {
        // System.out.print("* ");
        // k++;
        // }
        // if (row <= n / 2) {
        // star--;
        // space += 2;
        // } else {
        // star++;
        // space -= 2;
        // }

        // System.out.println();
        // row++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 3 mirror star pattern
        // int n = 5;
        // int row = 1;
        // int star = 1;
        // int space = n - 1;
        // while (row <= n) {
        // int j = 1;
        // while (j <= space) {
        // System.out.print(" ");
        // j++;
        // }
        // int i = 1;
        // while (i <= star) {
        // System.out.print("* ");

        // i++;
        // }
        // if (row < n / 2 + 1) {
        // star += 2;
        // space--;
        // } else {
        // star -= 2;
        // space++;

        // }

        // System.out.println();
        // row++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 4 Pattern Number Ladder
        // int n = 4;
        // int row = 1;
        // int star = 1;
        // int val = 1;
        // while (row <= n) {
        // int i = 1;
        // while (i <= star) {
        // System.out.print(val + "");
        // i++;
        // val++;
        // }
        // System.out.println();
        // row++;
        // star++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 5 hollow rhombus pattern
        // int n = 5;
        // int row = 1;
        // int star = 5;
        // int space = n - 1;
        // while (row <= n) {
        // int i = 1;
        // while (i <= space) {
        // System.out.print(" ");
        // i++;
        // }
        // int j = 1;
        // while (j <= star) {
        // if (j == 1 || j == n || row == 1 || row == n) {
        // System.out.print("* ");
        // } else {
        // System.out.print(" ");
        // }
        // j++;
        // }
        // System.out.println();
        // row++;
        // space--;

        // }
        // ---------------------------------------------------------------------------------------------------
        // // ques 6 pattern rhombus
        // int n = 3;
        // int row = 1;
        // int star = 1;
        // int space = n - 1;
        // int val = 1;
        // while (row <= 2 * n + 1) {
        // int i = 1;
        // while (i <= space) {
        // System.out.print(" ");
        // i++;
        // }
        // int p = val;
        // int j = 1;
        // while (j <= star) {
        // System.out.print(p + " ");
        // if (j < star / 2 + 1) {

        // p++;
        // } else {
        // p--;
        // }
        // j++;
        // }
        // if (row < (2 * n + 1) / 2) {
        // star += 2;
        // space--;
        // val++;
        // } else {
        // star -= 2;
        // space++;
        // val--;

        // }

        // System.out.println();
        // row++;

        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 7 pattern with zero
        // int n = 5;
        // int row = 1;
        // int star = 1;
        // int val = 1;
        // while (row <= n) {
        // int i = 1;
        // while (i <= star) {
        // if (i == 1 || i == row) {
        // System.out.print(val + "\t");
        // } else {
        // System.out.print("0\t");
        // }
        // i++;

        // }

        // System.out.println();
        // row++;
        // star++;
        // val++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 8 fibonacci series
        // int n = 4;
        // int row = 1;
        // int a = 0;
        // int b = 1;
        // int star = 1;
        // while (row <= n) {
        // int i = 1;
        // while (i <= row) {
        // System.out.print(a + "\t");
        // int c = a + b;
        // a = b;
        // b = c;
        // i++;

        // }

        // System.out.println();
        // row++;
        // star++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 9
        // patern moutain
        // int n = 4;
        // int row = 1;
        // int star = 1;
        // int space = 2 * n - 3;
        // while (row <= n) {
        // int val = 1;
        // int i = 1;
        // while (i <= star) {
        // System.out.print(val + " ");
        // val++;
        // i++;
        // }
        // int j = 1;
        // while (j <= space) {
        // System.out.print(" ");
        // j++;
        // }
        // int k = 1;
        // if (row == n) {
        // k = row-1;
        // }else{
        // k = row;
        // }
        // while (k>= 1) {
        // System.out.print( k + " ");
        // k--;
        // }
        // System.out.println();
        // row++;
        // star++;
        // space -= 2;
        // }
        // ---------------------------------------------------------------------------------------------------
        // 10 pattern magic
        // int n = 5;
        // int row = 1;
        // int star = 5;
        // int space = -1;
        // while (row <= 2 * n - 1) {
        // int i = 1;
        // while (i <= star) {
        // System.out.print("*");
        // i++;
        // }
        // int j = 1;
        // while (j <= space) {
        // System.out.print(" ");
        // j++;
        // }
        // int k = 1;
        // if (row == 1 || row == 2 * n - 1) {
        // k = 2;
        // }
        // while (k <= star) {
        // System.out.print("*");
        // k++;
        // }
        // if (row < n) {
        // star--;
        // space += 2;
        // } else {
        // star++;
        // space -= 2;
        // }
        // System.out.println();
        // row++;
        // }
        // ---------------------------------------------------------------------------------------------------

        // 11 skip pattern magic

        // ---------------------------------------------------------------------------------------------------
        // ques 12 pattern double sided arrorw
        // int n = 7;
        // int rows = 1;
        // int numbers = 1;
        // int left_spaces = n - 1;
        // int right_spaces = -1;

        // while (rows <= n) {
        // // spaces
        // int i = 1;
        // while (i <= left_spaces) {
        // System.out.print(" ");
        // i++;
        // }

        // // numbers
        // int j = 1;
        // int val = numbers;
        // while (j <= numbers) {
        // System.out.print(val + " ");
        // val--;
        // j++;
        // }

        // // spaces
        // int k = 1;
        // while (k <= right_spaces) {
        // System.out.print(" ");
        // k++;
        // }

        // // numbers
        // int l = 1;
        // val++;
        // if (rows == 1 || rows == n) {
        // l = 2;
        // }
        // while (l <= numbers) {
        // System.out.print(val + " ");
        // l++;
        // val++;
        // }

        // // prep for next row
        // System.out.println();
        // if (rows < n / 2 + 1) {
        // left_spaces -= 2;
        // right_spaces += 2;
        // numbers++;
        // } else {
        // left_spaces += 2;
        // right_spaces -= 2;
        // numbers--;
        // }
        // rows++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // ques 13 Pascal Triangle(Pattern 3)
        // int n = 6;
        // int row = 0;
        // int star = 1;

        // while (row < n) {
        // int i = 0;
        // int ncr = 1;
        // while (i < star) {
        // System.out.print(ncr + "");
        // ncr = ncr * (row - i) / (i + 1);
        // i++;
        // }
        // System.out.println();
        // row++;
        // star++;
        // }
        // ---------------------------------------------------------------------------------------------------
        // 14 Pattern InvertedHourGlass
        int n = 5;
        int row = 1;
        int space = 2 * n - 1;
        int star = 1;

        while (row <= 2 * n + 1) {
            int i = 1;
            int val = 5;
            while (i <= star) {
                System.out.print(val + " ");
                val--;
                i++;
            }

            int k = 1;
            while (k <= space) {
                System.out.print(" ");
                k++;
            }

            int j = 1;
            if (row == n + 1) {
                val = 1;
                while (j < star) { // print one less element
                    System.out.print(val + " ");
                    val++;
                    j++;
                }
            } else {
                val++; // because val was decremented extra in left loop
                while (j <= star) {
                    System.out.print(val + " ");
                    val++;
                    j++;
                }
            }

            if (row <= n) {
                star++;
                space -= 2;
            } else {
                star--;
                space += 2;
            }
            System.out.println();
            row++;
        }
        // ---------------------------------------------------------------------------------------------------

        // 15 Pattern HourGlass
        // int n = 5;
        // int row = 1;
        // int star = 5;
        // int space = 0;
        // while (row <= 2 * n + 1) {
        // int i = 1;

        // while (i <= space) {
        // System.out.print(" ");
        // i++;
        // }
        // int k = 1;
        // int val = n - space;
        // while (i <= star) {
        // System.out.print(val + " ");
        // val--;
        // i++;
        // }
        // System.out.print("0");
        // int m = 1;
        // val = 1;
        // while (m <= n - space) {
        // System.out.print(" " + val);
        // val++;
        // m++;
        // }
        // if (row <= n) {
        // space++;
        // } else {
        // space--;
        // }
        // System.out.println();
        // row++;
        // ---------------------------------------------------------------------------------------------------
        // // same ques 15 difff testt cases paassesd answer
        // int n = 5;

        // int row = 1;
        // int space = 0;

        // while (row <= 2 * n + 1) {
        // // 1️⃣ Print spaces
        // int i = 1;
        // while (i <= space) {
        // System.out.print(" ");
        // i++;
        // }

        // // 2️⃣ Print left numbers from n-space to 1
        // int val = n - space;
        // int l = val;
        // while (l >= 1) {
        // System.out.print(l + " ");
        // l--;
        // }

        // // 3️⃣ Print center 0
        // System.out.print("0");

        // // 4️⃣ Print right numbers from 1 to n-space
        // int r = 1;
        // while (r <= n - space) {
        // System.out.print(" " + r);
        // r++;
        // }

        // // 5️⃣ Go to next line
        // System.out.println();

        // // 6️⃣ Update space
        // if (row <= n) {
        // space++;
        // } else {
        // space--;
        // }

        // row++;

        // }
    }
}