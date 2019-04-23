package lab3_9;

public class Client {
    public static void main(String[] args){
        _Car car;
        car=new Car();
        car.move();
        Fly carfly=new Fly(car);
        System.out.println("----------------");
        carfly.move();
        carfly.fly();
    }
}
