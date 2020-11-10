package COR;

public class Director extends Leader{

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest request) {
		if(request.getMoney()<5){
			 System.out.println ("Success! " + "Transaction approved by: "  + this.name);
		}else{
			 System.out.println ( "Insufficient amount of funds.. Contact your bank for more information..");
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(request);
			}
		}
	}
}