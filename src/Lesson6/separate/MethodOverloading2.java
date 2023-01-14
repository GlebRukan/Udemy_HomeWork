package Lesson6.separate;

public class MethodOverloading2 {
    int sum(int i1, int i2) {
        return (i1 + i2);
    }

    String sum(String s1, String s2) {
        return (s1 + s2);
    }
}

    class MethodOverloading2Test {
        public static void main(String[] args) {
            MethodOverloading2 mO2 = new MethodOverloading2();
            System.out.println(mO2.sum(1,2));
            System.out.println(mO2.sum("Привет, ", "мой друг"));
        }
    }