package prototype;

public class Main {

	public static void main(String[] args) {
		Clock original = new Clock(1, 44, 22);
	    Clock clone = original.clone();   
	     
	    System.out.println("Original clock: " + original.getHour() + "." + original.getMinutes() + "." + original.getSeconds());
	    System.out.println("Clone: " + clone.getHour() + "." + clone.getMinutes() + "." + clone.getSeconds());
	        
	    System.out.println("----");
	        
	    Thread t1 = new Thread((Runnable)original);
	    t1.setName("Original");

	    Thread t2 = new Thread((Runnable)clone);
	    t2.setName("Clone");
	        
	    t1.start();
	    t2.start();

	}

}
