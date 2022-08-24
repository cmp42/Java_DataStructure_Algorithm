import java.util.*;

public class Lecture3_test2 {
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};

        System.out.println(part - comp);
        /*
        HashSet<String> answer = new HashSet<>();

        for (String str : part) {
            int count = 0;
            for (String str2 : comp) {
                if (str != str2) {
                    count++;
                }
            }
            if (count == comp.length) {
                answer.add(str);
            }
        }
        System.out.println(answer);
        */

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
