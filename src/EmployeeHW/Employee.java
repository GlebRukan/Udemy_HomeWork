package EmployeeHW;

public class Employee {
    Employee(int idNum, int AgeEmp, double SalaryEmp, String SurnameEmp, String Department) {
        id = idNum;
        Age = AgeEmp;
        Salary = SalaryEmp;
        Surname = SurnameEmp;
        Dept = Department;
    }

    int id;
    int Age;
    double Salary;
    String Surname;
    String Dept;

    double SalaryDouble() {
        Salary = Salary * 2;
        return Salary;
    }

    void ShowInfo() {
        System.out.println("ID работника " + id + ", возраст " + Age + ", текущая зарплата = " + Salary);
    }
}
    class EmployeeTest {
        public static void main(String[] args) {
            Employee employee1 = new Employee(1, 35, 200000, "Rukan", "Stimulation");
            employee1.ShowInfo();
            employee1.SalaryDouble();
            employee1.ShowInfo();

            Employee employee2 = new Employee(2, 25, 80000, "Ivanov", "Stimulation");
            employee2.ShowInfo();
            employee2.SalaryDouble();
            employee2.ShowInfo();
        }
    }