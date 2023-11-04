class Country {
    void naming(){

    }
}
class SriLanka extends Country{
    @Override
    void naming() {
        System.out.println("Sri Lanka");
    }
}
class India extends Country{
    @Override
    void naming() {
        System.out.println("India");
    }
}

class test2{
    public static void main(String[] args) {
        Country c, c1;
        c = new SriLanka();
        c1 = new India();
        c.naming();
        c1.naming();
    }
}