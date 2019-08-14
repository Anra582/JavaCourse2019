package pro.it.sis.javacourse;

import org.junit.Test;

import java.nio.file.Watchable;

import static org.junit.Assert.*;

public class WeaponTest {

    @Test
    public void testCrossbarPhysicalDamage() {

        Target t = new Target();
        Weapon w = new Crossbar(new Damage(100, 0, 0));
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
    }

    @Test
    public void testCrossbarFireDamage() {

        Target t = new Target();
        Weapon w = new Crossbar(new Damage(100, 100, 0));
        w.hit(t);

        assertEquals(100, t.getFireDamage());
    }

    @Test
    public void testCrossbarIceDamage() {

        Target t = new Target();
        Weapon w = new Crossbar(new Damage(100, 0, 100));
        w.hit(t);

        assertEquals(100, t.getIceDamage());
    }

    @Test
    public void testSwordPhysicalDamage() {

        Target t = new Target();
        Weapon w = new Sword(new Damage(100, 0, 0));
        w.hit(t);

        assertEquals(100, t.getPhysicalDamage());
    }

    @Test
    public void testSwordFireDamage() {

        Target t = new Target();
        Weapon w = new Sword(new Damage(100, 100, 0));
        w.hit(t);

        assertEquals(100, t.getFireDamage());
    }

    @Test
    public void testSwordIceDamage() {

        Target t = new Target();
        Weapon w = new Sword(new Damage(100, 0, 100));
        w.hit(t);

        assertEquals(100, t.getIceDamage());
    }
}