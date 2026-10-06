package move.physical;
import ru.ifmo.se.pokemon.*;

// X-Scissor deals damage with no additional effect.
public final class XScissor extends PhysicalMove {
    public XScissor() {
        super(Type.BUG, 80, 100);
    }

    @Override
    public String describe() {
        return "применяет X-Scissor";
    }
}
