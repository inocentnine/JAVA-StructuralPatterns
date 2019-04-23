package lab3_2;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLUtil {
    //配置文件读取处理类
    public static Object getBean(String args)
    {
        try{
            //创建一个文档对象
            DocumentBuilderFactory  dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("configStructuralPatterns.xml"));
            //获取包含类名的文本节点
            NodeList n1=doc.getElementsByTagName("className");
            Node classnode = null;
            String className=null;
            if(args.equals("OutPut"))
            {
                classnode=n1.item(0).getFirstChild();
            }else if(args.equals("OperatingSystem"))
            {
                classnode=n1.item(1).getFirstChild();
            }else if(args.equals("EncodingLanguage"))
            {
                classnode=n1.item(2).getFirstChild();
            }
            className=classnode.getNodeValue();
            //通过类名生成实例对象并将其返回
            Class c=Class.forName("lab3_2."+className);//"lab3_2."+
            Object obj=c.newInstance();
            return obj;
        }catch(Exception e)
        {
            e.getStackTrace();
            return null;
        }

    }
}

