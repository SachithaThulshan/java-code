abstract class Bank {
    abstract  int interestRate();
}
class BOC extends Bank {
    @Override
    int interestRate() {
        return 8;
    }
}
class HNB extends  Bank{
    @Override
    int interestRate() {
        return 10;
    }
}
class Test{
    public static void main(String[] args) {
        Bank b;
        b = new BOC();
        System.out.println("BOC Rate of Interest : " + b.interestRate() + "%");
        b = new HNB();
        System.out.println("HNB Rate of Interest : " + b.interestRate() + "%");
    }

}