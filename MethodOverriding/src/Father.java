class Father {
    void son(){
        System.out.println("Father's Son ");
    }
}
class Mother extends Father{
    @Override
    void son() {
        System.out.println("Mother's Son");
    }
}
class Test1{
    public static void main(String[] args) {
        Mother m = new Mother();
        m.son();
    }
}