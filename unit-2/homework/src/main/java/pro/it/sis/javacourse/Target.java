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
//        physicalDamage= damage.getPhysicalDamage();
//        fireDamage = damage.getFireDamage();
//        iceDamage = damage.getIceDamage();
    }

    public void reset() {
        physicalDamage = 0;
        fireDamage = 0;
        iceDamage = 0;
    }
}
