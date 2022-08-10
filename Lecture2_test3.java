import java.util.*;

public class Lecture2_test3 {
    public static void main(String[] args) {
        long n, tmp;
        n = 12345;
        tmp = n;
        int t = 0;
        int[] answer = {};

        while (tmp > 0) {
            tmp /= 10;
            t++;
        }
        int[] arr = new int[t];
        t = 0;
        while (n > 0) {
            arr[t++] = (int) (n % 10);
            n /= 10;
        }
        System.out.println(arr[1]);
    }
}
