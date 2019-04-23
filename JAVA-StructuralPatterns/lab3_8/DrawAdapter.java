package lab3_8;

public class DrawAdapter extends DrawCircle{
    private DrawAngle drawangle;
    public DrawAdapter(){

    }
    public DrawAdapter(DrawAngle angle){
        this.drawangle=angle;
    }
    public void insert(String msg){
        System.out.print("DrawCircle:");
        drawangle.insert(msg);
    }
}
