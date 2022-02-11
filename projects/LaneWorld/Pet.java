import info.gridworld.actor.Actor;

abstract class Pet extends Actor{

    //Fields
    protected String name;
    protected int hp;
    protected int atk;

    // Constructor
    public Pet(String name, int hp, int atk){
        this.name = name;
        this.atk = atk;
        this.hp = hp;
    }

    public String toString(){  
        return String.format("Name: %s\tHP: %d\tATK: %d", name, hp, atk);
    }

    // Getters and Setters
    public int getHp(){
        return hp;
    }

    public int getAtk(){
        return atk;
    }

    public void changeHp(int dHp){
        this.hp += dHp;
    }

    public void changeAtk(int dAtk){
        this.atk += dAtk;
    }

    public boolean isDead(int hp){
        if (hp <= 0){
            return true;
        }
        return false;
    }


    public void take_Damage(int dmg){
        hp -= dmg;
        if (hp <= 0){
            //remove from world
        }
    }


    public int calculateDamage(Pet opponent){
        return this.atk;
    }

    public void battle(Pet opponent){
        int dmg = this.calculateDamage(opponent);
        opponent.take_Damage(dmg);
    }

    public abstract void ability(Pet opponent);

}