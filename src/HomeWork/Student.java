package HomeWork;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double MathAvg;
    double EconAvg;
    double LangAvg;

    double AvgGrade (double MathAvg, double EconAvg, double LangAvg) {
        double result = (MathAvg+EconAvg+LangAvg)/3;
        return result;
    }
    void showInfo () {
        System.out.println("Средняя арифметическая оцека стдента " + name + " " + surname + " = " + AvgGrade(MathAvg,EconAvg,LangAvg));
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Gleb";
        st1.surname = "Rukan";
        st1.id = 1;
        st1.year = 2002;
        st1.MathAvg = 4.2;
        st1.LangAvg = 5;
        st1.EconAvg = 3.5;

        Student st2 = new Student();
        st2.name = "Michael";
        st2.surname = "Naki";
        st2.id = 2;
        st2.year = 2005;
        st2.MathAvg = 4.3;
        st2.LangAvg = 2.5;
        st2.EconAvg = 4.0;

        Student st3 = new Student();
        st3.name = "Ilnar";
        st3.surname = "Tazetdinov";
        st3.id = 3;
        st3.year = 2009;
        st3.MathAvg = 4.0;
        st3.LangAvg = 4.3;
        st3.EconAvg = 4.8;

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();

    }
}