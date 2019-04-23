package lab3_6;

public class WhiteChess implements Chess{
    private String color;
    public WhiteChess(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void display(Position position){
        System.out.println("白棋 "+position.position());
    }
}
