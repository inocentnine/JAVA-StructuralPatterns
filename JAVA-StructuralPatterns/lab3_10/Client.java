package lab3_10;

public class Client {
    public static void main(String[] args){
        Milk milk;
        Cup cup;

        milk=(Milk)XMLUtil.getBean("Milk");
        cup=(Cup)XMLUtil.getBean("Cup");

        cup.setMilk(milk);
        cup.pack("coffee");
    }
}
