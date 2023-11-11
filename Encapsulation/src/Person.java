class Person {
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(25);
        System.out.println("Age is : "+ person.getAge());
    }
}