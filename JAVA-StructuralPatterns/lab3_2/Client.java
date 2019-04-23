package lab3_2;

public class Client {

    public static void main(String[] args) {
        OutPut output=null;
        EncodingLanguage language=null;
        OperatingSystem system=null;
        if(output==null && language==null && system==null)
        {
            output=(OutPut)XMLUtil.getBean("OutPut");
            language=(EncodingLanguage)XMLUtil.getBean("EncodingLanguage");
            system=(OperatingSystem)XMLUtil.getBean("OperatingSystem");
        }
        system.setlanguage(language);
        language.setOutPut(output);
        system.type();
    }

}

