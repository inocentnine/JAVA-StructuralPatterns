package lab3_2;

public abstract class EncodingLanguage {
    OutPut output;
    public void setOutPut(OutPut output){
        this.output=output;
    }
    public abstract void language(String system);
}
