public class ch12ex1_starString {

    public static void main(String[] args) {
        starString(0); // Output: *
        System.out.println();

        starString(1); // Output: **
        System.out.println();

        starString(2); // Output: ****
        System.out.println();
    }

    public static void starString(int n ) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            System.out.print("*");
        } else {
            starString(n - 1);
            starString(n - 1);
        }
    }



}
