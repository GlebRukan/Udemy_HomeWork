package HomeWork;

public class Studentik {
    Studentik(int id1, String name1, String surname1, int year1, double MathAvg1, double EconAvg1, double LangAvg2) {
        id = id1;
        name = name1;
        surname = surname1;
        year = year1;
        MathAvg = MathAvg1;
        EconAvg = EconAvg1;
        LangAvg = LangAvg2;
    }

    Studentik(int id1, String name1, String surname1, int year1) {
        this(id1, name1, surname1, year1, 0.0, 0.0, 0.0);
    }

    Studentik() {
    }

    int id;
    String name;
    String surname;
    int year;
    double MathAvg;
    double EconAvg;
    double LangAvg;

    double AvgGrading(double EconAvg, double MathAvg, double LangAvg) {
        double result = (EconAvg + MathAvg + LangAvg / 3);
        return result;
    }

    void showInfo() {
        System.out.println("Средняя арифметическая оцека стдента " + name + " " + surname + " = " + AvgGrading(MathAvg, EconAvg, LangAvg));
    }
}

        class StudentikTest {
            public static void main(String[] args) {
                Studentik st1 = new Studentik(1, "Gleb", "Rukan", 2007, 3.0, 4.5, 5.0);

                Studentik st2 = new Studentik(2, "Inna", "Rukan", 2012, 0.0, 0.0, 0.0);
                st2.EconAvg = 5.5;
                st2.MathAvg = 3.9;
                st2.LangAvg = 4.0;

                Studentik st3 = new Studentik();
                st3.id = 3;
                st3.name = "Roma";
                st3.surname = "Rukanchik";
                st3.year = 2016;
                st3.EconAvg = 2.5;
                st3.MathAvg = 3.3;
                st3.LangAvg = 2.0;
                st1.showInfo();
                st2.showInfo();
                st3.showInfo();
            }
        }
