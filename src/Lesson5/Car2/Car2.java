package Lesson5.Car2;

public class Car2 {

    String color;
    String model;
    int speed;

    int gas (int speedChange) {
        speed = speed + speedChange;
        return speed;
    }

    int brake (int speedChange) {
        speed = speed - speedChange;
        return speed;
    }
    void showInfo () {
        System.out.println("тачка " + model + " цвет " + color + " ее текущая скорость = " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "black";
        c1.model = "Toyota";
        c1.speed = 60;
        c1.showInfo();

        c1.gas(100);
        c1.showInfo();
        c1.brake(160);
        c1.showInfo();
    }
}