
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();

        // ques 1 Sum of odd placed and even placed digits
        // int odd = 0;
        // int even = 0;
        // int position = 0;
        // while (n > 0) {
        // int rem = n % 10;
        // if (position % 2 == 0) {
        // even = even + rem;
        // } else {
        // odd = odd + rem;
        // }
        // n = n / 10;
        // position++;
        // }

        // System.out.println(even);
        // System.out.println(odd);
        // ---------------------------------------------------------------------------------
        // ques 2 Count Digit
        // int digit = sc.nextInt();
        // int position = 0;
        // while (numbers > 0) {
        // int rem = numbers % 10;
        // if (digit == rem) {
        // position++;
        // }
        // numbers = numbers / 10;

        // }
        // System.out.println(position);

        ///------------------------------------------------------------------------------
        // ques 3 print reverse
        // while (numbers > 0) {
        // int rem = numbers % 10;
        // System.out.print(rem);
        // numbers = numbers / 10;
        // }

        // --------------------------------------------------------------------------------------
        // ques4 binary to decimal
        // int sum = 0;
        // int mul = 1;
        // while (n > 0) {
        // int rem = n % 10;
        // sum = sum + mul * rem;
        // mul = mul * 2;
        // n = n / 10;
        // }
        // System.out.println(sum);

        // --------------------------------------------------------------------------------------------
        // ques5 lcm
        // int n2 = sc.nextInt();
        // int lcm = Math.max(n, n2);
        // while (true) {
        // if (lcm % n == 0 && lcm % n2 == 0) {
        // break;
        // }
        // lcm++;
        // }
        // System.out.println(lcm);

        // -----------------------------------------------------------------------------------------------
        // ques 6fiboonaci sries
        // int a = 0;
        // int b = 1;

        // int i = 0;
        // while (i < n) {
        // int c = a + b;
        // a = b;
        // b = c;
        // i++;
        // }
        // System.out.println(a);

        // ------------------------------------------------------------------------------------------------------------
        // ques7 Conversion (Fahrenheit to Celsius)
        // int max = sc.nextInt();
        // int step = sc.nextInt();
        // for (int i = n; i <= max; i = i + step) {
        // int c = (int) ((5.0 / 9) * (i - 32));
        // System.out.println(i + "\t" + c);
        // }

        // -----------------------------------------------
        // ques 8inverse the no
        // int sum = 0;
        // int pos = 1;
        // while (n > 0) {

        // int rem = n % 10;
        // sum = (int) (sum + pos * Math.pow(10, rem - 1)); // sum += pos* Math.pow(10 ,
        // rem-1);
        // n = n / 10;
        // pos++;
        // }
        // System.out.println(sum);

        // -------------------------------------------------------------------------
        // ques 9check prime
        // int count = 0;
        // for (int i = 2; i < n; i++) {
        // if (n % i == 0) {
        // count++;
        // break;
        // }

        // }
        // if (count >= 1) {
        // System.out.println("not prime");
        // } else {
        // System.out.println("prime");
        // }

        // -----------------------------------------------------------------------
        // ques 10 gcd
        // int n1 = sc.nextInt();
        // if (n1 % n != 0) {
        // int rem = n1 % n;
        // n = rem;
        // n1 = n;

        // }
        // System.out.println(n);

        // ------------------------------------------------------------------------
        // ques 11 Chewbacca and Number
        // String ans = "";
        // String x = sc.next();
        // for (int i = 0; i < x.length(); i++) {

        // char c = x.charAt(i);
        // if (c == '9' && c == '0') {
        // ans += "" + c;

        // } else if (c < '5') {
        // ans += "" + c;
        // } else {
        // ans += "" + ('9' - c);
        // }
        // }
        // System.out.println(ans);

        // OR

        // String x = sc.next();
        // String ans = "";

        // for (int i = 0; i < x.length(); i++) {
        // char c = x.charAt(i);

        // if (c == 0 && c == '9') {
        // ans += c; // don't flip first '9'
        // } else {
        // int digit = c - '0';
        // int flipped = 9 - digit;

        // // take the smaller of original or flipped
        // if (flipped < digit) {
        // ans += (char) (flipped + '0');
        // } else {
        // ans += c;
        // }
        // }
        // }

        // System.out.println(ans);

        // -----------------------------------------------------------------------------------------

        // ques 12 replace them all
        // long result = 0;
        // long place = 1;
        // if (n == 0) {
        // System.out.println(5);
        // return;
        // }
        // while (n > 0) {

        // long rem = n % 10;
        // if (rem == 0) {
        // rem = 5;
        // }
        // result = rem * place + result;
        // place = place * 10;
        // n = n / 10;
        // }
        // System.out.println(result);

        // -----------------------------------------------------------------------------------------------
        // ques 13 replace all
        // int n2 = sc.nextInt();
        // int n = 1;
        // int count = 0;
        // while (count < n1) {
        // int m = 3 * n + 2;
        // if (m % 4 != 0) {
        // System.out.println(m);
        // count++;
        // }
        // n++;
        // }

        // -----------------------------------------------------------------------------------------
        // ques14 comutative print series
        // int sum = 0;
        // while (true) {
        // int n2 = sc.nextInt();
        // sum = sum + n2;
        // if (sum < 0) {
        // break;
        // }
        // System.out.println(n2);
        // }

        // --------------------------------------------------------------------------------------------------
        // ques 14 Print Armstrong Numbers

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // for (int i = n1; i < n2; i++) {
        // if (isarmstrong(i)) {
        // System.out.println(i);
        // }
        // }
        // }

        // public static boolean isarmstrong(int n) {
        // int c = countno(n);
        // int sum = 0;
        // int p = n;
        // while (n > 0) {
        // int rem = n % 10;
        // sum += Math.pow(rem, c);
        // n = n / 10;
        // }
        // return sum == p;

        // }

        // public static int countno(int n) {
        // int count = 0;
        // while (n > 0) {
        // n = n / 10;
        // count++;
        // }
        // return count;

        // ----------------------------------------------------------------------------
        // ques 16Conversion(Any To Any)
        // int sb = sc.nextInt();
        // int db = sc.nextInt();
        // int sn = sc.nextInt();
        // int decimal = 0;
        // int power = 1;
        // // sn to decimal
        // while (sn > 0) {

        // int rem = sn % 10;
        // decimal = decimal + rem * power;
        // power = power * sb;
        // sn = sn / 10;
        // }
        // // decimal to binary
        // int result = 0;
        // int power1 = 1;
        // while (decimal > 0) {
        // int rem1 = decimal % db;
        // result += rem1 * power1;
        // power1 = power1 * 10;
        // decimal = decimal / db;

        // }
        // System.out.println(result);

        // ------------------------------------------------------------------------
        // ques 17 Boston Numbers
        // int n = sc.nextInt();
        // if (isboston(n)) {
        // System.out.println("1");
        // } else {
        // System.out.println("0");
        // }

        // }

        // public static boolean isboston(int n) {
        // int c = getdigitsum(n);
        // int p = n;
        // int sum = 0;
        // for (int i = 2; i <= p / i; i++) {
        // while (p % i == 0) {
        // sum += getdigitsum(i);
        // p = p / i;
        // }
        // }

        // if (p > 1) {
        // sum += getdigitsum(p);
        // }

        // return sum == c;
        // }

        // public static int getdigitsum(int n) {
        // int count = 0;
        // while (n > 0) {
        // count += n % 10;
        // n /= 10;
        // }
        // return count;
        // }

        // ----------------------------------------------------------------------------------------------------
        // ques 18 shopping game
        // int t = sc.nextInt();
        // while (t > 0) {
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // shopping(m, n);
        // t--;
        // }
        // }

        // public static void shopping(int m, int n) {
        // int a = 0;
        // int h = 0;
        // int phone = 1;
        // while (true) {
        // a = a + phone;
        // if (a > m) {
        // System.out.println("harshit");

        // return;
        // }
        // phone++;
        // h = h + phone;
        // while (h > n) {
        // System.out.println("aaush");
        // return;
        // }
        // phone++;
        // }

        // }

        // -------------------------------------------------------------------------------------------------
        // ques19 Odd and Even back in Delhi
        int n = sc.nextInt(); // no of cars
        while (n > 0) {
            int m = sc.nextInt();
            oddandeven(m);

        }

    }

    public static void oddandeven(int m) {
        int oddsum = 0;
        int evensum = 0;
        while (m > 0) {
            int rem = m % 10;
            if (rem % 2 == 0) {
                evensum += rem;
            } else {
                oddsum += rem;
            }
            m /= 10;

        }
        if (evensum % 4 == 0) {
            System.out.println("yes");
        } else if (oddsum % 3 == 0) {
            System.out.println("no");
        }
    }
}

// ----------------------------------------------------------------------------------------------------
// ques 20 is armstrong no.
// int n = sc.nextInt();

// System.out.println(armstrongno(n));
// }

// public static boolean armstrongno(int n) {
// int c = countno(n);

// int sum = 0;
// int p = n;
// while (n > 0) {
// int rem = n % 10;
// sum = (int) (sum + Math.pow(rem, c));
// n = n / 10;
// }
// if (sum == p) {
// return true;
// } else {
// return false;
// }

// }

// public static int countno(int n) {
// int count = 0;
// while (n > 0) {
// count++;
// n = n / 10;
// }
// return count;
