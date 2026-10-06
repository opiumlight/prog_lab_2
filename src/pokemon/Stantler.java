package pokemon;
import move.physical.Facade;
import move.status.Confide;
import ru.ifmo.se.pokemon.*;
import move.status.Rest;
import move.status.CalmMind;

public final class Stantler extends Pokemon {
    public Stantler(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(73, 95, 62, 85, 65, 85);
        this.addMove(new Rest());
        this.addMove(new Confide());
        this.addMove(new Facade());
        this.addMove(new CalmMind());
    }
}
