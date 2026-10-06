package move.status;
import ru.ifmo.se.pokemon.*;

// Quiver Dance raises the user's Special Attack, Special Defense and Speed by one stage each.
// Stats can be raised to a maximum of +6 stages each.
public final class QuiverDance extends StatusMove {
    public QuiverDance() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
        p.setMod(Stat.SPEED, 1);
    }

    @Override
    public String describe() {
        return "применяет Quiver Dance";
    }
}
