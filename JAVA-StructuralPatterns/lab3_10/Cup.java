package lab3_10;

public abstract class Cup {
    protected Milk milk;
    public void setMilk(Milk milk){
        this.milk=milk;
    }
    public abstract void pack(String name);
}
