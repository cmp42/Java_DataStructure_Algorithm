// cannot resolved가 뜰 때는, vscode를 끄고 다시 시작하면 된다.
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * Array 장점 + List 장점 => 유연하면서도 빠르게 값을 찾아낼 수 있는
 * Map : key -> hash function -> hash -> bucket index -> hash collision -> List -> Data
 * -> dictionay라고도 한다.
 * 
 */

 // custom 클래스를 생성한다고 해보자
class Mydata {
    int v;

    public Mydata(int v) {
        this.v = v;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return (" [ " + v + " ] ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mydata myData = (Mydata) obj;
        return v == myData.v;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(v);
    }
    // hash 코드에 대해 이야기하셨는데, 정확히 이해하지는 못했다. java를 더 공부해보고 해결할 것
}

public class Lecture3_1 {
    public static void main(String[] args) {
        // 유연하면서도 빠르게 읽어내는 자료구조?
        // 바로 map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.putIfAbsent("A", 10);
        map.put("C", 6);
        map.replace("A", 1, 11);
        map.remove("B", 10);
        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.getOrDefault("key",-1));
        System.out.println(map.values());
        System.out.println(map.keySet());
        // 멀티 쓰레드 safe해야 한다면 ConcurrentHashMap을 사용해야 한다.
        // HashMap : not synchronized
        // Hashtable : synchronized
        // ConcurrentHashMap : syncronized + hish concurrency
    }

    public static void method1(Map<String, Integer> map) {

    }
}
