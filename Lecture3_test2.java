import java.util.*;
import java.util.stream.Stream;

public class Lecture3_test2 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        System.out.println("1234");
        List<String> part = new ArrayList(Arrays.asList(participant));
        List<String> comp = Arrays.asList(completion);
        
        for (String str : comp) {
            part.remove(str);
        }
        System.out.println(part);
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
