package lab3_4;

public class Freeze extends Add{
    public Freeze(Book book){
        super(book);
        System.out.println("冻结书");
    }
    public void freeze(){
        System.out.println("书被冻结");
    }
}
