public class ch12ex3_writeSequence {

    public static void main(String[] args) {

            // writeSequence(1); // Output: 1
            // System.out.println();

            // writeSequence(2); // Output: 1 1
            // System.out.println();

            // writeSequence(3); // Output: 2 1 2
            // System.out.println();

            // writeSequence(4); // Output: 2 1 1 2
            // System.out.println();

            writeSequence(5); // Output: 3 2 1 2 3
            System.out.println();

            // writeSequence(6); // Output: 3 2 1 1 2 3
            // System.out.println();

            // writeSequence(7); // Output: 4 3 2 1 2 3 4
            // System.out.println();

    }

    public static void writeSequence(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Value must be greater than or equal to 1");
        } else if (n == 1) {
            System.out.print("1 ");
        } else if (n % 2 == 0) {
            System.out.print(n / 2 + " ");
            writeSequence(n - 2);
            System.out.print(n / 2 + " ");
        } else {
            System.out.print((n + 1) / 2 + " ");
            writeSequence(n - 2);
            System.out.print((n + 1) / 2 + " ");
        }
    }






}
