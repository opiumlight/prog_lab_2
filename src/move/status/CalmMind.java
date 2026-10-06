package move.status;
import ru.ifmo.se.pokemon.*;

// Calm Mind raises the user's Special Attack and Special Defense by one stage each.
// Stats can be raised to a maximum of +6 stages each.
public final class CalmMind extends StatusMove {
    public CalmMind() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    @Override
    public String describe() {
        return "применяет Calm Mind";
    }
}
