public class LaneWorldRunner {

    public static void main(String[] args){
        RedPanda rp1 = new RedPanda();
        RedPanda rp2 = new RedPanda();
        System.out.println(rp1);
        System.out.println(rp2);
        rp1.battle(rp2);
        rp2.battle(rp1);
        System.out.println(rp1);
        System.out.println(rp2);
    }
    
}
