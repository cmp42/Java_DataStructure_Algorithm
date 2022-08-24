import java.util.*;

public class Lecture3_test {
    static Map<int [], Integer> pokemon = new HashMap<>();
    static int[] array = new int[2];
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        dfs(nums, 0, 0);

    }
    public static void dfs(int[] nums, int idx, int count) {
        if (idx == nums.length / 2) {
            if (!pokemon.containsKey(array))
            {
                int[] arr = new int[2];
                arr = Arrays.copyOf(array, 2);
                pokemon.put(arr, 1);
                System.out.println("이게 실행되나?");
            }
            else {
                int[] arr = new int[2];
                arr = Arrays.copyOf(array, 2);
                Integer tmp = pokemon.get(arr);
                pokemon.replace(arr, ++tmp);
            }
            System.out.println("arr = " + array[0] + "  " + array[1]);
            System.out.println(pokemon.values());
            return ;
            // 아직은 내가 다루는 법을 잘 모르는 것 같으니 답을 보고 판단하자.
        }
        for (int i = 0; i < nums.length; i++) {
            if (count > i)  continue;
            array[idx] = nums[i];
            count = i;
            dfs(nums, ++idx, ++count);
            count--;
            idx--;
        }
    }
}
