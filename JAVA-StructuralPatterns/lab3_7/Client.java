package lab3_7;

public class Client {
    public static void main(String[] args){
        Software software;
        software=(Software)XMLUtil.getBean();
        software.run();
    }
}
