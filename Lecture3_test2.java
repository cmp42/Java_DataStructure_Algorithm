import java.util.*;

public class Lecture3_test2 {
    public static void main(String[] args) {
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] comp = {"stanko", "ana", "mislav"};
        
        System.out.println("1234");
        List<String> arr = new List<String>();
        List<String> arr2 = new List<String>();

        Collections.addAll(arr, part);
        Collections.addAll(arr2, comp);

        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            if (arr2.contains(str)){
                arr.remove(str);
                arr2.remove(str);
                i--;
            }
        }
        System.out.println(arr);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = participant[0];
        
        for (String str : participant) {
            int count = 0;
            for (String str2 : completion) {
                if (str != str2)
                    count++;
            }
            if (count == completion.length)
                answer = str;
        }
        return answer;
    }
}
