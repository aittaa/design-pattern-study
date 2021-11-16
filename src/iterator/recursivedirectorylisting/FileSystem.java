package iterator.recursivedirectorylisting;

import java.io.File;
import java.util.Iterator;
import java.util.Stack;

public class FileSystem {
    Stack<Iterator<Component>> stack = new Stack<Iterator<Component>>();

    public FileSystem(String pathname){

        stack.push(init(pathname));
    }

    private Iterator<Component> init(String pathname) {

        File rootDirFile = new File(pathname);
        return new Directory(rootDirFile).createIterator();

    }

    public Component next(){
        if(hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            if (component instanceof Directory) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext(){
        if (stack.empty()) {
            return false;
        } else {
            Iterator<Component> iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
