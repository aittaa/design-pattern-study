package decorator.window;

public class DecoratorWindowTest {

    public static void main(String[] args) {

        Window w;
        w = new SimpleWindow();
        w = new VerticalScrollBarDecorator(w);
        w = new HorizontalScrollBarDecorator(w);

        w.draw();

    }

}
