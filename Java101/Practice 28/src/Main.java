public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Abba"));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}