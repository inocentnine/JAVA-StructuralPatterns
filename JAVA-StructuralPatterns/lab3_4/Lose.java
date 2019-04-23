package lab3_4;

public class Lose extends Add{
    public Lose(Book book){
        super(book);
        System.out.println("遗失书");
    }
    public void lose(){
        System.out.println("书被遗失");
    }
}
