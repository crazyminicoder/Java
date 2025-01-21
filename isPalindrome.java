import java.util.*;

class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int num = 0;
        int temp = n;
        while (n > 0) {
            num *= 10;
            num += n % 10;
            n /= 10;
        }
        if (num == temp) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Solution s = new Solution();
        System.out.println(s.isPalindrome(n));
    }
}