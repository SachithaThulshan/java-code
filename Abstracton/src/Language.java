abstract class Language {
    Language(){
        System.out.println("Python Programming");
    }
    abstract void Programming();

    void branching(){
        System.out.println("Conditional");
    }
}
class Java extends Language {
    @Override
    void Programming() {
        System.out.println("Java Programming");
    }
}
class Test1 {
    public static void main(String[] args) {
        Language l = new Java();
        l.branching();
        l.Programming();
    }
}