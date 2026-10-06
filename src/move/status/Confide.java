package move.status;
import ru.ifmo.se.pokemon.*;

// Confide lowers the target's Special Attack by one stage.
// Stats can be lowered to a minimum of -6 stages each.
public final class Confide extends StatusMove {
    public Confide() {
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    public String describe() {
        return "применяет Confide";
    }
}
