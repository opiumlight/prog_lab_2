package move.physical;
import ru.ifmo.se.pokemon.*;
import java.util.random.RandomGenerator;

// Razor Shell deals damage and has a 50% chance of lowering the target's Defense by one stage.
// Stats can be lowered to a minimum of -6 stages each.
public final class RazorShell extends PhysicalMove {
    private final RandomGenerator rng;

    public RazorShell() {
        super(Type.WATER, 75, 95);
        this.rng = RandomGenerator.getDefault();
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (this.rng.nextDouble() <= 0.5) {
            p.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override
    public String describe() {
        return "применяет Razor Shell";
    }
}
