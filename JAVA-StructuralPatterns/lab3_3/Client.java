package lab3_3;

public class Client {
    public static void main(String[] args){
        AntiVirus obj1,obj2,obj3,obj4,obj5;
        Folder f1,f2,f3;

        obj1=new TextFile();
        obj2=new ImageFile();
        f1=new Folder();
        f1.add(obj1);
        f1.add(obj2);

        obj3=new VideoFile();
        obj4=new VideoFile();
        f2=new Folder();
        f2.add(obj3);
        f2.add(obj4);

        obj5=new TextFile();
        f3=new Folder();
        f3.add(f1);
        f3.add(f2);
        f3.add(obj5);

        f3.killVirus();
    }
}
