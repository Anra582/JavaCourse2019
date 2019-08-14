package pro.it.sis.javacourse;

public class Target {

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    private int physicalDamage;

    private int fireDamage;

    private int iceDamage;

    public void takeDamage(Damage damage) {
        this.physicalDamage= damage.getPhysicalDamage();
        this.fireDamage = damage.getFireDamage();
        this.iceDamage = damage.getIceDamage();
    }

    public void reset() {
        this.physicalDamage = 0;
        this.fireDamage = 0;
        this.iceDamage = 0;
    }
}
