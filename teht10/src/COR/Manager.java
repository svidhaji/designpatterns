package COR;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest request) {
		if(request.getMoney()>=5 && request.getMoney()<10){
			 System.out.println ("Success! " + "Transaction approved by: "  + this.name);
		}else{
			 System.out.println ("Insufficient amount of funds.. Contact your bank for more information..");
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(request);
			}
		}

	}

}
