package abstractfactory.gui;

public class WindowsButton implements Button {

    public void paint() {
        System.out.println("Windows Button");
    }

    @Override
    public String toString() {
        return "WindowsButton{}";
    }
}