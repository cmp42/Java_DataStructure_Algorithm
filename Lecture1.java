public class Lecture1 {
    public static void main (String[] args) {
        Data a = new Data();
        a.a = 42;
        System.out.println(a.a);
        method(a);
        System.out.println(a.a);
    }
    public static void method (Data n) {
        n.a *= 2;
    }
    static class Data {
        int a;
    }
} 
