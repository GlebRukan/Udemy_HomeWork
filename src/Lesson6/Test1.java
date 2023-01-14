package Lesson6;

public class Test1 {
    int sum (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }
    int sumAnother (int a, int b, int c) {
        return a+b+c;
    }

    int sredArif (int a, int b, int c) {
        return sum(a,b,c)/3;
    }
}
class Test1Test {
    public static void main(String[] args) {
    Test1 t1= new Test1();
        System.out.println(t1.sum(1,2,3));
        System.out.println(t1.sredArif(3,4,5));
    }
}
