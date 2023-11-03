class EngCricket {
    void playing(){
        System.out.println("Bowling");
    }
}
class SLCricket extends EngCricket{
    void playing(){
        System.out.println("Batting");
    }
    void practising(){
        System.out.println("Fielding");
    }
    void selection(){
        super.playing();
        practising();
    }
}
class Run{
    public static void main(String[] args) {
        SLCricket slCricket = new SLCricket();
        slCricket.selection();
    }
}