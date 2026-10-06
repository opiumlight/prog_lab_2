package move.status;
import ru.ifmo.se.pokemon.*;

// Bulk Up raises the user's Attack and Defense by one stage each.
// Stats can be raised to a maximum of +6 stages each.
public final class BulkUp extends StatusMove {
    public BulkUp() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.DEFENSE, 1);
    }

    @Override
    public String describe() {
        return "применяет Bulk Up";
    }
}
