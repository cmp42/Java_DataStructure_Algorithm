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
