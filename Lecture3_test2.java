import java.util.*;

public class Lecture3_test2 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                System.out.println(participant[i]);       
            }
        }
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
