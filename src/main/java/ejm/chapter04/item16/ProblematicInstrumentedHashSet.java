package ejm.chapter04.item16;

import java.util.HashSet;
import java.util.Collection;

public class ProblematicInstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;
    
    public ProblematicInstrumentedHashSet() {
    }

    public ProblematicInstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
