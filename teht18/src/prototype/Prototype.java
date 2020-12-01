package prototype;

public class Prototype implements Cloneable {
    
    public Prototype(){}
    
    public Object clone()
    {
      try
        {
           return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
}
