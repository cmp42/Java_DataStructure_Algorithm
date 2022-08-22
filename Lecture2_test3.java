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
        /* 이 풀이 방법이 더 좋은 것 같음
        *public int[] solution(long n) {
            int[] answer = {};
            long value = 0;
            List<Integer> checkedValues = new ArrayList<>();

            do {
                value = n % 10;
                checkedValues.add((int)value);
                n = n/10;
            } while(n > 0);

                return listToArray(checkedValues);
            }

        private int[] listToArray(List<Integer> target) {
            int targetSize = target.size();
            int[] intArray = new int[targetSize];

            for (int i = 0; i < targetSize; i++){
                intArray[i] = target.get(i);
            }

            return intArray;
        }
         */
    }
}
