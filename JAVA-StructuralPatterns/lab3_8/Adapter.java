package lab3_8;

public class Adapter {
    private CircleTarget circleTarget;
    private AngleTarget angleTarget;

    public Adapter(CircleTarget circleTarget,AngleTarget angleTarget){
        this.circleTarget=circleTarget;
        this.angleTarget=angleTarget;
    }

    public void insert(String msg){
        System.out.println("DrawCircle: ");
        angleTarget.insert(msg);
    }
}
