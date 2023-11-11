public class Parent {
    void printData(){
        System.out.println("Method of parent class");
    }
}
class Child extends Parent {
    @Override
    void printData() {
        System.out.println("Method of Child Class");
    }
}
class Test {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.printData();
    }
}