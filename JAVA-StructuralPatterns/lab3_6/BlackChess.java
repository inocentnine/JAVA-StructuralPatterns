package lab3_6;

public class BlackChess implements Chess{
        private String color;
    public  BlackChess(String color){
            this.color=color;
        }
        public String getColor(){
            return this.color;
        }
        public void display(Position position){
            System.out.println("黑棋 "+position.position());
        }
}
