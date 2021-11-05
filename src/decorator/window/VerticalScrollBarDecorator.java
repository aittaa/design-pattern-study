package decorator.window;

public class VerticalScrollBarDecorator extends WindowDecorator {

    public VerticalScrollBarDecorator(Window w){
        super(w);
    }

    public void draw(){
        super.draw();
        System.out.println("수직 스크롤바");
    }
}
