import java.util.*;

public class Lecture3_test {
    static Map<Integer[], Integer> pokemon = new HashMap<>();
    
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        dfs(nums, 0, new Integer[1]);

    }
    public static void dfs(int[] nums, int idx, Integer[] arr) {
        if (idx == nums.length / 2) {
            if (!pokemon.containsKey(arr))
                pokemon.put(arr, 1);
            else {
                Integer tmp = pokemon.get(arr);
                pokemon.replace(arr, ++tmp);
            }
            System.out.println("arr = " + arr);
            System.out.println(pokemon.keySet());
            return ;
        }

        for (int i = idx; i < nums.length - 1; i++) {
            Integer[] array = new Integer[nums.length / 2];
            array[i] = nums[i];
            dfs(nums, ++idx, array);
        }
    }
}
