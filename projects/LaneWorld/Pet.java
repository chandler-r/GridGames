import info.gridworld.actor.Actor;

abstract class Pet extends Actor{

    //Fields
    protected String name;
    protected int hp;
    protected int attk;

    // Constructor
    public Pet(String name, int hp, int attk){
        this.name = name;
        this.attk = attk;
        this.hp = hp;
    }

    // Getters and Setters
    public int getHp(){
        return hp;
    }

    public int getAttk(){
        return attk;
    }

    public void changeHp(int dHp){
        hp +=dHp;
        if (dHp > 0){
            // heal
        }
    }

    public void changeAttk(int dAttk){
        hp += dAttk;
        if (dAttk > 0){
            // boost attack
        }
    }


    public void take_Damage(int dmg){
        hp -= (dmg - def);
        if (hp <= 0){
            //remove from world
        }
    }


    public int calculateDamage(Pet opponent){
        return atk - opponent.getDef();
    }

    public void battle(Pet opponent){
        int dmg = opponent.calculateDamage(this);
        this.take_Damage(dmg);
    }

    abstract void ability();

}