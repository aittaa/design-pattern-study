package iterator.recursivedirectorylisting;

import java.io.File;
import java.util.Iterator;

public class Leaf implements Component{

    File file;

    public Leaf(File f) {
       this.file = f;
    }

    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public Component getChild(int idx) {
        return null;
    }

    @Override
    public Iterator<Component> createIterator() {
        return null;
    }

}