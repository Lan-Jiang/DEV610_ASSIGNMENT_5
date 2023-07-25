public class ch12ex6_writeSquares {

    public static void main(String[] args) {

        writeSquares(8); // Output: 49, 25, 9, 1, 4, 16, 36, 64
        System.out.println();

        // writeSquares(1); // Output: 1
        // System.out.println();

    }

    public static void writeSquares(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        if(n == 1) {
            System.out.print(1);
            return;
        }

        if (n % 2 == 1) {
            System.out.print(n * n);
            if (n != 1) {
                System.out.print(", ");
            }
            writeSquares(n - 1);
        } else {
            writeSquares(n - 1);
            System.out.print(", " + (n * n));
        }
    }

}
