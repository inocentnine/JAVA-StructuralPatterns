package lab3_8;

public class Client {
    public static void main(String[] args){

        //双向适配器模式
        CircleTarget circleTarget=new DrawCircle();
        AngleTarget angleTarget=new DrawAngle();
        String msg="边";
        circleTarget.insert(msg);
        angleTarget.insert(msg);
        System.out.println("---------------------");
        Adapter adapter=new Adapter(circleTarget,angleTarget);
        adapter.insert(msg);


        //对象适配器模式
        DrawAngle drawAngle=new DrawAngle();
        DrawCircle drawCircle=(DrawCircle)new DrawAdapter(drawAngle);
        drawCircle.insert("边");
    }
}
