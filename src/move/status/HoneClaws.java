package move.status;
import ru.ifmo.se.pokemon.*;

// Hone Claws raises the user's Attack and Accuracy by one stage each.
// Stats can be raised to a maximum of +6 stages each.
public final class HoneClaws extends StatusMove {
    public HoneClaws() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.ACCURACY, 1);
    }

    @Override
    public String describe() {
        return "применяет Hone Claws";
    }
}
