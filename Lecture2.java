import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

/*
 * LinkedList
 * List 인터페이스
 * ArrayList = not syncronized(동기화) => 내부적으로 array 가지고 있음, resizable
 * Vector = syncronized (thread safe 해야한다면)
 * 
 */

class myData{
    int value;

    public myData(int v) {
        this.value = v;
    }

    static myData create (int v) {
        return new myData(v);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ""+value;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        myData Mydata = (myData)obj;
        return value == Mydata.value;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(value);
    }
}

public class Lecture2 {
    public static void main (String[] args) {
        int[] arr = new int[5];
        String[] str = new String[5];
        boolean[] bools = new boolean[5];
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<myData> list2 = new LinkedList<>();
        List<myData> list3 = new Vector<>();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(bools));
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 5);
        list.remove(2);
        list2.add(myData.create(1));
        list2.add(myData.create(10));
        list2.add(myData.create(100));
        list3.add(myData.create(5));
        list3.add(myData.create(3));
        list3.add(myData.create(1));
        method1(list3);
        System.out.println(list.contains(5));
        System.out.println(list2.contains(myData.create(10)));
        System.out.println(list2.indexOf(myData.create(10)));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.iterator());

        
    }

    static void method1(List<myData> list) {
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
    // 이 코드들은 자주 반복해서 보면 좋을 것 같다. 얻을게 많은 것 같다.
}
