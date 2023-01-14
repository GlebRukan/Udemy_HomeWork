package HomeWork;

public class SumOverloaded {
    int sum () {
        int result = 0;
        System.out.println("сумма чисел равна " + result);
        return result;
    }
    int sum (int a, int b) {
        return a+b;
    }
    int sum (int a, int b, int c) {
        return a+b+c;
    }
    int sum (int a, int b, int c, int d) {
        return a+b+c+d;
    }
}

class SumOverloadedTest {
    public static void main(String[] args) {
    SumOverloaded SOL = new SumOverloaded();
        System.out.println(SOL.sum());
        System.out.println(SOL.sum(1,2));
        System.out.println(SOL.sum(1,2,3));
        System.out.println(SOL.sum(1,2,3,4));
    }
}