package ejm.chapter06.item33;

import java.util.Map;
import java.util.EnumMap;

public enum Transition {

    MELT(Phase.SOLID, Phase.LIQUID), FREEZE(Phase.LIQUID, Phase.SOLID),
    BOIL(Phase.LIQUID, Phase.GAS), CONDENSE(Phase.GAS, Phase.LIQUID),
    SUBLIME(Phase.SOLID, Phase.GAS), DEPOSIT(Phase.GAS, Phase.SOLID);

    final Phase src;
    final Phase dest;

    private Transition(Phase src, Phase dest) {
        this.src = src;
        this.dest = dest;
    }

    private static final Map<Phase, Map<Phase, Transition>> transitionMap = 
        new EnumMap<>(Phase.class);

    static {
        for (Phase p : Phase.values()) {
            transitionMap.put(p, new EnumMap<>(Phase.class));
        }

        for (Transition t : Transition.values()) {
            transitionMap.get(t.src).put(t.dest, t);
        }

    }

    public static Transition from(Phase src, Phase dest) {
        return transitionMap.get(src).get(dest);
    }
        
}
