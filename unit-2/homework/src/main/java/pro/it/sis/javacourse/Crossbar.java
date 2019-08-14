package pro.it.sis.javacourse;

public class Crossbar extends Weapon {
    public Crossbar(Damage damage) {
        super(damage);
    }

    @Override
    void hit(Target target) {
        System.out.println("Crossbar hits a target by ");
    }
}
