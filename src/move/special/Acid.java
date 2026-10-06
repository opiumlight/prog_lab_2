package move.special;
import java.util.random.RandomGenerator;
import ru.ifmo.se.pokemon.*;

// Acid deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
// Stats can be lowered to a minimum of -6 stages each.
public final class Acid extends SpecialMove {
    private final RandomGenerator rng;

    public Acid() {
        super(Type.POISON, 40, 100);
        this.rng = RandomGenerator.getDefault();
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (this.rng.nextDouble() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    public String describe() {
        return "применяет Acid";
    }
}
