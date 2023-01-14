package Lesson5;

public class Test20 {
    int a;
    int b;
    int c;

    int summa (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    int sredArifm (int a, int b, int c) {
        int result2 = summa (a, b, c)/3;
        return result2;
    }

}

class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summa = t.summa(2,3,5);
        System.out.println(summa);
        int sredArifm = t.sredArifm(2, 3,5);
        System.out.println(sredArifm);
    }
}