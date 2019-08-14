package pro.it.sis.javacourse;

public class Damage {
    private final int physicalDamage;
    private final int fireDamage;
    private final int iceDamage;

    public Damage(int physicalDamage, int fireDamage, int iceDamage) {
        this.physicalDamage = physicalDamage;
        this.fireDamage = fireDamage;
        this.iceDamage = iceDamage;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }
}
