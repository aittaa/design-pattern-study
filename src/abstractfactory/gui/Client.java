package abstractfactory.gui;

public class Client {

    public static void main(String[] args) {
        GUIFactory winFact = new WinFactory();
        GUIFactory osxFact = new OSXFactory();

        Button button = winFact.createButton();
        System.out.println("button = " + button);
        Button button1 = osxFact.createButton();
        System.out.println("button1 = " + button1);

        Window window = winFact.createWindow();
        System.out.println("window = " + window);
        Window window1 = osxFact.createWindow();
        System.out.println("window1 = " + window1);
    }

}