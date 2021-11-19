package abstractfactory.gui;

public class WindowsWindow implements Window {

    public void paint() {
        System.out.println("Windows window");
    }

    @Override
    public String toString() {
        return "WindowsWindow{}";
    }
}