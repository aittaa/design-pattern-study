package iterator.recursivedirectorylisting;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class Directory implements Component{
    File file;
    ArrayList<Component> children;

    public Directory(File dirFile) {

        file = dirFile;

        children =  new ArrayList<Component> ();

        File [] childrenList = file.listFiles();
        if (childrenList != null) {
            for (File f : childrenList) {
                if (f.isDirectory()) {
                    children.add(new Directory(f));
                } else {
                    children.add(new Leaf(f));
                }
            }
        }

    }


    @Override
    public String getName() {
        return file.getName();
    }

    @Override
    public Component getChild(int idx) {
        return children.get(idx);
    }

    @Override
    public Iterator<Component> createIterator() {
        return children.iterator();
    }
}
