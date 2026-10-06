package move.status;
import ru.ifmo.se.pokemon.*;

// User sleeps for 2 turns, but user is fully healed.
public final class Rest extends StatusMove {
    public Rest() {
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.setMod(Stat.HP, (int) -(p.getStat(Stat.HP)-p.getHP()));
    }

    @Override
    public String describe() {
        return "применяет Rest";
    }
}
