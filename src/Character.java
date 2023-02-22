public class Character {
    private String name;
    private int speed;
    private String force;

    private String dexterity;
    private Weapon weapon;

    public Character(String name, int speed, String force, String dexterity) {
        this.name = name;
        this.speed = speed;
        this.force = force;
        this.dexterity = dexterity;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setForce(String force) {
        this.force = force;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getForce() {
        return force;
    }

    public String getDexterity() {
        return dexterity;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attack(){
    }

}
