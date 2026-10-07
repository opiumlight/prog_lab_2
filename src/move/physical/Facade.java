package move.physical;
import ru.ifmo.se.pokemon.*;

// Facade deals damage, and hits with double power (140) if the user is burned, poisoned or paralyzed.
// In the case of a burn, the usual attack-halving still occurs so Facade hits with an effective power of 70.
public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    public double calcBaseDamage(Pokemon att, Pokemon def) {
       switch (att.getCondition()) {
           case POISON, PARALYZE, BURN -> {
               return super.calcBaseDamage(att, def) * 2;
           }
           default -> {
               return super.calcBaseDamage(att, def);
           }
       }
    }

    @Override
    public String describe() {
        return "применяет Facade";
    }
}
