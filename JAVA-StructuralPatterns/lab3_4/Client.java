package lab3_4;

public class Client {
    public static void main(String[] args){
        Book book1;
        book1=new Abook();
        book1.borrowBook();
        book1.returnBook();
        System.out.println("-----------------");
        Freeze book2=new Freeze(book1);
        book2.borrowBook();
        book2.returnBook();
        book2.freeze();
        System.out.println("--------------------------------");
        Book book3;
        book3=new Abook();
        book3.borrowBook();
        book3.returnBook();
        System.out.println("-----------------");
        Lose book4=new Lose(book3);
        book4.borrowBook();
        book4.returnBook();
        book4.lose();
    }
}
