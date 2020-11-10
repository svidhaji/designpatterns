package COR;

public class Main {
	
	public static void main(String[] args) {
		 Leader l1 = new Director ("Joe Biden");
		 Leader l2 = new Manager ("John Lennon");
		 Leader l3 = new CEO ("Harry Saunders");
		 Leader l4 = new GeneralManager ("John Cena");
		 
		l1.setNextLeader(l2);
		l2.setNextLeader(l3);
		l3.setNextLeader(l4);
		 
		 PurchaseRequest p = new PurchaseRequest (50.25, "to participate in the seminar of the United States", "Joe Rogan");
		 System.out.println ( "Employee " + p.getName () + " needs " + p.getMoney () + "€" + ", the reason is :" + p.getReason ());
		 System.out.println ( "----Purchasing.....----");
		l1.handleRequest(p);
		
		 PurchaseRequest p2 = new PurchaseRequest (100, "to fly to Japan", "Pete Lau");
		 System.out.println ( "Employee " + p.getName () + " needs " + p.getMoney () + "€" + ", the reason is :" + p.getReason ());
		 System.out.println ( "----Purchasing.....----");
		l2.handleRequest(p2);
		
		 PurchaseRequest p3 = new PurchaseRequest (2500.000, "bying new flat", "Kamala Harris");
		 System.out.println ( "Employee " + p.getName () + " needs " + p.getMoney () + "€" + ", the reason is :" + p.getReason ());
		 System.out.println ( "----Purchasing.....----");
		l4.handleRequest(p3);
	}
}
