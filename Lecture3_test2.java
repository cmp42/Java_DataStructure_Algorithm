import java.util.*;

public class Lecture3_test2 {
    public static void main(String[] args) {
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] comp = {"stanko", "ana", "mislav"};
        boolean check = false;
        final List<String> arr = new ArrayList<>();
        
        Collections.addAll(arr, comp);
        String answer = "";

        System.out.println(arr);
        for (String str : part) {
            for (String str2 : arr) {
                if (str.equals(str2)) {
                    check = true;
                    break ;
                }
                check = false;
            }
            if (check) {
                for (String str2 : arr) {
                    System.out.println("str == " + str + " str2 == " + str2);
                    if (str.equals(str2)){
                        arr.remove(str2);
                        break ;
                    }
                }
            }
            else {
                answer = str;
            }
        }
        System.out.println(answer);

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
