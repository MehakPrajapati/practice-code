import java.util.*;

public class genrateparantheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> ll = new ArrayList<>();
        parentheses(n, 0, 0, "", ll);
        System.out.println(ll);
    }

    public static void parentheses(int n, int opn, int close, String ans, List<String> ll) {
        if (opn == n && close == n) {
            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if (opn > n || close > opn) {
            return;
        }
        parentheses(n, opn + 1, close, ans + "(", ll);
        parentheses(n, opn, close + 1, ans + ")", ll);
    }
}