import java.util.*;

public class Lecture2_test2 {
    public static void main(String[] args) {
        /*
        int[] arr = {4,1,2};
        boolean answer = true;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 1; i < list.size() + 1; i++) {
            if (!list.contains(i)) {
                answer = false;
                break ;
            }
        }
        System.out.println(answer);
        */

        int[] arr = {4,1,3,2};
        int[] arr2 = new int[10];
        boolean answer = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr.length) {
                answer = false;
                break ;
            }
            else {
                arr2[arr[i] - 1] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }


        System.out.println(answer);
        for (int i = 0; i < arr.length; i++) {
            if (arr2[i] == 0) {
                answer = false;
                break ;
            }
        }
        System.out.println(answer);
        /*
         * 더 좋은 답
         * int[] answer = new int[arr.length];
         * for (int i = 0; i < arr.length; i++) answer[i] = i + 1;
         * 
         * Arrays.sort(arr);
         * return Arrays.equals(answer, arr);
         */
    }
}
