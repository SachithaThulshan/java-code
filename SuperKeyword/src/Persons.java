public class Persons {
    int nic;
    String name;
    Persons(int nic, String name) {
        this.nic = nic;
        this.name = name;
    }
}
class Employee extends Persons{
    float salary;
    Employee(int nic, String name, float salary){
        super(nic, name);
        this.salary = salary;
    }
    void output(){
        System.out.println(nic + " "+ name+ " " + salary);
    }
}
class Test1{
    public static void main(String[] args) {
        Employee employee = new Employee(99307000,"Sachitha", 102225f);
        employee.output();
    }
}