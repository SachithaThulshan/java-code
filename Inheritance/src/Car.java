public class Car {
    void drive(){
        System.out.println("Driving");
    }
}
class Audi extends Car{
    void autoDrive(){
        System.out.println("Auto Driving!");
    }
}
class Audi2040 extends Audi{
    void flying(){
        System.out.println("Flying!");
    }
}
class test{
    public static void main(String[] args) {
        Audi2040 a = new Audi2040();
        a.drive();a.autoDrive();a.flying();
    }
}