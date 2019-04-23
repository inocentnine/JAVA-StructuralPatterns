package lab3_1;

public class Adapter {
    private DogTarget dog;
    private CatTarget cat;

    public Adapter(DogTarget dogtarget,CatTarget cattarget)
    {
        this.dog = dogtarget;
        this.cat = cattarget;
    }

    public void wang(){
        System.out.print("狗模仿猫：");
        cat.catchMouse();
    }
    public void catchMouse(){
        System.out.print("猫模仿狗：");
        dog.wang();
    }
}
