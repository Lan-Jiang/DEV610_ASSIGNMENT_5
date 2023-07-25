public class ch12ex16_evenDigits {

    public static void main(String[] args) {
        System.out.println(evenDigits(8342116)); // Output: 8426
        // System.out.println(evenDigits(-34512)); // Output: -42
        // System.out.println(evenDigits(35159)); // Output: 0
        // System.out.println(evenDigits(7)); // Output: 0
    }


    public static int evenDigits(int num) {
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        if (digit % 2 == 0) {
            return evenDigits(num / 10) * 10 + digit;
        } else {
            return evenDigits(num / 10);
        }
    }


}
