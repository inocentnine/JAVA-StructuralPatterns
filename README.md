# JAVA-StructuralPatterns

适配器模式(Adapter)

桥接模式(Bridge)

组合模式(Composite)

装饰模式(Decorator)

外观模式(Facade)

享元模式(Flyweight)

代理模式(Proxy)

1、使用Java语言实现一个双向适配器实例，使得猫可以学狗叫，狗可以学猫抓老鼠。

2、某日志记录器（Logger）既可以支持不同的操作系统，还可以支持多种编程语言，并且可以使用不同的输出方式。使用桥接模式设计该系统。

3、使用组合设计模式设计一个杀毒软件（AntiVirus）的框架，该软件既可以对某个文件夹（Folder）杀毒，也可以对某个指定的文件（File）进行杀毒，文件种类包括文本文件TextFile、图片文件ImageFile、视频文件VideoFile。

4、某图书管理系统中，书籍类（Book）具有借书方法borrowBook（）和还书方法returnBook（）。现需要动态给书籍对象添加冻结方法freeze（）和遗失方法lose（）。使用装饰模式设计该系统。

5、在计算机主机（Mainframe）中，只需要按下主机的开机按钮（on()），即可调用其他硬件设备和软件的启动方法，如内存（Memory）的自检（check()）、CPU的运行（run()）、硬盘（HardDisk）的读取（read()）、操作系统（OS）的载入（load()）等，如果某一过程发声错误则计算机启动失败。使用外观模式模拟该过程。

6、使用享元设计模式设计一个围棋软件，在系统中只存在一个白棋对象和一个黑棋对象，但是它们可以在棋盘的不同位置显示多次。要求使用简单工厂模式和单例模式实现享元工厂类的设计。

7、应用软件所提供的桌面快捷方式是快速启动应用程序的代理，桌面快捷方式一般使用一张小图片（Picture）来表示，通过调用快捷方式的run（）方法将调用应用软件（Application）的run（）方法。使用代理模式模拟该过程。

8、已知在一个绘图系统中有两个类，描述如下：

    public class DrawCircle {  
      
      public void DrawCircle() { …… }  
      
      public void insert(String msg){      
      
        System.out.println("DrawCircle insert():"+msg);   
        
      }   
      
      …… 
      
    }  
    
    public class DrawAngle {  
    
      public void DrawAngle() { …… }  
      
      public void insert(String msg){    
      
       System.out.println("DrawAngle insert():"+msg); 
       
      } 
      
       ……
       
     }
现在要在DrawCircle中调用DrawAngle的方法，可是类已经分发出去了，不能修改，如何用适配器模式解决这个问题，画出类关系图并说明采用的是哪种适配器模式？

9、假设存在一个Java定义的类Car，它的定义如下：

						public final class Car
            
						{
            
							public void move()
              
							{System.out.println("在陆地上移动！");}
              
						}
            
现在，有会飞的汽车，请给该汽车的对象动态添加会飞的功能。请采用合理的设计模式给出相关设计。

10、一杯咖啡，有中杯和大杯之分，同时还有加奶和不加奶之分。如果用单纯的继承，这四个具体实现(中杯大杯加奶不加奶)之间有概念重叠，因为有中杯加奶，也有中杯不加奶，如果再在中杯这一层再实现两个继承,很显然混乱，扩展性极差。请使用桥接模式进行设计。
