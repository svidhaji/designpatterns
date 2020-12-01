package prototype;

public class Clock implements Cloneable, Runnable {
    
    private Thread thread = null;
    private Prototype prototype;
    private Hour h;
    private Minute m;
    private Second s;
    
    public Clock(int h, int m, int s)
    {
        this.prototype = new Prototype();
        this.h = new Hour(h);
        this.m = new Minute(m);
        this.s = new Second(s);
    }

    public void setHour(int h)
    {
        this.h.setHour(h);
    }
    
    public int getHour()
    {
        return this.h.getHour();
    }
    
    public void setMinutes(int m)
    {
        this.m.setMinutes(m);
    }
    
    public int getMinutes()
    {
        return this.m.getMinutes();
    }
    
    public void setSeconds(int s)
    {
        this.s.setSeconds(s);
    }
    
    public int getSeconds()
    {
        return this.s.getSeconds();
    }
    
    public Clock clone()
    {
        Clock clock = null;
        
       try
        {
            clock = (Clock) super.clone();
            clock.prototype = (Prototype) prototype.clone();
        }
        catch (CloneNotSupportedException e)
        {
               e.printStackTrace();
        }
        
        return clock;
    }
    
    @Override
    public void run()
    {
         this.s.setSeconds(this.s.getSeconds() + 1);
         try
         {
             Thread.sleep(1000);
         }
         catch (InterruptedException e)
         {
             e.printStackTrace();
         }
         
         System.out.println(Thread.currentThread().getName() + ": " + this.h.getHour() + "." + this.m.getMinutes() + "." + this.s.getSeconds());
    }
}
