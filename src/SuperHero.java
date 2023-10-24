public abstract class SuperHero {


    public int health;

    public int energy;

    public SuperHero(int health, int energy) {
        this.health = health;
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


}
