package lab3_9;

public class Fly extends Changer{
    public Fly(_Car car){
        super(car);
    }
    public void fly(){
        System.out.println("汽车会飞！");
    }
}
