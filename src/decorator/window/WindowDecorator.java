package decorator.window;

public class WindowDecorator implements Window{
    protected Window wrappedWindow;

    public WindowDecorator(Window w){
        wrappedWindow = w;
    }

    public void draw(){
        wrappedWindow.draw();
    }

}
