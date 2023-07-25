public class ch12ex12_isReverse {


    public static void main(String[] args) {
        // System.out.println(isReverse("hello", "olleh")); // Output: true
        System.out.println(isReverse("hello", "world")); // Output: false
        // System.out.println(isReverse("", "")); // Output: true
        // System.out.println(isReverse("a", "A")); // Output: true
    }


    public static boolean isReverse(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        return isReverseHelper(str1, str2, 0, str1.length() - 1);
    }

    private static boolean isReverseHelper(String str1, String str2, int start, int end) {
        if (start >= end) {
            return true;
        }

        char char1 = str1.charAt(start);
        char char2 = str2.charAt(end);

        if (char1 != char2) {
            return false;
        }

        return isReverseHelper(str1, str2, start + 1, end - 1);
    }






}
