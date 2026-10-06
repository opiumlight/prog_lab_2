package pokemon;
import move.physical.Facade;
import move.special.Acid;
import move.status.QuiverDance;
import move.status.SwordsDance;
import ru.ifmo.se.pokemon.*;

public final class Bellossom extends Gloom {
    public Bellossom(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(73, 95, 62, 85, 65, 85);
        this.addMove(new SwordsDance());
        this.addMove(new Facade());
        this.addMove(new Acid());
        this.addMove(new QuiverDance());
    }
}
