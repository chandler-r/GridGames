import java.util.Random;

public class RedPanda extends Pet{

    Random rand = new Random();
    private int x;
    private int instkill;

    public RedPanda(){
        super("Red Panda", 6, 5);
    }

    public void ability(Pet opponent){
        x = rand.nextInt(11);
        if (x >= 1 && x <= 6){
            // give friend hp
        }else if (x >= 7 && x <=9){
            this.hp += 4;
        }else if (x == 10){
            instkill = opponent.getHp();
            opponent.take_Damage(instkill);
        }
    }
}