public class palindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome("abcba"));
        System.out.println(isPali("abcba"));
    }

    static boolean Palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str) {
        if (str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) &&
                isPalindromeRecursive(str.substring(1, str.length() - 1));
    }

    public static boolean isPali(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
