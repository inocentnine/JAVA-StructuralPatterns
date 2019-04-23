package lab3_2;

public abstract class OperatingSystem {
    EncodingLanguage encodinglanguage;
    public void setlanguage(EncodingLanguage lang)
    {
        this.encodinglanguage=lang;
    }
    public abstract void type();
}
