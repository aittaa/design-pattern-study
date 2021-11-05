package decorator.window;

public class HorizontalScrollBarDecorator extends WindowDecorator {
    public HorizontalScrollBarDecorator(Window w){
        super(w);
    }
    public void draw(){
        super.draw();
        System.out.println("수평 스크롤바");
    }
}
