class centralBank {
    int getRateInterest(){
        return 2;
    }
}
class BOC extends centralBank{
    @Override
    int getRateInterest() {
        return 5;
    }
}
class  HNB extends centralBank{
    @Override
    int getRateInterest() {
        return 7;
    }
}
class NSB extends centralBank{
    @Override
    int getRateInterest() {
        return 9;
    }
}
class testOverride{
    public static void main(String[] args) {
        BOC b = new BOC();
        HNB h = new HNB();
        NSB n = new NSB();
        System.out.println("BOC Rate of Interest : " + b.getRateInterest());
        System.out.println("HNB Rate of Interest : " + h.getRateInterest());
        System.out.println("NSB Rate of Interest : " + n.getRateInterest());
    }
}