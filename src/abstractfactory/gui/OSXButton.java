package abstractfactory.gui;


public class OSXButton implements Button {

    public void paint() {
        System.out.println("OSX button");
    }

    @Override
    public String toString() {
        return "OSXButton{}";
    }
}