package Lesson6;

public class Employee {

    Employee (int id2, String surname2, int age2) {
        id = id2;
        surname = surname2;
        age = age2;
    }
    Employee (String surname2, int age2) {
        surname = surname2;
        age = age2;
    }
    Employee (int id2, String surname2,int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rukan", 37);
        Employee emp2 = new Employee(1, "Rukan", 37);
        Employee emp3 = new Employee(4, "Fedotov", 36, 300.24, "stimulation");
        System.out.println(emp2.id);
    }
}