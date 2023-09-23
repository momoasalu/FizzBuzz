public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int numMultiples = 0;

        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                numMultiples++;
            }
            i++;
        }
        System.out.println(numMultiples);
    }
}
