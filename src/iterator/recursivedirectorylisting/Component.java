package iterator.recursivedirectorylisting;

import java.util.Iterator;

public interface Component {
    public String getName();
    public Component getChild(int idx);

    Iterator<Component> createIterator();
}
