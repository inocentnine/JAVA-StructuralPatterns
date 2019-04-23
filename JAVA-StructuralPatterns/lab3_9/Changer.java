package lab3_9;

public class Changer implements _Car{
    private _Car car;
    public Changer(_Car car){
        this.car=car;
    }
    public void move(){
        car.move();
    }
}
