package pro.it.sis.javacourse;

//public abstract class Damage {
//    private int value;
//
//    protected Damage(int value) {
//        this.value = value;
//    }
//}

public abstract class Damage {
    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;

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
