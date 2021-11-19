package abstractfactory.gui;


public class OSXFactory implements GUIFactory {

    public Button createButton() {
        return new OSXButton();
    }

    public Window createWindow() {
        return new OSXWindow();
    }

}