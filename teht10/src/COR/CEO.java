package COR;

public class CEO extends Leader {

	public CEO(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest request) {
		if(request.getMoney()>=10 && request.getMoney()<20){
			 System.out.println ("Success! " + "Transaction approved by: "  + this.name);
		}else{
			 System.out.println ( "Insufficient amount of funds. Please try again!");
			if(this.nextLeader!=null){
				this.nextLeader.handleRequest(request);
			}
		}

	}

}
