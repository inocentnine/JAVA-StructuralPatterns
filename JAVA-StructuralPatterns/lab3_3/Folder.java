package lab3_3;

import java.util.ArrayList;

public class Folder extends AntiVirus{
    private ArrayList list=new ArrayList();

    public void add(AntiVirus antiVirus){
        list.add(antiVirus);
    }

    public void remove(AntiVirus antiVirus){
        list.remove(antiVirus);
    }

    public void killVirus(){
        for(Object object:list){
            ((AntiVirus)object).killVirus();
        }
    }
}
