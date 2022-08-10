import java.util.*;
import java.util.stream.*;

public class Lecture2_test {
    public static int[] main(String[] args) {
        // max값 바로 구하는 법
        // int max = Arrays.stream(arr).max().getAsInt();
        int[] arr = {1,3,5,4,5,2,1};
        int max = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                j++;
            }
        }
        int[] answer = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                answer[j++] = i;
        }
        // 리스트를 바로 배열로 바꾸는 법
        // int[] answer = list.stream().mapToInt(Integer::intvalue).toArray();
        return answer;

        /*
         * 최단코드
         * int max = Arrays.stream(arr).max().getAsInt();
         * return IntStream.range(0, arr.length).filter(i->arr[i] == max).toArray();
         */
    }
}
