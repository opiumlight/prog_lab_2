package pokemon;
import move.physical.RazorShell;
import move.physical.XScissor;
import move.status.BulkUp;
import move.status.HoneClaws;
import ru.ifmo.se.pokemon.*;

public final class Barbaracle extends Binacle {
    public Barbaracle (String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.WATER);
        setStats(72, 105, 115, 54, 86, 68);
        this.addMove(new HoneClaws());
        this.addMove(new XScissor());
        this.addMove(new RazorShell());
        this.addMove(new BulkUp());
    }
}
