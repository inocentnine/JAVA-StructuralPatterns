package lab3_1;

public class Client {
    public static void main(String[] args){
        DogTarget dog = new ConcreteDog();
        CatTarget cat = new ConcreteCat();
        dog.wang();
        cat.catchMouse();
        Adapter adapter = new Adapter(dog,cat);
        adapter.catchMouse();
        adapter.wang();
    }
}
