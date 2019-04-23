package lab3_5;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private HardDisk hardDisk;
    private OS os;

    public Mainframe(){
        memory=new Memory();
        cpu=new CPU();
        hardDisk=new HardDisk();
        os=new OS();
    }

    public void on(){
        memory.check();
        cpu.run();
        hardDisk.read();
        os.load();
        System.out.println("主机开机成功");
    }

    public void off(){
        memory.checkError();
        cpu.runError();
        hardDisk.readError();
        os.loadError();
        System.out.println("主机启动失败");
    }
}
