import java.util.*;

public class Lecture3_test3 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
 
        HashMap<String, Integer> hm = new HashMap<>();

        for (int j = 0; j < clothes.length; j++) {
            String kind = clothes[j][1];
            if (hm.containsKey(kind)) {
                hm.put(kind, hm.get(kind) + 1);
			} 
			else {
				hm.put(kind, 1);
			}
        }
        int result = 1;
 
		for (int val : hm.values()) {
			result *= (val + 1);
		}	
		System.out.println(result - 1);
    }
}

/*
import java.util.*;
import static java.util.stream.Collectors.*;

class Solution {
    public int solution(String[][] clothes) {
        //int answer = 0;
        return Arrays.stream(clothes)
            .collect( groupingBy( p -> p[1], mapping( p -> p[0], counting() ) ) )
            .values()
            .stream().collect( reducing(1L, (x, y) -> x * ( y + 1 ) ) )
            .intValue() - 1;
    }
}
// 이런 방법도 가능하다. 한줄로도 풀 수 있다는 뜻. 이런 부분을 많이 배워보자.
 */
