class Trees {
    void gain(){
        System.out.println("Growing ");
    }
}
class Mango extends Trees{
    void gain(){
        System.out.println("Growing Slow");
    }
    public static void main(String[] args) {
        Mango m = new Mango();
        m.gain();
    }
}