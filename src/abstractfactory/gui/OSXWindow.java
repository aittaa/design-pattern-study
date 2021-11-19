package abstractfactory.gui;


public class OSXWindow implements Window {
    public void paint() {
        System.out.println("OSX Window");
    }

    @Override
    public String toString() {
        return "OSXWindow{}";
    }
}