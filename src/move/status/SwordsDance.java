package move.status;
import ru.ifmo.se.pokemon.*;

// Swords Dance raises the user's Attack by two stages.
// Stats can be raised to a maximum of +6 stages each.
public final class SwordsDance extends StatusMove {
    public SwordsDance() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    public String describe() {
        return "применяет Swords Dance";
    }
}
