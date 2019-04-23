package lab3_4;

public abstract class Add {
    private Book book;

    public Add(Book book){
        this.book=book;
    }

    public void borrowBook(){
        book.borrowBook();
    }

    public void returnBook(){
        book.returnBook();
    }
}
