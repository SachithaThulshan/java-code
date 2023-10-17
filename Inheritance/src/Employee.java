public class Employee {
    double salary = 219957.40;
}
class Programmer extends Employee{
    int bonus = 450000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer Salary : "+p.salary);
        System.out.println("Programmer Bonus : "+p.bonus);
        System.out.println("Programmer Income : "+(p.salary +p.bonus));

    }
}