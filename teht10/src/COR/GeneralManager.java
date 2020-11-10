package COR;
 
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest request) {
		if (request.getMoney() >= 20) {
			 System.out.println ("Success! " + "Transaction approved by: "  + this.name);
		}
	}

}
